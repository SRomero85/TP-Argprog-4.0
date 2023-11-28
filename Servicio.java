

import java.util.ArrayList;

public class Servicio {

    private int id;
    private String nombre;
    private String descripcion;
    // an array list of the tipe of services
    public static ArrayList<Servicio> tipoServicio = new ArrayList<>();

    public static ArrayList<Servicio> getTipoServicio() {
        return tipoServicio;
    }

    public static void setTipoServicio(ArrayList<Servicio> tipoServicio) {
        Servicio.tipoServicio = tipoServicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Servicio(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Servicio() {
    }

}
