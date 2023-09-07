/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionzoologico;
/**
 *
 * @author Daniel
 */
public class Mamiferos implements IFabricaAbstracta{
    @Override
    public IMamiferos getMamifero(String tipo) {
        if (tipo.equalsIgnoreCase("Leon")) {
            //System.out.println("introduzca los datos de un leon");
            //System.out.print("Nombre:");
            //String nombre = sc.next();
            //System.out.print("Temperatura:");
            //double temperatura = Double.parseDouble(sc.next());
            //System.out.print("Nro de patas:");
            //int nrodepatas = Integer.valueOf(sc.next());
            //System.out.print("Color:");
            //String color = sc.next();
            return new Leon();
	} else if (tipo.equalsIgnoreCase("Oso")) {
            return new Oso();
	} else if (tipo.equalsIgnoreCase("Mono")) {
            return new Mono();
	}
        return null;
    }

    @Override
    public IAves getAve(String tipo) {
       return null;
    }

    @Override
    public IPeses getPez(String tipo) {
       return null;
    }
    
}
