import java.util.ArrayList;

public class Tecnico {
    private int id;
    private String nombre;
    private String apellido;
    // an array list for the diferent tecnicians
    public static ArrayList<Tecnico> tecnicos = new ArrayList<>();

    public static ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public static void setTecnicos(ArrayList<Tecnico> tecnicos) {
        Tecnico.tecnicos = tecnicos;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Tecnico(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Tecnico() {
    }
}
