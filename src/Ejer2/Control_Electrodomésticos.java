/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Control_Electrodomésticos {

    ArrayList registro = new ArrayList();

    Scanner scan = new Scanner(System.in);

    //Método para Añadir Electrodomésticos a la Lista
    void agregarElectrodomesticos() {

        //Pedir los Datos
        System.out.print("Digite la Serial del Electrodoméstico: ");
        int serial = scan.nextInt();
        System.out.println("Digite la Marca del Electrodoméstico: ");
        String marca = scan.next();
        System.out.println("Digite el Precio del Electrodoméstico: ");
        double precio = scan.nextDouble();

        //Creó un Objeto de tipo Electrodoméstico
        Electrodoméstico appliance = new Electrodoméstico();

        //Seteó los datos que digito el usuario
        appliance.setSerial(serial);
        appliance.setMarca(marca);
        appliance.setPrecio(precio);

        //Agregó el Objeto a la Lista
        registro.add(appliance);

        System.out.println("Datos del Electrodoméstico registrados!!");
    }

    //Método para Consultar todos los Datos
    void consultarTodo() {
        if (registro.isEmpty()) {
            System.out.println("No hay Electrodomésticos registrados!");

        } else {

            for (int i = 0; i < registro.size(); i++) {
                Electrodoméstico ElecRecuperado = (Electrodoméstico) registro.get(i);

                System.out.println(ElecRecuperado.getSerial() + " / "
                        + ElecRecuperado.getMarca() + " / "
                        + ElecRecuperado.getPrecio());
            }
        }
    }
    
    //Método para Buscar por Serial
    void buscarPorSerial() {
        System.out.print("Digite el Serial del Electrodoméstico para Buscarlo: ");
        int serialBuscar = scan.nextInt();
        
        boolean bandera = false;
        for (int i = 0; i < registro.size(); i++) {
            Electrodoméstico ElecEncontrado = (Electrodoméstico) registro.get(i);
            
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
    
    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n**MENÚ DE OPCIONES**
                               *GESTIÓN DE ELECTRODOMÉSTICO*
                               
                               1. Registrar Electrodomésticos
                               2. Consultar todos los Electrodomésticos
                               3. Buscar por Serial
                               4. Salir
                               
                               Opción:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.agregarElectrodomesticos();
                    break;
                case 2:
                    this.consultarTodo();
                    break;
                case 3:
                    this.buscarPorSerial();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }
}
