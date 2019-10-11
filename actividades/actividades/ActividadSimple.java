

public class ActividadSimple extends Actividad{
    private Integer creditos;
    
    public ActividadSimple(String id, Integer creditos){
        super(id);
        this.creditos=creditos;
    }
    
    @Override
    public int creditos() throws ActividadExcepcion{
        if (creditos == null) throw new ActividadExcepcion(ActividadExcepcion.SIMPLE_SIN_CREDITOS);
        return creditos;
    }
    
    @Override
    public int creditos(String description){
        return 0;
    }
    
    public int creditosDefinidos(){
        int creditosDefinidos = 0;
        try{
           creditosDefinidos =  creditos(); 
        } catch(ActividadExcepcion e){
         
        }
        return creditosDefinidos;
    }
}
