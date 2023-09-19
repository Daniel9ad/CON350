/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author Daniel
 */
public class P40Pro extends CelularBuilder{
    @Override
    public void definirMarca() {
        celular.marca = Marca.Huawei;
        celular.modelo = "P40Pro";
    }

    @Override
    public void definirTamano() {
        celular.tamano = new Tamano();
        celular.tamano.alto = 16.8;
        celular.tamano.ancho = 7.2;
    }

    @Override
    public void definirColor() {
        celular.color = Color.Rojo;
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
