import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Dame la primera cadena");
        String cadena1 = lector.nextLine();
        System.out.println("Dame la segunda cadena");
        String cadena2 = lector.nextLine();

        boolean comparacion = cadena1.equals(cadena2);
        System.out.println("Las cadenas son iguales: "+comparacion);

        boolean comparacion_tamaño = cadena1.length()<cadena2.length();
        System.out.println("La cadena 1 es menor que la segunda: "+comparacion_tamaño);

        comparacion =!cadena1.equals(cadena2);
        System.out.println("Las cadenas son distintas: "+comparacion);




    }
}
