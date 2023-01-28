package tutorial;

import static tutorial.DataBaseConexion.DATABASE_URL; //de esta manera importo la variable estatica

public class ProgramaVariablesEstaticasServicioBDD {

    public static void main(String[] args) {

        String resultado = buscarInformacionEnDB();
        System.out.println("Resultado de busqueda :" +resultado);

    }

    public static String buscarInformacionEnDB(){
        //buscaremos la variable estatica en otra clase
        System.out.println("Buscando la informacion en la BDD con url :" +DATABASE_URL); //llamando variable estatica importada

        return "Informacion : 1231231";
    }
}
