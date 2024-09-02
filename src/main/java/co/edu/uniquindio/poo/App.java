package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //ejecutarCasoPrueba1();
        //ejecutarCasoPrueba2();
       // ejecutarCasoPrueba3();
        ejecutarCasoPrueba4();

    }

    /*
     * 
     * Escenario contactos iguales
     * 
     */
    public static void ejecutarCasoPrueba1() {

        System.out.println("Esta es la ejecucion del caso de prueba 1, contactos iguales");

        Contacto contacto1 = new Contacto("nicolas", "nico", "calle1", "001", "nico@uq.com");
        Contacto contacto2 = new Contacto("Johanna", "amor", "calle1", "002", "joha@uq.com");

        Grupo grupoAmigos = new Grupo("Estudio", Categoria.AMIGOS);
        Grupo grupoFamilia = new Grupo("bby Shower", Categoria.FAMILIA);

        grupoAmigos.agregarContacto(contacto1);
        grupoFamilia.agregarContacto(contacto2);
        grupoFamilia.agregarContacto(contacto1);

        Contacto contacto3 = new Contacto("nicolas", "nico", "calle1", "001", "nico@uq.com");

        grupoAmigos.agregarContacto(contacto3);

    }

    /*
     * 
     * Escenario lista de contactos del grupo llena
     * 
     */

    public static void ejecutarCasoPrueba2() {

        System.out.println("esta es la ejecucion del caso 2, lista de contactos del grupo llena");

        Contacto contacto1 = new Contacto("nicolas", "nico", "calle1", "001", "nico@uq.com");
        Contacto contacto2 = new Contacto("Johanna", "amor", "calle5", "002", "joha@uq.com");
        Contacto contacto3 = new Contacto("liceth", "madre", "calle4", "003", "liz@uq.com");
        Contacto contacto4 = new Contacto("Andrea", "tia", "calle3", "004", "andre@uq.com");
        Contacto contacto5 = new Contacto("Jorge", "tio", "calle2", "005", "jorge@uq.com");

        Grupo grupoAmigos = new Grupo("Estudio", Categoria.AMIGOS);
        Grupo grupoFamilia = new Grupo("Bby Shower", Categoria.FAMILIA);

        grupoFamilia.agregarContacto(contacto1);
        grupoFamilia.agregarContacto(contacto2);
        grupoFamilia.agregarContacto(contacto3);
        grupoFamilia.agregarContacto(contacto4);
        grupoFamilia.agregarContacto(contacto5);

        Contacto contacto6 = new Contacto("Isa", "prima", "calle6", "006", "isa@uq.com");

        grupoFamilia.agregarContacto(contacto6);

    }

    /**
     *  Escenario agregar un contacto a una reunion
     */

    public static void ejecutarCasoPrueba3() {

        System.out.println("esta es la ejecucuon del caso de pueba 3, agregar un contacto a una reunion");

        Reunion reunion1 = new Reunion(" Proyecto ", " 1/09/2024 ", "18:46");

        Contacto contacto1 = new Contacto("nicolas", "nico", "calle1", "001", "nico@uq.com");
        Contacto contacto2 = new Contacto("Johanna", "amor", "calle5", "002", "joha@uq.com");
        Contacto contacto3 = new Contacto("liceth", "madre", "calle4", "003", "liz@uq.com");

        reunion1.agregarContactoReunion(contacto1);
        reunion1.agregarContactoReunion(contacto2);
        reunion1.agregarContactoReunion(contacto3);

        System.out.println("estos son los datos de la reunion " + reunion1.toString());

    }

    /**
     * Escnario remover un contacto de una reunion
     * 
     */

    public static void ejecutarCasoPrueba4() {

        Scanner dato = new Scanner(System.in);

        System.out.println("esta es la ejecucuon del caso de pueba43, remover un contacto a una reunion");

        Reunion reunion1 = new Reunion(" Proyecto ", " 1/09/2024 ", "18:46");

        Contacto contacto1 = new Contacto("nicolas", "nico", "calle1", "001", "nico@uq.com");
        Contacto contacto2 = new Contacto("Johanna", "amor", "calle5", "002", "joha@uq.com");
        Contacto contacto3 = new Contacto("liceth", "madre", "calle4", "003", "liz@uq.com");

        reunion1.agregarContactoReunion(contacto1);
        reunion1.agregarContactoReunion(contacto2);
        reunion1.agregarContactoReunion(contacto3);

        System.out.println("estos son los asistentes de la reunion " + reunion1.toString());

        System.out.println("ingrese el nombre del contacto que desea eliminar ");
        String nombre = dato.nextLine();

        reunion1.eliminarContactoReunion(nombre);

        System.out.println("Estos son los nuevos asistentes de la reunion " + reunion1.toString());

        
    }

}
