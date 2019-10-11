
public abstract class Actividad{
    private String id;
    private String descripcion;
    
    public Actividad(String id){
        this.id=id;
        this.descripcion="Por definir";
    }
    
    public Actividad(String id, String descripcion){
        this.id=id;
        this.descripcion=descripcion;
    }
    
    /**
     * @Return Retorna el numero de creditos de una actividad
     */
    public abstract int creditos() throws ActividadExcepcion;
    
    /**Calcular el numero de creditos considerando las actividades bien definidas
     * @return 
     * */
    public abstract int creditosDefinidos();
    

    public abstract int creditos(String descripcion) throws ActividadExcepcion;

    
}
