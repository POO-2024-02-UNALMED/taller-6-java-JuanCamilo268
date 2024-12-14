package test.vehiculos;
import java.util.ArrayList;

public class Pais {
    private static Pais[] lista = new Pais[0];
    private String nombre;
    public int exportacion = 0;

    public Pais(String nombre){
        this.nombre = nombre;
        int x = lista.length;
        Pais[] A = new Pais[x+1];
        for (int i = 0; i < lista.length + 1; i++ ){
            A[i] = lista[i];
        }
        A[x] = this;
        lista = A;
    }

    public void setNombre(String nombre){this.nombre = nombre;}

    public String getNombre(){return nombre;}

    public static Pais paisMasVendedor(){
        Pais potencia = lista[0];
        for (Pais pais: lista) {
            if (pais.exportacion > potencia.exportacion) {
                potencia = pais;
            }
        }
        return potencia;
    }
}
