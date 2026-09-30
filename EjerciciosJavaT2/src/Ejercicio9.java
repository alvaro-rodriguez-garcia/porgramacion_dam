import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Bocadillos comprados entre 0 y 20: ");
        int  bocadillos = lector.nextInt();

        System.out.println("Bebidas comprados entre 0 y 20: ");
        int  bebidas = lector.nextInt();

        System.out.println("¿Cuanto cuesta el bocadillo? entre 0 y 5");
        double preciobocadillo = lector.nextDouble();

        System.out.println("¿Cuanto cuesta la bebida? entre 0 y 3");
        double preciobebida = lector.nextDouble();

        System.out.println("¿Cuantos alumnos han hecho la compra? entre 0 y 10");
        int alumnos = lector.nextInt();

        double totalbocadillo = preciobocadillo*bocadillos;
        double totalbebida = preciobebida*bebidas;
        double totalcompra = totalbebida+totalbocadillo;

        System.out.printf("El total de los bocadillos es %.2f%n",totalbocadillo);
        System.out.printf("El total de las bebidas es %.2f%n",totalbebida);
        System.out.println("El total de la compra es "+totalcompra);

    }
}
