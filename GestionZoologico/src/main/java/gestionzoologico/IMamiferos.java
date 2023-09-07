/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestionzoologico;

/**
 *
 * @author Daniel
 */
public abstract class IMamiferos {
    private String nombre;
    private double temperatura;
    private int nrodepatas;
    private String color;

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
     * @return the temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the nrodepatas
     */
    public int getNrodepatas() {
        return nrodepatas;
    }

    /**
     * @param nrodepatas the nrodepatas to set
     */
    public void setNrodepatas(int nrodepatas) {
        this.nrodepatas = nrodepatas;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
