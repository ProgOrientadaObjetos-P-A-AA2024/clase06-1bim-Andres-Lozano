
package paquete3;

import java.util.Scanner;

import java.util.ArrayList;


public class Venta {

    Scanner sc = new Scanner(System.in);
    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta(ArrayList<Computador> c) {
        computadoras = c;

    }



    public void obtenerComputadoras(ArrayList<Computador> p) {

        computadoras = p;
    }
    public ArrayList<Computador> obtenerComputadoras(){
        return computadoras;
         
    }
    
    
    

}
