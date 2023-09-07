/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gestionzoologico;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class GestionZoologico {

    public static void main(String[] args) {
        // Mamifero
        IFabricaAbstracta fabricaMamiferos = FabricaAnimales.getFactory("Mamiferos");
        IMamiferos leon = fabricaMamiferos.getMamifero("Leon");
        System.out.println(leon.toString());
        // Ave
        IFabricaAbstracta fabricaAves = FabricaAnimales.getFactory("Aves");
        IAves loro = fabricaAves.getAve("Loro");
        System.out.println(loro.toString());
        // Pez
        IFabricaAbstracta fabricaPeses = FabricaAnimales.getFactory("Peses");
        IPeses pacu = fabricaPeses.getPez("Pacu");
        System.out.println(pacu.toString());
        // Jaulas
        List<Jaula> jaulas = new ArrayList<>();
        jaulas.add(new Jaula(leon, 4,4,4));
        jaulas.add(new Jaula(loro, 0.5,0.5,0.5));
        jaulas.add(new Jaula(pacu, 0.5,0.5,0.5));
        // Zoologico
        Zoologico z = new Zoologico("Zoologico",jaulas,"av dsf",43943);
        System.out.println(z.toString());
    }
}
