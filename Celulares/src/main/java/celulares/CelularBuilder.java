/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author Daniel
 */
abstract class CelularBuilder {
    protected Celular celular;
    
    public Celular getCelular(){
        return celular;
    }
    
    public void createCelular(){
        celular = new Celular();
    }
    
    public abstract void definirMarca();
    public abstract void definirTamano();
    public abstract void definirColor();
    public abstract void montarMenoria();
    public abstract void montarProcesador();
    public abstract void montarBateria();
}
