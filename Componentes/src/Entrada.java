public class Entrada {

    public static void main (String[] args) {

        //variable:
            //segun el dato que guarda: String,char,byte/shot/long/int,double/float,boolean

        //para definirla
            //tipo nombre = valor

        //para cambiar el valor del string no poner otra vez string porque seria otra variable

        String nombreLegal = "Borja";
        nombreLegal = "Borja M";

        char letra = 'a';

        int edad = 41;

        double altura = 1.74;

        //float alturaFloat = 1.74f esto es para no liarnos porque ahora vamos a trabajar con double

        boolean acierto = true;

        System.out.println("El resultado de la evaluacion es "+acierto);
        System.out.println("La letra de mi Dni es "+letra);
        System.out.println("Mi nombre es "+nombreLegal);
        String nombre = "null";
        System.out.println("Hola Mundo");
        System.out.println("Segunda linea");
        System.out.println(nombre.length());
        System.out.println(9);
        System.out.println(9+5);
        System.out.println("La suma de "+9+ " y " +6+ " da como resultado "+ (9+6));
    }
}

