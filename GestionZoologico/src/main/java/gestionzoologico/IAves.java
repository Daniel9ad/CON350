/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestionzoologico;

/**
 *
 * @author Daniel
 */
public abstract class  IAves {
    private String nombre;
    private double peso;
    private double tamanoalas;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the tamanoalas
     */
    public double getTamanoalas() {
        return tamanoalas;
    }

    /**
     * @param tamanoalas the tamanoalas to set
     */
    public void setTamanoalas(double tamanoalas) {
        this.tamanoalas = tamanoalas;
    }
}
