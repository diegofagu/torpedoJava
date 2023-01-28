package tutorial;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ProgramaDosDisco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos años tienes ? ");
        int edad = scanner.nextInt();

        if (edad >= 100){
            System.out.println("Adelante Faraon");
        }
        else if (edad >= 65) {
            System.out.println("Felicitaciones, la juventud se lleva en el alma!");
        }
        else if( edad >=18){
            System.out.println("Super ,puedes ingresar ");
        }
        else {
            System.out.println("Vira loco");
        }

    }
}
