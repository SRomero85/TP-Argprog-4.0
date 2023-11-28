import java.util.ArrayList;

public class TipoProblema {
    private int id;
    private String tipo;
    private int tiempoEstimado;
    private int tiempoMaximo;
    public static ArrayList<TipoProblema> tiposProblemas = new ArrayList<>();

    public ArrayList<TipoProblema> getTiposProblemas() {
        return tiposProblemas;
    }

    public static void setTiposProblemas(ArrayList<TipoProblema> tiposProblemas) {
        TipoProblema.tiposProblemas = tiposProblemas;
    }

    public String getTipo() {
        return tipo;
    }
    public int getId() {
        return id;
    }
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }
    public int getTiempoMaximo() {
        return tiempoMaximo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public TipoProblema(int id, String tipo, int tiempoEstimado, int tiempoMaximo) {
        this.id = id;
        this.tipo = tipo;
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoMaximo = tiempoMaximo;
    }

    public TipoProblema() {}
}