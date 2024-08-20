public class Profesor extends Alumno {
    private double sueldo;
    private int horasDeTrabajo;

    public Profesor(String nombre, int legajo, double sueldo, int horasDeTrabajo) {
        super(nombre, legajo);
        this.sueldo = sueldo;
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }
}
