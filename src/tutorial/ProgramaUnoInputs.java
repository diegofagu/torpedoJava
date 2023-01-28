package tutorial;

import java.util.*;


public class ProgramaUnoInputs {

    public static void main(String[] args) {

        //String nombre = input(" Ingresa tu nombre");

        //int edad = inputInt("Ingresa tu edad :");

        //System.out.println("Tu nombre es : " +nombre + " y tu edad es : " +edad);

        //Metodo Scanner para el input

        Scanner scanner = new Scanner(System.in); //Definimos y creamos el scanner de la clase Scanner
        System.out.println("Ingresa tu nombre : ");
        String nombre = scanner.nextLine(); //Para pedir un string utilizamos nextLine()
        System.out.println("Ingresa tu edad :");
        int edad = scanner.nextInt(); //Para pedir un int utilizamos nextInt()
        System.out.println("Tu nombre es  " + nombre + " y tienes " +edad);
        System.out.println("Ingresa tu estado civil : 1. soltero 2. comprometido");
        int estado = scanner.nextInt();


        if (edad > 35 ) {
            System.out.println("Estay mas o menos viejo");
        }
        else {

            switch (edad) {
                case 30 : {
                    System.out.println("Tu edad es blabla");
                }
                case 31 : {
                    System.out.println("HOLA HOLA PIRINOLA");
                }
            }
            //System.out.println("Tamos tiki taka");
        }

        switch (estado) {
            case 1 : {
                System.out.println("Estas soltero");
            }
            case 2 : {
                System.out.println("Estas comprometido");
            }
        }


    }
}
