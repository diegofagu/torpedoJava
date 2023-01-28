package tutorial;

import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Que edad tienes ?");
        int edad = scanner.nextInt();

        if (esMayorDeEdad(edad)){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }

    //Luego del static se pone el tipo de resultado de la funcion , en este caso un boolean es lo que devolvera el resultado
    //Luego de definir el nombre de la funcion se escriben los parametros de entrada (variables) junto con su tipo, pueden ser varios

    public static boolean esMayorDeEdad(int edadPersona) { //la primera linea de la es conocida como el contrato o firma de la funcion
        //ya que se puede saber que hace la funcion ,
        //1. public => significa que la funcion es publica y la pueden utilizar todas las demas clases
        //2. boolean => es la salida que tendra la funcion , se especifica el tipo del dato de la salida
        //3. nombre => viene despues del tipo de retorno, es el nombre de la funcion
        //4. parametros => son los parametros de entrada de la funcion , lo que procesara para obtener una salida , se especifica
        // el tipo de dato y su nombre de variable
        return edadPersona >= 21;
    }

    //El return corta la ejecucion de una funcion
}
