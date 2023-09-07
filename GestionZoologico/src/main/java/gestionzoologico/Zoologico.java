/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionzoologico;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class Zoologico {
    private String nombre;
    private List<Jaula> jaulas = new ArrayList<>();
    private String direccion;
    private int telefono;
    
    public Zoologico(String nombre, List<Jaula> jaulas, String direccion, int telefono){
        this.nombre = nombre;
        this.jaulas = jaulas;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the jaulas
     */
    public List<Jaula> getJaulas() {
        return jaulas;
    }

    /**
     * @param jaulas the jaulas to set
     */
    public void setJaulas(List<Jaula> jaulas) {
        this.jaulas = jaulas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del zoológico: ").append(nombre).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("Teléfono: ").append(telefono).append("\n");
        sb.append("Numero de Jaulas:").append(jaulas.size());
        return sb.toString();
    }
}
