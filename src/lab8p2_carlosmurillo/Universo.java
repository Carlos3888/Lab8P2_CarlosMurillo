package lab8p2_carlosmurillo;

import java.io.Serializable;
import java.util.ArrayList;

public class Universo implements Serializable{
    private String nombre;
    private int numero;
    private ArrayList lista;
    
    private static final long SerialVersionUID=88L;

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
        return "Nombre=" + nombre + ", Numero de seres vivoss=" + numero + ", Lista de seres vivos=" + lista;
    }
    
    
}
