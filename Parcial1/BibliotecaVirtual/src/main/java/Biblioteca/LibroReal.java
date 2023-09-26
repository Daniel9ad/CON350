/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Daniel
 */
public class LibroReal implements Libro{
    
    public String titulo;
    public String autor;
    public int ano;
    public String contenido;
    
    public LibroReal(String titulo, String autor, int ano, String contenido){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.contenido = contenido;
    }
    
    @Override
    public void leer() {
        System.out.println("Leyendo el libro: " + titulo);
        System.out.println(contenido);
    }
    
}
