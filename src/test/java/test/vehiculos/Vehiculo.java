package test.vehiculos;

public class Vehiculo {
    private static int autos = 0;
    private static int camiones = 0;
    private static int camionetas = 0;
    protected static int cantidadVehiculos;
    protected String placa;
    protected int puertas;
    protected double velocidadMaxima;
    protected String nombre;
    protected double precio;
    protected double peso;
    protected String traccion;
    protected Fabricante fabricante;

    public Vehiculo(String placa, int puertas, double velocidad, String nombre, double precio, double peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidad;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos ++;
    }
    public Vehiculo(){cantidadVehiculos ++;}

    public void setPlaca(String placa){this.placa = placa;}
    public void setPuertas(int puertas){this.puertas = puertas;}
    public void setValocidadMaxima(double velocidad){this.velocidadMaxima = velocidad;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setPrecio(double precio){this.precio = precio;}
    public void setPeso(double peso){this.peso = peso;}
    public void setTraccion(String traccion){this.traccion= traccion;}
    public void setFabricante(Fabricante fabricante){this.fabricante = fabricante;}
    public static void setCantidadVehiculos(int x){cantidadVehiculos = x;}

    public String getPlaca(){return placa;}
    public int getPuertas(){return puertas;}
    public double getVelocidadMaxima(){return velocidadMaxima;}
    public String getNombre(){return nombre;}
    public double getPrecio(){return precio;}
    public double getPeso(){return peso;}
    public String getTraccion(){return traccion;}
    public Fabricante getFabricante(){return fabricante;}
    public static int getCantidadVehiculos(){return cantidadVehiculos;}

    public static void auto(){autos ++;}
    public static void camion(){camiones++;}
    public static void camioneta(){camionetas++;}
    public static String vehiculosPorTipo(){return "Automoviles: " + autos + "\n" +
            "Camionetas: " + camionetas + "\n" +
            "Camiones: " + camiones;}


}
