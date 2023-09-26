/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Biblioteca;

/**
 *
 * @author Daniel
 */
public class BibliotecaVirtual {

    public static void main(String[] args) {
        // Se crea un libro y usuario
        LibroReal libro = new LibroReal("titulo1","Auotor1",2000,"dkfjsdlfjsdkfjslkf sfdlsk jfdslkfjsf ");
        String usuario = "Daniel";
        // Se crea un proxy para poder leer el libro
        ProxyLibro proxy = new ProxyLibro(libro, usuario);
        proxy.leer();
    }
}
