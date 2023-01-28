package tutorial;

import java.util.Scanner;

public class ProgamaIndiceMasaCorporal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu altura?");
        double alturaMetros = scanner.nextDouble();
        System.out.println("Cual es tu peso en kilogramos?");
        int  pesoKg = scanner.nextInt();

        double indiceDeMasaCorporal = indiceMasaCorporal(alturaMetros, pesoKg); //guardamos el resultado de la funcion en una variable

        System.out.println("Tu indice de masa corporal es :" +indiceDeMasaCorporal);
    }

    public static double indiceMasaCorporal(double alturaMetros,int pesoKg){

        return pesoKg/( Math.pow(alturaMetros, 2));  //para elevar un double ocupamos la libreria Math y la funcion pow
    }
}
