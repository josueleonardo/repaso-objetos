package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String sala){
        switch(sala){
            case "Sala A":
                return SalaA.getInstance();
            case "Sala B":
                return SalaB.getInstance();
            case "Sala C":
                return SalaC.getInstance();
            default:
                return null;
        }
    }
}