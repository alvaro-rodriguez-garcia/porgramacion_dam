import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los segundos ");
        int segundos = lector.nextInt();

        int horas = segundos/3600;
        int restohoras = segundos%3600;
        System.out.println("horas son "+horas);

        int minutos = restohoras/60;
        int restominutos = restohoras%60;
        System.out.println("minutos son "+minutos);

        System.out.println("segundos restantes son "+restominutos);


    }
}
