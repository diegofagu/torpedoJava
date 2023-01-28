package tutorial;

import static tutorial.Utils.*;

public class Numeros {

    public static void main(String[] args) {

        System.out.println(1);

        System.out.println(2 + 2);

        //en el siguiente caso se imprimira la cadena de texto entre comillas

        System.out.println("2+2");

        //en el siguiente caso se concatenara el string y el resultado sera 22

        System.out.println("2" + "2");

        //Multiplicacion
        System.out.println(2 * 2);

        //Division
        System.out.println(2 / 2);

        // Suma con decimales

        System.out.println(2.2 + 3.1);

        //suma de decimales entre numeros distintos

        System.out.println(3.1 + 1);

        //Declaracion de una variable numerica

        int numero = 4 ;

        System.out.println(numero*3);

        //Declariacion de decimales

        double decimal = 3.2; //ocupa mayor espacio en la memoria pero tiene mayor precision en ella

        float decimal2 = 4.1f; // ocupa un menor espacio en la memoria , SIEMPRE DEBE TERMINAR CON UNA f

        System.out.println(decimal2*decimal);

    }

}
