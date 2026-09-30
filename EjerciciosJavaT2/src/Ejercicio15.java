import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Dame un numero entero: ");
        int numero = lector.nextInt();

        numero += 5;
        System.out.println("Incrementar 5 unidades: "+numero);

        numero -= 3;
        System.out.println("Decrementar 3 unidades: "+numero);

        numero *= 10;
        System.out.println("Multiplicar por 10: "+numero);

        double division = (double)numero/2;
        System.out.println("Dividir entre 2: "+division);

    }
}
