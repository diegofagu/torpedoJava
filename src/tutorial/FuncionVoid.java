package tutorial;

import java.util.Scanner;

public class FuncionVoid {

    public static void main(String[] args) {

        //Las funciones que no retornan informacion llevan en su firma la palabra void , donde deberia ir el tipo de dato de retorno
        //Se utilizan para ejecutar procesos donde no devuelve un resultado especifico

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre :");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu apellido :");
        String apellido = scanner.nextLine();


        saludo(nombre,apellido);

    }

    public static void saludo(String nombre, String apellido){
        System.out.println("Hola " +nombre + " " +apellido +" bienvenid@");

    }
}
