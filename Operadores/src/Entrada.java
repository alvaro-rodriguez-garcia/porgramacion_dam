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
        System.out.println("Gracias");

        //OPERADORES-> realizar operaciones
        //aritmeticas: operaciones matematicas (depende del tipo de dato)
            //unarias ++ -- y binarias + - * / %
        int operando1 = 10;
        int operando2 = 5;
        operando1++;
        operando1++;
        operando1++; //13
        operando2--;
        operando2--;
        operando2--; //2

        int suma = operando1+operando2; //15
        int resta = operando1-operando2; //11
        int multiplicacion = operando1*operando2; //26
        double division = (double)operando1 / operando2; //6.5
        int resto = operando1%operando2; //13%2 ->1 ->

        System.out.println("Operando 1 "+operando1);
        System.out.println("OPerando2 "+operando2);
        System.out.println("La suma de los operandos es "+suma);
        System.out.println("La resta de los poerandos es "+resta);
        System.out.println("La multiplicacion de los operandos es "+multiplicacion);
        System.out.println("La division de los operandos "+division);
        System.out.println("El resto de los operadores es "+resto);

        operando1=10;
        operando2=7;
        System.out.println("La suma es"+operando1+operando2); //107
        System.out.println("La suma es"+(operando1+operando2)); //17
        //veamos el parse, cambio de dato a otro
        String op1="5"; //si aqui en op1="qwe" por ejemplo daria error
        String op2="15";
        System.out.println("La suma de los operadores str es "+(Integer.parseInt(op1)+Integer.parseInt(op2)));

        //Asignacion
        operando1=20;
        operando2=10;
        operando1=operando1+14; //34 no me lo voy a soler encontrar asi
        operando1+=14; //exactamento igual que el de arriba, nos lo vamos a encontrar asi
        operando1-=4; //30
        operando1*=2; //60
        operando1/=10; //6
        operando1 *= operando2; //60
        operando1%=2; //0

        //relacionales (siempre obtengo un boolean) > >= < <= == !=
        //puedes comparar lo que tu quieras

        operando1 = 10;
        operando2 = 15;

        boolean comparacion = operando1>10; //false
        System.out.println("El resultado de la comperacion es "+comparacion); //false

        //logicos -> AND && y OR || -> (siempre da resultado boolean)
        operando1 = 10;
        operando2 = 20;
        boolean resultadologico = operando1<10 && operando2*2>30; // false
        resultadologico = operando1<10 && operando2*2>30; // true




    }
}
