package Capa_Validaciones;

import javax.swing.JOptionPane;
import CapaInterfaces.Ingreso;
import java.sql.Connection;
import Capa_ConexionBD.Conexion;

public class Validaciones {
    //Esta funcion se utiliza para validar tanto modelo como serie en activos
    public static String validarmayusculasynumeros(String texto){
        String validos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        int i,j,coinci = 0;
        String cadena = texto;
        String mensaje="";
        for (j = 0; j <= cadena.length(); j++) {
            for (i = 0; i < validos.length(); i++) {
                
                if (cadena.charAt(j) == validos.charAt(i)) {
                    coinci++;
                    
                }
                
            }
            
        }
        if (cadena.length() == coinci) {
            System.out.println("todos los caracteres son validos");
            mensaje="caracteres correctos";
        } else {
            System.out.println("hay al menos algún caracter que no es valido. Solo se consideran validos los siguientes carecteres" + "  " + validos);
            mensaje="hay al menos algún caracter que no es valido. Solo se consideran validos los siguientes carecteres "+validos;
            
        }
        return mensaje;
    }
    //Esta funcion se utiliza para validar el codigo de oficio interno
    public static String validarmaynumguion(String texto){
        String validos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-";
        
        int i,j,coinci = 0;
        String cadena = texto;
        String mensaje="";
        for (j = 0; j <= cadena.length(); j++) {
            for (i = 0; i < validos.length(); i++) {
                
                if (cadena.charAt(j) == validos.charAt(i)) {
                    coinci++;
                    
                }
                
            }
            
        }
        if (cadena.length() == coinci) {
            System.out.println("todos los caracteres son validos");
            mensaje="caracteres correctos";
            
        } else {
            
            System.out.println("hay al menos algún caracter que no es valido. Solo se consideran validos los siguientes carecteres" + "  " + validos);
            mensaje="hay al menos algún caracter que no es valido. Solo se consideran validos los siguientes carecteres "+validos;
            
        }
        return mensaje;
    }
    //Esta funcion se utiliza para validar el codigo institucional
    public static String validarmayminnumguion(String texto){
        String validos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-";
        
        int i,j,coinci = 0;
        String cadena = texto;
        String mensaje="";
        for (j = 0; j <= cadena.length(); j++) {
            for (i = 0; i < validos.length(); i++) {
                
                if (cadena.charAt(j) == validos.charAt(i)) {
                    coinci++;
                    
                }
                
            }
            
        }
        if (cadena.length() == coinci) {
            System.out.println("todos los caracteres son validos");
            mensaje="caracteres correctos";
            
        } else {
            
            System.out.println("hay al menos algún caracter que no es valido. Solo se consideran validos los siguientes carecteres" + "  " + validos);
            mensaje="hay al menos algún caracter que no es valido. Solo se consideran validos los siguientes carecteres "+validos;
            
        }
        return mensaje;
    }
    
    //validar email
    public static String validarEmail(String texto) {
//            String mydomain = "javahungry@blogspot.com";
        String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Boolean coincide = texto.matches(emailregex);
        String mensaje = "";
        if (coincide) {
            System.out.println("Correo válido");
            
        }else{ 
            System.out.println("Correo inválido");
            mensaje = "Ingrese un correo válido0";
        }
        return mensaje;        
    }
    
    
    
    
    
    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

        if (cedula.length() == 10) // ConstantesApp.LongitudCedula
        {
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
        if (tercerDigito < 6) {
            // Coeficientes de validación cédula
            // El decimo digito se lo considera dígito verificador
             int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
             int verificador = Integer.parseInt(cedula.substring(9,10));
             int suma = 0;
             int digito = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                 digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                 suma += ((digito % 10) + (digito / 10));
                }

            if ((suma % 10 == 0) && (suma % 10 == verificador)) {
             cedulaCorrecta = true;
            }
            else if ((10 - (suma % 10)) == verificador) {
             cedulaCorrecta = true;
            } else {
             cedulaCorrecta = false;
            }
        } else {
        cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } catch (NumberFormatException nfe) {
        cedulaCorrecta = false;
        } catch (Exception err) {
        //System.out.println("Una excepcion ocurrio en el proceso de validadcion");
        cedulaCorrecta = false;
        }
 
    if (!cedulaCorrecta) {
    //System.out.println("La Cédula ingresada es Incorrecta");
    }
    return cedulaCorrecta;
    }

    
    
    
  //PaulDelgado
  //Metodo que valida la complejidad de un campo contraseña
     public boolean ComplejidadClave(String contraseña) {                        
                contraseña = contraseña.trim();
                if(contraseña.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,16}$")){ //Utiliza una expresion regular para validar la comlejidad . 
                                                                                    //(?=.*\d)verifica la existencia de un caracter numerico, 
                                                                                    //(?=.*[a-z]) la de una letra minuscula
                                                                                    //(?=.*[A-Z]) la de una letra en mayusculas. Verifica la longitud{6,15}.
                    return true;                                                   
                }else{JOptionPane.showMessageDialog(null,"Alerta de seguridad! la contraseña debe tener entre 6-16 caracteres. Debe incluir al menos una letra mayuscula y un numero");}
                return false;
     }
    //PaulDelgado
    //Metodo que verifica la igualdad de dos campos 
    public boolean IgualdadCampos(String campo1, String campo2){
      if (campo1==campo2){return true;}
      JOptionPane.showMessageDialog(null,"no coninciden los campos"); return false ;                   
    }   
}
