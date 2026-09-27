import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //lo de void significa que no retorna nada
       // System.out.println("Proyecto operadores");
        //System.out.println("Introduce tu nombre");
        //String nombre = "Borja";
        //String ciclo = "Desarrollo de aplicaciones multiplaforma";
        //System.out.println("Nombre: "+nombre);
        //System.out.println("Ciclo: "+ciclo);

        //creamos una variable por lecturas de teclado
        System.out.println("Proyecto operadores");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Introduce donde estas matriculado: ");
        String ciclo = lector.nextLine();
        System.out.println("Que notas crees que sacaras al final del curso: ");
        int nota = lector.nextInt();
        System.out.println("Nombre: "+nombre);
        System.out.println(("Ciclo: "+ciclo));
        System.out.println(("Nota: "+nota));
    }
}
