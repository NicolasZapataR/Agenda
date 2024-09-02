package co.edu.uniquindio.poo;
import java.util.Scanner;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;
import java.util.LinkedList;



public class Reunion {

    private String descripcion;
     private String fecha;
     private String hora;
     private Collection <Contacto> contactosAsistentes;
     /**
      * Metodo contructor de la clase Reunion
      * @param descripcion
      * @param fecha
      * @param hora
      * @param contactosAsistentes
      */
     
     public Reunion(String descripcion, String fecha, String hora){

        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        
        contactosAsistentes = new LinkedList<>();
     }

     // setters y getters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Collection<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }

    public void setContactosAsistentes(Collection<Contacto> contactosAsistentes) {
        this.contactosAsistentes = contactosAsistentes;
    }

    @Override
    public String toString() {

        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", contactosAsistentes="
                + contactosAsistentes + "]";
    }

    /**
     * Metodo para agregar contactos a la lista de contactos asistentes
     * @param contacto
     */

    public void agregarContactoReunion(Contacto contacto) {

        this.contactosAsistentes.add(contacto);

        System.out.println(" el contacto " + contacto.getNombre() +" se ha agregado a " + this.descripcion );
        
        
      }
   
/**
 * Metodo para elimiar contactos de la lista de contactos asistentes
 * @param nombre
 */

public void eliminarContactoReunion(String nombre) {

        for (Contacto contacto : contactosAsistentes) {
            if (contacto.getNombre().equals(nombre)) {
                contactosAsistentes.remove(nombre);
                System.out.println("el contacto "+ nombre + " fue eliminado ");
                return;
            }
        }

        System.out.println("el contacto no existe");
    }
    

    
}
