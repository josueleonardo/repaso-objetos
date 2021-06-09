package uaslp.objetos.escuela;

public class SalaC implements SalaDeJuntas{
    private static SalaC uniqueInstance;

    public static SalaC getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaC();
        return uniqueInstance;
    }

    @Override
    public String getNombre() {
        return "Sala C";
    }
}