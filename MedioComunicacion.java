
public class MedioComunicacion {
    private int id;
    private MedioEnum medio;
    private String contacto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MedioEnum getMedio() {
        return medio;
    }

    public void setMedio(MedioEnum medio) {
        this.medio = medio;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public MedioComunicacion(int id, MedioEnum medio, String contacto) {
        this.id = id;
        this.medio = medio;
        this.contacto = contacto;
    }

    public MedioComunicacion() {
    }
}
