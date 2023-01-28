package tutorial;

import java.util.Scanner;

public class ProgramaVariablesEstaticas {

    //Las variables estaticas pueden ser utilizadas dentro de toda la clase sin ser llamadas , solo escribiendo su nombre
    //Las variables estaticas se definen dentro de una clase (por convencion)
    //se define como public static luego el tipo de dato y el nombre de la variable

    public static String nombre ; //al identificar una variable estatica , su nombre cambia de color


    public static void main(String[] args) {

        saludarEnCastellano(); //Las variables estaticas no se pasan como parametro, si no que dentro de la misma funcion se llaman
        saludarEnIngles();

    }

    public static void saludarEnCastellano(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre :");
        String nombre = scanner.nextLine();
        System.out.println("Feliz cumpleaños " +nombre); //las variables estaticas se pueden llamar desde una funcion sin
        //pasarlas como parametros
    }

    public static void saludarEnIngles(){
        System.out.println("Happy Birthday " +nombre);
    }

}
