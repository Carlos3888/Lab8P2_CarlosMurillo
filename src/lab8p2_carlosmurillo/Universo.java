package lab8p2_carlosmurillo;

import java.util.ArrayList;

public class Universo {
    private String nombre;
    private int numero;
    private ArrayList lista;

    public Universo() {
    }

    public Universo(String nombre, int numero, ArrayList lista) {
        this.nombre = nombre;
        this.numero = numero;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", numero de seres vivoss=" + numero + ", lista=" + lista + '}';
    }
    
    
}
