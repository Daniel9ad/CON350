/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestionzoologico;

/**
 *
 * @author Daniel
 */
public interface IFabricaAbstracta {
    IMamiferos getMamifero(String tipo);
    IAves getAve(String tipo);
    IPeses getPez(String tipo);
}
