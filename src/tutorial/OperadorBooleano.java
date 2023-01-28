package tutorial;

import static tutorial.Utils.*;

public class OperadorBooleano {

    public static void main(String[] args) {

        boolean estaSoleado = true;
        int temperaturaHoy = 23;
        boolean esMayorA25LaTemp = temperaturaHoy >= 25;

        //Operador booleano AND

        boolean puedoIrALaPlaya = estaSoleado && esMayorA25LaTemp;

        //Solo se cumple si ambas condiciones se cumplen
        System.out.println("Puedo ir a la playa ? " +puedoIrALaPlaya);

        //Operador booleano OR

        boolean estaAbiertaLaPanaderia = true;

        boolean estaAbiertoElCasino = false;

        //Solo se cumple el true si una de las condiciones se cumple

        boolean hayAlgunaPanederiaAbierta = estaAbiertaLaPanaderia || estaAbiertoElCasino;
        System.out.println("Puedo ir a ambos lados? " +hayAlgunaPanederiaAbierta);

        //OPERADOR NOT

        //Transforma true a false o false a true
        System.out.println(!false +"");

    }
}
