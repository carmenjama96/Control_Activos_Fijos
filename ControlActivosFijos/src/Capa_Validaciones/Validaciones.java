package Capa_Validaciones;

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
    
    
}
