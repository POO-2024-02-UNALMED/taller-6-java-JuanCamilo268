package vehiculos;

public class Fabricante {
    private static Fabricante[] lista = new Fabricante[0];
    private String nombre;
    private Pais pais;
    private int ventas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        int x = lista.length;
        Fabricante[] A = new Fabricante[x+1];
        for (int i = 0; i < lista.length + 1; i++ ){
            A[i] = lista[i];
        }
        A[x] = this;
        lista = A;
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setPais(Pais pais){this.pais = pais;}

    public String getNombre(){return nombre;}
    public Pais getPais(){return pais;}

    public void venta(){
        ventas ++;
        pais.exportacion ++;
    }
    public static Fabricante fabricaMayorVendedor(){
        Fabricante potencia = lista[0];
        for (Fabricante fabrica: lista) {
            if (fabrica.ventas > potencia.ventas) {
                potencia = fabrica;
            }
        }
        return potencia;
    }
}

