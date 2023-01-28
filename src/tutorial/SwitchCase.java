package tutorial;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        //SWITCH CASE sirve para checkear igualdad

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que dia de la semana es?");
        String dia = scanner.nextLine();

        switch (dia){

            case "Lunes" : {
                System.out.println("Hoy es Lunes");
                break;
            }
            case "Martes" : {
                System.out.println("Hoy es Martes");
                break;
            }
            case "Miercoles" : {
                System.out.println("Hoy es Miercoles");
                break;
            }
            case "Jueves" : {
                System.out.println("Hoy es Jueves");
                break;
            }
            case "Viernes" : {
                System.out.println("Hoy es Viernes");
                break;
            }
            case "Sabado" : {
                System.out.println("Hoy es Sabado");
                break;
            }
            case "Domingo" : {
                System.out.println("Hoy es Domingo");
                break;
            }
            default: {
                System.out.println("No existe ese dia vio");
            }
        }

    }
}
