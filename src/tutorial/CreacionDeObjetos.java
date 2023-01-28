package tutorial;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class CreacionDeObjetos {
    public static void main(String[] args) {

        //Primera forma , definirlos en los parametros
        Constructores user1 = new Constructores("Teo",14,"beagle");
        System.out.println(user1.getNombre());

        //Segunda forma , dar el valor mediante setter
        Constructores user2 = new Constructores(); //el user2 se crea pero no tiene valores asigandos aun

        //CON LOS SETTER LE PUEDO ASIGNAR UN VALOR A UNA VARIABLE DEL OBJETO en este caso Constructor
        user2.setNombre("Schuster");
        user2.setPeso(8);
        user2.setRaza("kiltro");
        System.out.println(user2.getNombre());
        System.out.println(user2.getPeso());
        System.out.println(user2.getRaza());

        //Para cambiar el valor de una variable de un objeto
        user2.setPeso(10);
        System.out.println(user2.getPeso());

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }

}
