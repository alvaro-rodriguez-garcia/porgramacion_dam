public class Entrada {

    public static void main (String[] args) {

        //variable:
            //segun el dato que guarda: String,char,byte/shot/long/int,double/float,boolean
            //segun la forma en construirse: primitivos(solo guarda el valor) o complejos(ademas del valor se guarda una funcionalidad)
            //segun la mutabilidad del dato: mutables o no mutables (constante, todas en mayuscula)
            //segun el scope de la variable: metodo (bloque) / clase

        //para definirla
            //tipo nombre = valor

        //para cambiar el valor del string no poner otra vez string porque seria otra variable

        String nombreLegal = "Borja";
        nombreLegal = "Borja M";

        //Vamos a ver como hacer un primitivo que sea complejo


        char letra = 'a';
        Character letraCompleja = 'a'; //ahora es complejo

        int edad = 41;
        Integer edadCompleja = 41; //ahora es complejo

        double altura = 1.74;
        Double alturaCompleja = 1.74; //ahora es complejo

        //float alturaFloat = 1.74f esto es para no liarnos porque ahora vamos a trabajar con double

        boolean acierto = true;
        Boolean aciertoComplejo = true; //ahora es complejo


        //por ejemplo vamos hacer una funcionalidad a un complejo
        nombreLegal.length();//te dice la longitud

        //vamos a ver una variables no mutable
        final String DNI = "123A";
        //dni= "12345A"; da error porque al poner final se le dice al programa que no se puede cambiar

        //segun el scope , metodo
        //se puede utilizar la variable porque esta definida dentro del metodo si estuviese fuera no la podria utlizar
        //si estuviese dentro de otro metodo no podria utilizarla
        //si yo defino la variable en el metodo mas grande si la podria utilizar para todos os metodos que estan dentro del metodo mas grande

        //-----------------------------------------------------------------------------------------------------------------------------------------------


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

