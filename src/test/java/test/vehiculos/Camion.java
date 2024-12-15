package vehiculos;
import vehiculos.Vehiculo;
import vehiculos.Fabricante;

public class Camion extends Vehiculo{
    private int ejes;
    protected static int cantidadVehiculos;

    public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
        this.placa = placa;
        this.puertas = 2;
        this.velocidadMaxima = 80;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = "4X2";
        this.fabricante = fabricante;
        this.ejes = ejes;
        cantidadVehiculos ++;
        this.fabricante.venta();
    }

    public void setEjes(int ejes){this.ejes = ejes;}

    public int getEjes(){return ejes;}
}
