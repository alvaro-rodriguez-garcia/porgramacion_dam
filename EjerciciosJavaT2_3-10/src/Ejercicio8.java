import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame los grados en centigrados ");
        double centigrados = lector.nextDouble();

        System.out.println("Dame los grados en Farenheit ");
        double farenheit = lector.nextDouble();

        System.out.println("Dame los grados en Kelvin ");
        double kelvin = lector.nextDouble();

        double fc = (5*(farenheit-32))/9;
        double kc = kelvin-273.15;
        double kf = ((9*(kelvin-273.15))/5)+32;
        double cf = ((9*centigrados)/5)+32;
        double ck = centigrados + 273.15;
        double fk = ((5*(farenheit-32))/9)+273.15;

        System.out.printf("Centigrados a Farenheit %.2f%n",cf);
        System.out.printf("Centigrados a Kelvin %.2f%n",ck);
        System.out.printf("Farenheit a Centigrados %.2f%n",fc);
        System.out.printf("Farenheit a Kelvin %.2f%n",fk);
        System.out.printf("Kelvin a Centigrados %.2f%n",kc);
        System.out.printf("Kelvin a Farenheit %.2f%n",kf);


    }
}
