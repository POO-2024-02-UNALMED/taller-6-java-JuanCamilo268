package test.vehiculos;

public class Camion extends Vehiculo{
    private int ejes;

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
        Vehiculo.cantidadVehiculos++;
        Vehiculo.camion();
    }

    public void setEjes(int ejes){this.ejes = ejes;}

    public int getEjes(){return ejes;}
}
