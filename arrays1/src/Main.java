import java.util.Arrays; //clase de Arrays para más funciones

public class Main {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4}; //forma simple
        numeros[0] = 5;
        numeros[4] = 7;
        System.out.println(Arrays.toString(numeros)); //para que me muestre el contenido del array
        System.out.println(numeros.length); //cantidad de elementos del array
        Arrays.sort(numeros); //ordenar array
        System.out.println(Arrays.toString(numeros));
    }
}