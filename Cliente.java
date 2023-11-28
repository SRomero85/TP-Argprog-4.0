import java.util.ArrayList;

public class Cliente {
    private int id;
    private long cuit;
    private String email;
    private String nombre;
    private String apellido;
    private String razonSocial;
    private int idServ;

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getIdServ() {
        return idServ;
    }

    public void setIdServ(int idServ) {
        this.idServ = idServ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Cliente(int id, long cuit, String email, String nombre, String apellido, String razonSocial, int idServ) {
        this.id = id;
        this.cuit = cuit;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.razonSocial = razonSocial;
        this.idServ = idServ;
    }

    public Cliente(){

    }
    public static Cliente buscaId(int id){
        Cliente clienteId = null;
        for(Cliente cliente: clientes){
            if(cliente.getId() == id) {
                clienteId = cliente;

            }
        }
        return clienteId;
    }
}