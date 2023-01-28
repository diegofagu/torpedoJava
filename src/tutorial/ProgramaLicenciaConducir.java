package tutorial;

import java.util.Scanner;

//Para reutilizar funciones

import static tutorial.Funciones.esMayorDeEdad; //De esta manera puedo importar funciones desde otras clases ya que la funcion es public

public class ProgramaLicenciaConducir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu edad ? ");
        int edad = scanner.nextInt();

        if(esMayorDeEdad(edad)){
            System.out.println("Puedes manejar");
        }
        else{
            System.out.println("No puedes manejar");
        }

    }
}
