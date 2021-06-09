package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    private double base;
    private double altura;
    private double area;

    public Triangulo(){}

    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public void setBase(double base){
        this.base=base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea() throws DatoFaltanteException{
        if(base<1){
            throw new BaseNoProvistaException();
        }else if(altura<1){
            throw new AlturaNoProvistaException();
        }else{
            area=base*altura/2;
            return area;
        }
    }

    @Override
    public String getName() {
        return "Triangulo";
    }

    public String getDescription(){
        return "Cualquier triangulo";
    }
}