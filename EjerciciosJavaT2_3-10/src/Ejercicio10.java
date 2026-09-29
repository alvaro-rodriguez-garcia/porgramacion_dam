import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero de 5 digitos ");
        int numero = lector.nextInt();

        int decenasdemil = numero/10000;
        int restodecenasdemil = numero%10000;
        System.out.println("Decenas de mil "+decenasdemil);

        int unidadesdemil = restodecenasdemil/1000;
        int restounidadesdemil = restodecenasdemil%1000;
        System.out.println("Unidades de mil "+unidadesdemil);

        int centenas = restounidadesdemil/100;
        int restocentenas = restounidadesdemil%100;
        System.out.println("Centenas "+centenas);

        int decenas = restocentenas/10;
        int restodecenas = restocentenas%10;
        System.out.println("Decenas "+decenas);

        System.out.println("Unidades "+restodecenas);
    }
}
