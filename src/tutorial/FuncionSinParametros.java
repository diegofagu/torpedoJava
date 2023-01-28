package tutorial;

//Las funciones sin parametros solamente ejecutan
// el codigo del bloque y retornan su resultado o hacen algo por debajo

public class FuncionSinParametros {

    public static void main(String[] args) {

        pronosticoDelDia();

    }


    public static void pronosticoDelDia(){
        System.out.println("Buscando informacion en el servidor");
        System.out.println("La temperatura de hoy es 24 grados");
        System.out.println("Guardando la temperatura en la base de datos local");

    }
}
