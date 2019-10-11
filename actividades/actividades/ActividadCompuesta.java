import java.util.ArrayList;

public class ActividadCompuesta extends Actividad{
    private ArrayList<Actividad> actividades;
    
    public ActividadCompuesta(String id){
        super(id);
        actividades= new ArrayList<Actividad>();
    }
    
    public void actividad(Actividad a){
        actividades.add(a);
    }
    
    @Override
    public int creditos() throws ActividadExcepcion{
        int sumatoria = 0;
        for(Actividad a : actividades){
            sumatoria += a.creditos();
        }
        if (actividades.size() == 0) throw new ActividadExcepcion(ActividadExcepcion.COMPUESTA_VACIA);
        return sumatoria;
    }
    
    @Override
    public int creditos(String description){
        return 0;
    }
    
    @Override
    public int creditosDefinidos(){
        int sumatoria = 0;
        if(actividades.size() != 0){
            for(Actividad a: actividades){
                sumatoria += a.creditosDefinidos();
            }
        }
        return sumatoria;
    }
}
