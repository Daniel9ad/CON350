/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author Daniel
 */
public class Director {
    private CelularBuilder builder;
    
    public Director(CelularBuilder builder){
        this.builder = builder;
    }
    
    public void builderCelular(){
        builder.createCelular();
        builder.definirMarca();
        builder.definirTamano();
        builder.definirColor();
        builder.montarMenoria();
        builder.montarProcesador();
        builder.montarBateria();
    }
    
    public Celular getCelular(){
        return builder.getCelular();
    }
}
