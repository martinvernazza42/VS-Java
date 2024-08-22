import java.util.ArrayList;
import java.util.List;

class Humane {

    private String nombre;
    private String apellido;
    private int dni;
  
    public Humane(String nombre, String apellido, int dni) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.dni = dni;
    }
  
    @Override
    public String toString() {
      return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
    }
  
}

class Empleado extends Humane {
  
    private double sueldo;
  
    public Empleado(String nombre, String apellido, int dni, double sueldo) {
      super(nombre, apellido, dni);
      this.sueldo = sueldo;
    }
  
    @Override
    public String toString() {
      return "\n" + super.toString() + "\nSueldo: " + this.sueldo;
    }
}

class Caja {
    private Empleado empleado;
    private int nroCaja;
  
    public Caja(Empleado empleado, int nroCaja) {
        this.empleado = empleado;
        this.nroCaja = nroCaja;
    }
  
    @Override
    public String toString() {
      return this.empleado.toString() + "\nNro de caja: " + this.nroCaja;
    }
  
}

class Cliente extends Humane {
  
    private boolean mayorista;
  
    public Cliente(String nombre, String apellido, int dni, boolean mayorista) {
      super(nombre, apellido, dni);
      this.mayorista = mayorista;
    }
  
    @Override
    public String toString() {
      return "\n" + super.toString() + "\nMayorista: " + this.mayorista;
    }
  
}

class Producto {
    private String nombre;
    double precio;
    int cantidad;
  
    public Producto(String nombre, double precio, int cantidad) {
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cantidad;
    }
  
    @Override
    public String toString() {
      return "Nombre: " + this.nombre + "\nPrecio: " + this.precio + "\nCantidad: " + this.cantidad;
    }
  
}

class Transaccion {
    private Cliente cliente;
    private Caja caja;
    private List<Producto> productos;
    private double total;
  
    public Transaccion(Cliente cliente, Caja caja) {
      this.cliente = cliente;
      this.caja = caja;
      this.productos = new ArrayList<>();
      this.total = 0;
    }
  
    public void agregarProducto(Producto producto) {
      this.productos.add(producto);
      this.total += producto.precio * producto.cantidad;
    }
  
    @Override
    public String toString() {
      String resultado = "Cliente: " + this.cliente.toString() + "\nCaja: " + this.caja.toString() + "\nProductos:\n";
      for (Producto producto : this.productos) {
        resultado += producto.toString() + "\n";
      }
      resultado += "Total: " + this.total;
      return resultado;
    }
  
}

public class EjerProductos {
    public static void main(String[] args) {
  
      Cliente cliente = new Cliente("Juan", "Perez", 12345678, true);
      Empleado empleado = new Empleado("Maria", "Garcia", 98765432, 2000);
      Caja caja = new Caja(empleado, 1);
  
      Producto producto1 = new Producto("Lapicero", 10, 2);
      Producto producto2 = new Producto("Cuaderno", 20, 1);
  
      Transaccion transaccion = new Transaccion(cliente, caja);
      transaccion.agregarProducto(producto1);
      transaccion.agregarProducto(producto2);
  
      System.out.println(transaccion);
    }
}