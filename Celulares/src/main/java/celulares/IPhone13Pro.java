/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author Daniel
 */
public class IPhone13Pro extends CelularBuilder{
        
    @Override
    public void definirMarca() {
        celular.marca = Marca.Apple;
        celular.modelo = "IPhone13Pro";
    }

    @Override
    public void definirTamano() {
        celular.tamano = new Tamano();
        celular.tamano.alto = 15.2;
        celular.tamano.ancho = 6.5;
    }

    @Override
    public void definirColor() {
        celular.color = Color.Blanco;
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
