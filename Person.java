public class Person {
    private String nombre;
    private String apellido;
    private char sexo; // Cambiado a char para que sea un solo caracter (M o F)
    private int dni;
    private int edad;
  /*private int peso;*/  

    // Constructor vacío
    public Person() {
        nombre = "";
        apellido = "";
        sexo = ' ';
        dni = 0;
        edad = 0;
    }

    // Constructor con parámetros
    public Person(String nombre, String apellido, int dni, char sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dni = dni;
        this.edad = edad;
    }
    private void validateSexo(char sexo) {
        if (sexo != 'M' && sexo != 'F') {
            throw new IllegalArgumentException("Sexo debe ser 'M' o 'F'");
        }
    }
/*
 * public int calcularIMC(){
        double imc = peso/Math.pow(double, 2)
        if (imc <20){
            return -1;
        }else if(imc <=25) {
            return 0;
        }else {
            return 1;
        }
    }
 */
    
    public void setSexo(char sexo) {
        validateSexo(sexo);
        this.sexo = sexo;
    }
    // Getters y setters
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

    public char getSexo() {
        return sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}