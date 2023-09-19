/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celulares;

/**
 *
 * @author Daniel
 */
public class Celular {
    public String modelo;
    public Marca marca;
    public Tamano tamano;
    public Color color;
    public Memoria memoria;
    public Procesador procesador;
    public Bateria bateria;
    
    public void Mostrar(){
        System.out.println(modelo);
        System.out.println(marca);
        System.out.println(tamano.alto+"x"+tamano.ancho);
        System.out.println(color);
        System.out.println("-------------------------------");
    }
    
}

enum Marca{
    Apple,
    Samsung,
    Huawei,
    Sony,
    LG
}

class Tamano{
    public double ancho;
    public double alto;
}

enum Color{
    Negro,
    Blanco,
    Plomo,
    Azul,
    Rojo,
    Verde
}

class Memoria{
    public String modelo;
    public double capacidad;
    public String tipo;
    public double velocidadAcceso;
}

class Procesador{
    public String modelo;
    public double velocidadReloj;
    public String arquitectura;
    public int nucleos;
}

class Bateria{
    public String modelo;
    public double capacidad;
    public double voltaje;
}

