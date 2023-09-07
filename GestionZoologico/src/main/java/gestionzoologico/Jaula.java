/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionzoologico;

/**
 *
 * @author Daniel
 */
public class Jaula {
    private Object animal;
    private double alto;
    private double ancho;
    private double largo;
    
    public Jaula(Object animal, double alto, double ancho, double largo){
        this.animal = animal;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    /**
     * @return the animal
     */
    public Object getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(Object animal) {
        this.animal = animal;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }
    
}
