
public class Calculadora {
    public double sumar (double a, double b){
        return a+b;
    }
    public double restar (double a, double b){
        return a-b;
    }
    public double multiplicar (double a, double b){
        return a*b;
    }
    public double dividir (double a, double b){
        if (b==0){
            throw new IllegalArgumentException("No es posible dividir entre 0");
        }
        return a/b;
    }
}