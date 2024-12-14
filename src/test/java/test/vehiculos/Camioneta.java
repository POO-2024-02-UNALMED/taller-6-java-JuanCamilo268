package test.vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = 90;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = "4X4";
        this.fabricante = fabricante;
        this.volco = volco;
        Vehiculo.cantidadVehiculos++;
        Vehiculo.camioneta();
    }

    public void setVolco(boolean volco){this.volco = volco;}

    public boolean isVolco(){return volco;}
}
