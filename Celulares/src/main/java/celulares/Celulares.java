/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package celulares;

/**
 *
 * @author Daniel
 */
public class Celulares {

    public static void main(String[] args) {
        Director director = new Director(new IPhone13Pro());
        director.builderCelular();
        Celular c1 = director.getCelular();
        c1.Mostrar();
        
        Director director2 = new Director(new GalaxyS21());
        director2.builderCelular();
        Celular c2 = director2.getCelular();
        c2.Mostrar();
        
        Director director3 = new Director(new Xperia1III());
        director3.builderCelular();
        Celular c3 = director3.getCelular();
        c3.Mostrar();
        
        Director director4 = new Director(new P40Pro());
        director4.builderCelular();
        Celular c4 = director4.getCelular();
        c4.Mostrar();
    }
}
