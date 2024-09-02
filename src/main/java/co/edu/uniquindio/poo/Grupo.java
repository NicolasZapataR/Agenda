package co.edu.uniquindio.poo;

import java.util.Scanner;
import java.util.Collection;
import java.util.LinkedList;

public class Grupo {

    private String nombre;
    private Collection<Contacto> contactos;
    private Categoria categoria;

    /**
     * Metodo constructor de la clase grupo
     * 
     * @param nombre
     * @param categoria
     */

    public Grupo(String nombre, Categoria categoria) {

        this.nombre = nombre;
        this.categoria = categoria;
        contactos = new LinkedList<>();
    }

    // setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }



    /**
     * Metodo que permite agregar un contacto
     * 
     * @param contacto
     */


    public void agregarContacto(Contacto contacto) {

    

        if (!verificarContacto(contacto.getNombre(), contacto.getTelefono())) {

            if (contactos.size() < 5) {

                contactos.add(contacto);
                System.out.println("El contacto " + contacto.getNombre() + " fue añadido en el grupo " + this.nombre);

            } else {

                System.out.println("El contacto " + contacto.getNombre() + " no puede ser agregado en el grupo "
                        + this.nombre + "por que la lista de contactos del ya tiene 5 elementos");
            }

        } else {
            System.out.println("El contacto " + contacto.getNombre() + " no puede ser agregado en el grupo "
                    + this.nombre + " por que esta repetido");
        }

    }

    /**
     * Metodo para verificar contacto
     * 
     * @param nombre
     * @param telefono
     * @return
     */

    public boolean verificarContacto(String nombre, String telefono) {

        boolean centinela = false;

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar contacto
     * 
     * @param nombre
     */

    public void eliminarContacto(String nombre) {


        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                contactos.remove(contacto);
                System.out.println(" el contacto " + nombre + " fue eliminado ");
                break;
            }
        }
    }

}
