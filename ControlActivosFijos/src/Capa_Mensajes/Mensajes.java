package Capa_Mensajes;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Mensajes {
    
  public void msg_confirmacion(String msg_confirmacion){
    Icon img = new ImageIcon(getClass().getResource("/Icons_msg/checked (1).png"));
    JOptionPane.showMessageDialog(null,msg_confirmacion,"Titulo", JOptionPane.DEFAULT_OPTION,img);   
  }
   
  public void msg_advertencia(String msg_advertencia){    
    Icon img = new ImageIcon(getClass().getResource("/Icons_msg/warning (1).png"));
    JOptionPane.showMessageDialog(null,msg_advertencia,"ADVERTENCIA", JOptionPane.DEFAULT_OPTION,img);   
  }
  
  public int msg_Pregunta(String msg_pregunta){    
    Icon img = new ImageIcon(getClass().getResource("/Icons_msg/question (1).png"));
    int resp = JOptionPane.showConfirmDialog(null,msg_pregunta, "Alerta!", JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION,img); 
    System.out.println(resp);
    return(resp);
  }
    
}
