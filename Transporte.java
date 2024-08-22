public class Transporte {
    public static void main(String[] args) {
        // Aquí puedes crear objetos de la clase Vehiculo o sus subclases
        Vehiculo miVehiculo = new Coche(100, 10, 20000.0);
        System.out.println(miVehiculo.getPrecio());
    }
}

abstract class Vehiculo{
    private double hp;
    private int stock;
    private double precio;
    
    public Vehiculo(double hp, int stock, double precio){
        this.hp = hp;
        this.stock = stock;
        this.precio = precio;
    }
    
    public abstract void mostrarInformacion();
    
    public double getPrecio() {
        return precio;
    }
}

class Coche extends Vehiculo {
    public Coche(double hp, int stock, double precio) {
        super(hp, stock, precio);
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Soy un coche");
    }
}