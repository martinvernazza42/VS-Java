public class clasePOO {
    private int nroCaja;
    private String nombre;
    private String apellido;

    public clasePOO(int nroCaja, String nombre, String apellido) {
        this.nroCaja = nroCaja;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNroCaja() {
        return nroCaja;
    }

    public void setNroCaja(int nroCaja) {
        this.nroCaja = nroCaja;
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
}