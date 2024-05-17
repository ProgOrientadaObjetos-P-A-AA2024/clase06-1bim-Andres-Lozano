
package paquete3;


public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerProcesador(Procesador p) {
        procesador = p;
    }

    public void establecerMemoria(Memoria p) {
        memoria = p;
    }

    public void establecerCosto() {
        costoComputador = procesador.obtenerCosto() + memoria.obtenerCosto();

    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerCosto() {
        return costoComputador;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

}

