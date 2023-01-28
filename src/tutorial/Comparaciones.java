package tutorial;

import static tutorial.Utils.*;

public class Comparaciones {

    public static void main(String[] args) {

        int precioPanEsquina = 3000 ;
        int precioPanSuper = 2500 ;


        System.out.println((precioPanSuper>precioPanEsquina)+ ""); // se le agrega la concadenacion para que el resultado lo tome como un string
        System.out.println(precioPanSuper<precioPanEsquina);
        System.out.println(precioPanSuper==precioPanEsquina);


        int a =50;
        int b =20;
        int c =30;

        System.out.println((a<b) + "");
        System.out.println(a>b && a<c);

        //IF ELSE

        if(precioPanEsquina> precioPanSuper){
            System.out.println("compra el pan en el super");
        }
        else {
            System.out.println("compra el pan en la equina");
        }

        boolean panMasCaro = precioPanSuper>precioPanEsquina;

        if (panMasCaro){

            System.out.println( "El pan es mas caro en el super");
        } else {
            System.out.println("el pan es mas barato en la esquina");
        }

        //Comparacion con equals

        String nombre1 = input("ingresa el nombre 1 :");
        String nombre2 = input("ingresa el nombre 2 :");

        boolean nombre1EsIgualANombre2 = nombre1.equals(nombre2); //se utiliza el equals ya que el resultado esta dentro de una variable

        if (nombre1EsIgualANombre2){
            System.out.println("El nombre 1 SI es igual al nombre 2");
        }
        else{
            System.out.println("El nombre 1 NO es igual al nombre 2");
        }
    }
}
