import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dame un numero entre el 0 y el 100");
        int numero = lector.nextInt();
        boolean comprobacion = 0<= numero && numero<=100;
        System.out.println("El numero dado esta entre 0 y 100: "+comprobacion);

        System.out.println("Veamos si es par");
        int resto = numero%2;
        boolean par = resto==0;
        System.out.println("¿El numero es par? "+par);

        System.out.println("Veamos si es mayor a 50 ");
        boolean mayor = numero>50;
        System.out.println("¿El numero es mayor a 50?: "+mayor);






    }
}
