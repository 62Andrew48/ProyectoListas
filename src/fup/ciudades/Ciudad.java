/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.ciudades;

/**
 *
 * @author ANDRES GARCES
 */
public class Ciudad {
    
    //Declarar los Atributos
    private String Nombre;
    private int Num_Habitantes;
    private double Temperatura;
    
    //Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNum_Habitantes() {
        return Num_Habitantes;
    }

    public void setNum_Habitantes(int Num_Habitantes) {
        this.Num_Habitantes = Num_Habitantes;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }  
}
