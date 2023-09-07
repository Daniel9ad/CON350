/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionzoologico;

/**
 *
 * @author Daniel
 */
public class Aves implements IFabricaAbstracta{
    
    @Override
    public IMamiferos getMamifero(String tipo) {
        return null;
    }

    @Override
    public IAves getAve(String tipo) {
        if (tipo.equalsIgnoreCase("Loro")) {
            return new Loro();
	} else if (tipo.equalsIgnoreCase("Aguila")) {
            return new Aguila();
	} else if (tipo.equalsIgnoreCase("Condor")) {
            return new Condor();
	}
        return null;
    }

    @Override
    public IPeses getPez(String tipo) {
       return null;
    }
}
