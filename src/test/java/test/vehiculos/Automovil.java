package vehiculos;
import vehiculos.Vehiculo;
import vehiculos.Fabricante;

public class Automovil extends Vehiculo {
    private int puestos;
    protected static int cantidadVehiculos;

    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos){
        this.placa = placa;
        this.puertas = 4;
        this.velocidadMaxima = 100;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = "FWD";
        this.fabricante = fabricante;
        this.puestos = puestos;
        cantidadVehiculos ++;
        this.fabricante.venta();
    }
    public void setPuestos(int puestos){this.puestos = puestos;}

    public int getPuestos(){return puestos;}
}
