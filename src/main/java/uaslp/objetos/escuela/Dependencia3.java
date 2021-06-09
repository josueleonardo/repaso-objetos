package uaslp.objetos.escuela;

public interface Dependencia3 {
    default void send(int a, int b){}
    void recover();
}
