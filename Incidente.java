import java.util.ArrayList;

public class Incidente {
    private int id;
    private String titulo;
    private String descripcion;
    private String fechaIngreso;
    private String fechaEstimadaResolucion;
    private String fechaResolucion;
    private String estado;
    private int clienteId;
    private int idtec;
    private static ArrayList<Incidente> incidentes;

    public int getIdtec() {
        return idtec;
    }

    public void setIdtec(int idtec) {
        this.idtec = idtec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEstimadaResolucion() {
        return fechaEstimadaResolucion;
    }

    public void setFechaEstimadaResolucion(String fechaEstimadaResolucion) {
        this.fechaEstimadaResolucion = fechaEstimadaResolucion;
    }

    public String getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public static ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }

    public static void setIncidentes(ArrayList<Incidente> incidentes) {
        Incidente.incidentes = incidentes;
    }

    public Incidente(int id, String titulo, String descripcion, String fechaIngreso, String fechaEstimadaResolucion, String fechaResolucion, String estado, int clienteId, int idtec) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEstimadaResolucion = fechaEstimadaResolucion;
        this.fechaResolucion = fechaResolucion;
        this.estado = estado;
        this.clienteId = clienteId;
        this.idtec = idtec;
    }

    public Incidente() {
    }
    public static Incidente buscaId(int id){
        Incidente incidenteId = null;
        for(Incidente incidente: incidentes){
            if(incidente.getId() == id) {
                incidenteId = incidente;

            }
        }
        return incidenteId;
    }
    public static Incidente buscaIdCl(int id){
        Incidente clienteId = null;
        for(Incidente incidente: incidentes){
            if(incidente.getClienteId() == id) {
                clienteId = incidente;

            }
        }
        return clienteId;
    }
    public static int contador() {
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;

        Incidente tecnico = null;


        while (incidentes.size() <= i) {
            if (tecnico.getIdtec() == 1) {
                a = a++;
                i = i++;

            } else if (tecnico.getIdtec() == 2) {
                b = b++;
                i = i++;

            } else {
                c = c++;
                i = i++;
            }
        }

        if (a > b && a > c){
            return a;} else if (b > a && b > c){
            return b;}else{
            return c;}

        }

    }



