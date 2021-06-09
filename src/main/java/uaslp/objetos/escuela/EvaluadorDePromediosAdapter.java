package uaslp.objetos.escuela;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios){
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String calificacion){
        List<String> listStringCalificaciones = Arrays.asList(calificacion.split(","));
        List<Double> listCalificaciones = new ArrayList<>();

        for(String calificacion1: listStringCalificaciones){
            listCalificaciones.add(Double.parseDouble(calificacion1));
        }
        return evaluadorDePromedios.evalua(listCalificaciones);
    }
}
