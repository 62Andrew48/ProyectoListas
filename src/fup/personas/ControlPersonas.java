/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.personas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class ControlPersonas {

    ArrayList registro = new ArrayList();

    Scanner scan = new Scanner(System.in);

    //Método para Añadir Personas a la Lista
    void agregarPersonas() {

        //Pedir los datos
        System.out.print("Digite el Nombre de la Persona: ");
        String nombre = scan.next();
        System.out.print("Digite el Apellido de la Persona: ");
        String apellido = scan.next();
        System.out.print("Digite la Cédula de la Persona: ");
        int ID = scan.nextInt();

        //Creó un objeto de tipo Persona
        Persona per = new Persona();

        //Seteó los datos que digito el usuario
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setCédula(ID);

        //Agregó el objeto a la Lista
        registro.add(per);

        System.out.println("Datos de la Persona registrados exitosamente!");
    }

    //Método para Consultar todos los Datos
    void consultarTodo() {
        if (registro.isEmpty()) {
            System.out.println("No hay Personas registradas!!!");
            
        } else {

            System.out.println("Listando...");
            for (int i = 0; i < registro.size(); i++) {
                Persona perRecuperada = (Persona) registro.get(i);

                System.out.println(perRecuperada.getNombre() + " / "
                        + perRecuperada.getApellido() + " / "
                        + perRecuperada.getCédula());
            }
        }
    }

    //Método para Buscar por Cédula
    void buscarPorCedula() {
        System.out.println("Buscando por Cédula");
        System.out.print("Digite la Cédula para Buscar a la Persona: ");
        int idBuscar = scan.nextInt();
        
        boolean bandera = false;
        for (int i = 0; i < registro.size(); i++) {
            Persona perEncontrada = (Persona) registro.get(i);
            
            //Tomó la Cédula del Objeto y la comparo
            if (perEncontrada.getCédula() == idBuscar) {
                System.out.println("Nombre de la Persona: " + perEncontrada.getNombre());
                System.out.println("Apellido de la Persona: " + perEncontrada.getApellido());
                bandera = true;
            }
        }
        
        if (bandera == false) {
            System.out.println("Persona NO registrada!!!");
        }
    }
    
    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n***MENÚ DE OPCIONES***
                               **GESTIÓN DE PERSONAS**
                               
                               1. Registrar Personas
                               2. Consultar Todos los Registros
                               3. Buscar por Cédula
                               4. Salir
                               
                               Opción:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.agregarPersonas();
                    break;
                case 2:
                    this.consultarTodo();
                    break;
                case 3:
                    this.buscarPorCedula();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }//Cierra el Menú
}
