package lab8p2_carlosmurillo;

import java.io.Serializable;

public class SerVivo implements Serializable{
    private String nombre;
    private String id;
    private int nivel;
    private int edad;
    private String universo;
    private String raza;
    
    private static final long SerialVersionUID=88L;

    public SerVivo() {
    }

    public SerVivo(String nombre, String id, int nivel, int edad, String universo, String raza) {
        this.nombre = nombre;
        this.id = id;
        this.nivel = nivel;
        this.edad = edad;
        this.universo = universo;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", ID=" + id + ", Nivel de Poder=" + nivel + ", Años=" + edad + ", Universo=" + universo + ", Raza=" + raza ;
    }
    
    
}
