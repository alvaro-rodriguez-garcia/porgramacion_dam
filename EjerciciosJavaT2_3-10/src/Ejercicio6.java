import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("El precio de la compra entre 500€ y 0€");
        double compraconiva = lector.nextDouble();

        System.out.println("El valor del IVA entre 0% y 25%");
        int iva = lector.nextInt();

        double precioiva = ((double)iva/100)*(compraconiva);

        double comprasiniva =  compraconiva-precioiva;

        System.out.printf("El valor de la compra sin iva es %.2f%n",comprasiniva);

        System.out.printf("El precio del iva es %.2f%n",precioiva);









    }
}
