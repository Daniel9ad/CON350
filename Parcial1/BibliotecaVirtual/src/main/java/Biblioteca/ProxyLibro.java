/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Daniel
 */
public class ProxyLibro implements Libro{
    
    private Libro libro;
    private String usuario;

    public ProxyLibro(Libro libro, String usuario) {
        this.libro = libro;
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        System.out.println("Verificando permisos");
        if (this.usuario == "Daniel"){
            System.out.println("Autorizado");
            libro.leer();
        }else{
            System.out.println("No Autorizado");
        }
    }    
}
