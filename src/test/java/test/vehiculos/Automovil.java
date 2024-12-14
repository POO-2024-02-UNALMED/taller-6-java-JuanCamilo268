package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

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
        Vehiculo.cantidadVehiculos ++;
        Vehiculo.auto();
    }
}
