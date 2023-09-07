/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionzoologico;

/**
 *
 * @author Daniel
 */
public class Peses implements IFabricaAbstracta{
        @Override
    public IMamiferos getMamifero(String tipo) {
        return null;
    }

    @Override
    public IAves getAve(String tipo) {
        return null;
    }

    @Override
    public IPeses getPez(String tipo) {
        if (tipo.equalsIgnoreCase("Pacu")) {
            return new Pacu();
	} else if (tipo.equalsIgnoreCase("Zabalo")) {
            return new Zabalo();
	}
        return null;
    }
}
