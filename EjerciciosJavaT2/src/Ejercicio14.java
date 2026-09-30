import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Dame tu edad que este entre 0 y 100");
        int edad = lector.nextInt();
        System.out.println("Dame tu nivel de estudios que este entre 0 y 10");
        int nivel_estudios = lector.nextInt();
        System.out.println("Dame tus ingresos que este entre 0 y 25000");
        double ingresos = lector.nextInt();

        boolean condiciones = edad>40 && 5<=nivel_estudios && nivel_estudios<=8 && ingresos<15000;
        System.out.println("Se cumple esta condicion: Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: "+condiciones);






    }
}
