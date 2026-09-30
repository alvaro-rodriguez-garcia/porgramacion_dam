import java.util.Scanner;

public class Ejercicio11b {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("¿Precio del primer articulo?");
        double precio_sin_iva1 = lector.nextDouble();
        System.out.println("¿Precio del segundo articulo?");
        double precio_sin_iva2 = lector.nextDouble();
        System.out.println("¿Cuanto dinero tienes?");
        double dinero = lector.nextDouble();
        System.out.println("¿Cuanto IVA se aplica?");
        int iva = lector.nextInt();

        double precio_con_iva1 = precio_sin_iva1+(precio_sin_iva1*((double)iva/100));
        double precio_con_iva2 = precio_sin_iva2+(precio_sin_iva2*((double)iva/100));
        System.out.println("El primer articulo con IVA vale: "+precio_con_iva1);
        System.out.println("El segundo articulo con IVA vale: "+precio_con_iva2);

        boolean comprobacion1 = precio_con_iva1<=dinero;
        System.out.println("¿Puedo comprar el primer articulo: ?"+comprobacion1);

        boolean comprobacion2 = precio_con_iva2<=dinero;
        System.out.println("¿Puedo comprar el segundo articulo: ?"+comprobacion2);

        boolean comprobacion_total = (precio_con_iva1+precio_con_iva2)<=dinero;
        System.out.println("¿Puedo comprar los dos articulos: ?"+comprobacion_total);




    }
}
