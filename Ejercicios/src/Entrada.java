import java.util.Scanner;

public class Entrada {

    //EJERCICIO 1

    public static void main(String[] args) {

        String nombre = "Alvaro";
        int edad = 28;
        String ciudad = "Badajoz";

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Ciudad: "+ciudad);


        System.out.println();

        ejercicio2();

        System.out.println();

        ejercicio3();

        System.out.println();

        ejercicio4();

        System.out.println();

        ejercicio5();



    }

    //EJERCICIO2

    public static void ejercicio2() {

        int valor = 0;
        System.out.println("Valor inicial: "+valor);
        valor = 5;
        System.out.println("Valor 2: "+valor);
        valor = 10;
        System.out.println("Valor 3: "+valor);
        valor = 15;
        System.out.println("Valor 4: "+valor);
    }

    //EJERCICIO3

    public static void ejercicio3(){

        String nombre = "Alvaro";
        Integer edad = 28;
        Boolean afirmativo = true;
        Double altura = 1.91;
        Character letra = 'A';

        System.out.println("Nombre: "+nombre+"Tipo: "+nombre.getClass().getSimpleName());
        System.out.println("Edad: "+edad+"Tipo: "+edad.getClass().getSimpleName());
        System.out.println("¿Es estudiante?: "+afirmativo+"Tipo: "+afirmativo.getClass().getSimpleName());
        System.out.println("Altura: "+altura+"Tipo: "+altura.getClass().getSimpleName());
        System.out.println("letra: "+letra+"Tipo: "+letra.getClass().getSimpleName());
    }

    //EJERCICIO4 (este ejericcio me da la sensacion que se hace sin pedir los valores si no de la forma facil)

    public static void ejercicio4() {

        System.out.println("Libro");
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Autor: ");
        String autor = lector.nextLine();
        System.out.println("Año: ");
        int año = lector.nextInt();
        System.out.println("Paginas: ");
        int paginas = lector.nextInt();
        System.out.println("¿Esta disponible?: ");
        boolean disponible = lector.nextBoolean();
    }

    //EJERCICIO5

    public static void ejercicio5() {

        final String aplicacion = "MiApp";
        System.out.println("Aplicacion: "+aplicacion);
        final String version = "1.0.0";
        System.out.println("Version: "+version);
        final double pi = 3.14;
        System.out.println("Pi:"+pi);
        String usuario = "Alvaro";
        System.out.println("Usuario: "+usuario);
        int nivel = 1;
        System.out.println("Nivel: "+nivel);
        int puntuacion = 0;
        System.out.println("Puntuacion: "+puntuacion);
        usuario = "Borja";
        System.out.println("Nuevo usuario:"+usuario);
        nivel = 2;
        System.out.println("Nuevo nivel: "+nivel);
        puntuacion = 5;
        System.out.println("Nueva puntuacion: "+puntuacion);


    }

}
