package AyP;
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Alumno
        Alumno alumno = new Alumno("Juan Pérez", 12345);

        // Obtener y mostrar los valores de los atributos
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Legajo: " + alumno.getLegajo());

        Profesor profesor = new Profesor("Profesor de Matemáticas", "Juan Pérez", 12345, 50000.0, 20);
        System.out.println(profesor.toString());
    }
}