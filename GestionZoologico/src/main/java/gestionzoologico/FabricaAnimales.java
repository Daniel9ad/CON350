/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionzoologico;

/**
 *
 * @author Daniel
 */
public class FabricaAnimales {
    public static IFabricaAbstracta getFactory(String tipoFabrica) {

	if (tipoFabrica.equalsIgnoreCase("Mamiferos")) {
            return new Mamiferos();
        } else if (tipoFabrica.equalsIgnoreCase("Aves")) {
            return new Aves();
	} else if (tipoFabrica.equalsIgnoreCase("Peses")){
            return new Peses();
        }
        
	return null;
    }
}
