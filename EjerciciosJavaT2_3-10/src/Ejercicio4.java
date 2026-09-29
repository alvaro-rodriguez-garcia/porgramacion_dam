import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("¿Bocadillos?");
        int bocadillos = lector.nextInt();
        System.out.println("¿Bebidas?");
        int bebidas = lector.nextInt();


        System.out.println("Has pedido "+bocadillos+" bocadillos");
        System.out.println("Has pedido "+bebidas+" bebidas");
        System.out.println("Los bocadillos son "+(bocadillos*2.05));
        System.out.println("Las bebidas son "+(bebidas*1.25));
        System.out.println("El total es "+((bocadillos*2.05)+(bebidas*1.25)));

    }
}
