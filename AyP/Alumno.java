package AyP;
public class Alumno{
    private String nombre;
    private int legajo;

    public Alumno(String nombre, int legajo){
        this.nombre = nombre;
        this.legajo = legajo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int legajo){
        this.legajo =legajo;
    }
    public static void main(String[] args) {
        
    }
}