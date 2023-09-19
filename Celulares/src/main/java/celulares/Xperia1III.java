/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author Daniel
 */
public class Xperia1III extends CelularBuilder{
    @Override
    public void definirMarca() {
        celular.marca = Marca.Sony;
        celular.modelo = "Xperia1III";
    }

    @Override
    public void definirTamano() {
        celular.tamano = new Tamano();
        celular.tamano.alto = 13.5;
        celular.tamano.ancho = 5.2;
    }

    @Override
    public void definirColor() {
        celular.color = Color.Negro;
    }

    @Override
    public void montarMenoria() {
        celular.memoria = new Memoria();
        
    }

    @Override
    public void montarProcesador() {
        celular.procesador = new Procesador();
    }

    @Override
    public void montarBateria() {
        celular.bateria = new Bateria();
    }
}
