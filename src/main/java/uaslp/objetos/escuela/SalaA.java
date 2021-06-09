package uaslp.objetos.escuela;

public class SalaA implements SalaDeJuntas{
    private static SalaA uniqueInstance;

    public static SalaA getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaA();
        return uniqueInstance;
    }

    @Override
    public String getNombre() {
        return "Sala A";
    }
}