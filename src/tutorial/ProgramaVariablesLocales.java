package tutorial;

public class ProgramaVariablesLocales {

    public static void main(String[] args) {

        int numero = 123456;
        String direccion = "San Bernardo";

        llamarNumero(numero);

        enviarCarta(direccion);

        System.out.println("direccion de main : " +direccion); //luego de la ejecucion de la funcion el valor de la variable direccion,
        //vuelve al definido al principio ya que solo se cambio su valor localmente en la funcion

    }

    private static void enviarCarta(String direccion) {

        System.out.println("Enviando carta a : " +direccion); //Toma el valor del main ya que se ingresa direccion como parametro
        direccion = "Santiago"; // se le asigna un nuevo valor a la variable local direccion
        System.out.println("Nueva direccion : " +direccion); //la variable local toma el nuevo valor
    }

    private static void llamarNumero(int whatsapp) {    //la variable whatsapp solo existe localmente ,
        // osea es el nombre que se le aasigna a la variable de entrada localmente
        System.out.println("Llamando al numero " +whatsapp);
    }


}
