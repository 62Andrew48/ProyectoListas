/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.personas;

/**
 *
 * @author ANDRES GARCES
 */
public class Persona {
    
    //Declarar Atributos
    private String Nombre;
    private String Apellido;
    private int Cédula;    
    
    //Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCédula() {
        return Cédula;
    }

    public void setCédula(int Cédula) {
        this.Cédula = Cédula;
    }  
}
