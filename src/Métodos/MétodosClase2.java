/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Métodos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class MétodosClase2 {
    
    ArrayList registro = new ArrayList();

    Scanner scan = new Scanner(System.in);
    
    //Método para Buscar por Serial (int)
    void buscarPorSerial() {
        System.out.print("Digite el Serial del Electrodoméstico para Buscarlo: ");
        int serialBuscar = scan.nextInt();
        
        boolean bandera = false;
        for (int i = 0; i < registro.size(); i++) {
            NombreDeLaClase2 ElecEncontrado = (NombreDeLaClase2) registro.get(i);
            
            //Tomó el Serial del Objeto y la comparo
            if (ElecEncontrado.getSerial() == serialBuscar) {
                System.out.println("Marca del Electrodoméstico: " + ElecEncontrado.getMarca());
                System.out.println("Precio del Electrodoméstico: " + ElecEncontrado.getPrecio());
                bandera = true;
            }
        }
        
        if (bandera == false) {
            System.out.println("Electrodoméstico NO registrado!!");
        }
    }
}
