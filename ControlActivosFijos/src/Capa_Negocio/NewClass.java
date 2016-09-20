package Capa_Negocio;

public class NewClass {

    static String id_ActivosSeleccionados;
    
    public static void ingresarIdsActivos(String ia)
    {
        id_ActivosSeleccionados=ia;
    }
    
    public static String returnIdsActivos()
    {
        return  id_ActivosSeleccionados;
    }
}
