package Capa_Negocio;

/**
 *
 * @author Kevin Muñiz
 */

import java.net.Socket;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CorreoActivosMantenimientoProgramado {
    
    private  static final String cadena = "jdbc:postgresql://localhost:5432/ControlActivosInformaticos";
    private  static final String usuario = "postgres";
    private  static final String contrasenia = "12345";        
    
    public static boolean comprobarConexion(){
        String dirWeb = "www.lineadecodigo.com";
        int puerto = 587;
        try{
            Socket s = new Socket(dirWeb, puerto);    
            if(s.isConnected()){
            System.out.println("Conexión establecida con la dirección: " +  dirWeb + " a travéz del puerto: " + puerto);
            return true;
            }
        }catch(Exception e){
            System.err.println("No se pudo establecer conexión con: " + dirWeb + " a travez del puerto: " + puerto);
            return false;
        }
        return false;
    };

    public static String tomarActivosPasados(){
        String Mensaje=""; 
        int id=0;        
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();                
                String sql = "select * from activos;";                     
                ResultSet resultSet = st.executeQuery(sql);                
                Mensaje = "Los siguientes equipos necesitan un proceso de Mantenimiento: \n";
                while(resultSet.next()){                      
                    String descripcion= resultSet.getString("descripcion");
                    String nombre= resultSet.getString("nombre_tipoactivo");
                    String marca= resultSet.getString("marca_activo");
                    String modelo= resultSet.getString("modelo_activo");                
                    Mensaje+="  - Area de "+descripcion+". Activo: "+nombre+"  Marca: "+marca+"  Modelo: "+modelo+" \n";                    
                }                                   
                resultSet.close();                
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        //JOptionPane.showMessageDialog(null, Mensaje);
        if(Mensaje.length() <= 63)
        {
            Mensaje = "No";
        }
        return(Mensaje);
    }
    
    public static String obtenercorreoadmin()
    {
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();                
                String sql = "select per.correo_persona from tmaepercon per inner join tmaeusucon usu on usu.id_persona = per.id_persona where usu.nombre_usuario = 'admin_mantenimiento'";
                ResultSet resultSet = st.executeQuery(sql);       
                resultSet.next();
                    String mensaje= resultSet.getString("correo_persona");
                resultSet.close();                
                st.close();
                conex.close();                
                return (mensaje);
            }catch(Exception exc){                
                return(exc.getMessage());
            }                     
    }
    
     public static void SendMail() {
        if ((comprobarConexion())&&(!tomarActivosPasados().equals("No"))){
           Properties props = new Properties();
           props.put("mail.smtp.auth", "true");
           props.put("mail.smtp.starttls.enable", "true");
           props.put("mail.smtp.host", "smtp.gmail.com");
           props.put("mail.smtp.port", "587");
           final String Username = "controlactivosfacci@gmail.com" ;
           final String PassWord = "controlactivosfacci2016";
           String To =obtenercorreoadmin();           
           String Subject = "Mantenimiento";
           String Mensage = tomarActivosPasados();

           Session session = Session.getInstance(props,
                   new javax.mail.Authenticator() {
                       @Override
                       protected PasswordAuthentication getPasswordAuthentication() {
                           return new PasswordAuthentication(Username, PassWord);
                       }
                   });

           try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(Username));
                message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(To));
                message.setSubject(Subject);
                message.setText(Mensage);
                Transport.send(message);               
           } catch (MessagingException e) {
               throw new RuntimeException(e);
           }
       }
    }  
}