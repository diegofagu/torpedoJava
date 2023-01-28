package tutorial;

public class Constructores {

    String nombre;
    int peso;
    String raza;

    //UN OBJETO ES UNA INSTANCIA DE UNA CLASE eso quiere decir UN OBJETO DE LA CLASE CONSTRUCTOR
    //EL molde es la clase y el resultado de ese molde es una instancia u objeto


    //Los contructores son funciones especiales que nos permiten crear nuevos objetos

    //ESTE CONSTRUCTOR VACIO SE UTILIZA PARA PODER CREAR UN OBJETO CON NEW CLASS() PERO NO LE DOY VALORES INMEDIATOS
    public Constructores() {
    }


    //Para definir un constructor SIEMPRE hay que usar el mismo nombre de la clase
    public Constructores(String nombre , int peso , String raza){ //no retornan ningun valor , pero si recibe parametros
        this.nombre = nombre; //THIS significa que al objeto que estoy creando de esta clase se le asigne el valor que le voy a ingresar
        this.peso = peso;
        this.raza = raza;
    }


    //EL GET ME PERMITE OBTENER UN VALOR Y VER LOS DATOS
    public String getNombre() {//Tienen la estructura de una funcion ,
        // son publicos RETORNAN un String que es el tipo de la variable y retorna la variable
        return nombre;
    }

    //EL SET ME PERMITE DARLE UN VALOR A LA VARIABLE COMO SETEARLOS O MODIFICARLOS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Constructores{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
}
