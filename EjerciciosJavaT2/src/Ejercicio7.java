import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Dame el radio de una circunferencia que se encuentre entre 0 y 100");
        double radio = lector.nextDouble();

        double longuitud = 2*Math.PI*radio;
        double area = Math.PI*radio*radio;

        System.out.println("La longuitud es "+longuitud);
        System.out.println("El area es "+area);


    }
}
