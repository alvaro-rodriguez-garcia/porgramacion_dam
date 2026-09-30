import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Dame el primer numero entre el 0 y el 9: ");
        int numero1 = lector.nextInt();
        System.out.println("Dame el segundo numero entre el 0 y el 9: ");
        int numero2 = lector.nextInt();

        System.out.println("Comprobemos si el primero es par y el segundo es impar: ");
        boolean resto_numero1 = (numero1%2)==0;
        boolean resto_numero2 = (numero2%2)!=0;
        System.out.println("El primer numero es par: "+resto_numero1);
        System.out.println("El segundo numero es impar: "+resto_numero2);

        System.out.println("Comprobemos si el primero es superior al doble del segundo y menor que 8: ");
        boolean condicion1 = numero1>(2*numero2) && numero1<8;
        System.out.println("¿Se cumplen las condiciones dichas arriba?: "+condicion1);

        System.out.println("Comprobesmo si son iguales o la diferencia entre el primero y el segundo es menor que 2");
        boolean condicion2 = numero1==numero2 || (numero1-numero2)<2;
        System.out.println("¿Se cumple alguna de las ds condiciones de arriba?: "+condicion2);





    }
}
