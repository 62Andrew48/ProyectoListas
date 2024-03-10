/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.ciudades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class ControlCiudades {

    ArrayList registro = new ArrayList();

    Scanner scan = new Scanner(System.in);

    //Método para Añadir Ciudades a la Lista
    void agregarCiudades() {

        //Pedir los datos
        System.out.print("Digite el Nombre de la Ciudad: ");
        String nombre = scan.next();
        System.out.print("Digite  el Número de Habitantes de la Ciudad: ");
        int num_Habitantes = scan.nextInt();
        System.out.print("Digite la Temperatura de la Ciudad: ");
        double temperatura = scan.nextDouble();

        //Creó un objeto de tipo Ciudad
        Ciudad city = new Ciudad();

        //Seteó los datos que digito el usuario
        city.setNombre(nombre);
        city.setNum_Habitantes(num_Habitantes);
        city.setTemperatura(temperatura);

        //Agregó el objeto a la Lista
        registro.add(city);

        System.out.println("Datos de la Ciudad registradas exitosamente!");
    }

    //Método para Consultar todos los Datos
    void consultarTodo() {
        if (registro.isEmpty()) {
            System.out.println("No hay Ciudades registradas!!!");

        } else {

            for (int i = 0; i < registro.size(); i++) {
                Ciudad cityRecuperada = (Ciudad) registro.get(i);
                System.out.println(cityRecuperada.getNombre() + " / "
                        + cityRecuperada.getNum_Habitantes() + " / "
                        + cityRecuperada.getTemperatura());
            }
        }
    }

    //Método para Buscar por Nombre
    void buscarPorNombre() {
        System.out.print("Digite el Nombre de la Ciudad para buscarla: ");
        String nameBuscar = scan.next();

        boolean bandera = false;
        for (int i = 0; i < registro.size(); i++) {
            Ciudad cityEncontrada = (Ciudad) registro.get(i);

            //Tomó el Nombre del Objeto y la comparo
            if (nameBuscar.equals(cityEncontrada.getNombre())) {
                System.out.println("Número de Habitantes: " + cityEncontrada.getNum_Habitantes());
                System.out.println("La Temperatura: " + cityEncontrada.getTemperatura());
                bandera = true;
            }
        }

        if (bandera == false) {
            System.out.println("Ciudad NO registrada!!!");
        }
    }

    //Método para Hallar el Promedio de Temperatura de las Ciudades
    void promediar() {
        double suma = 0;
        double promedio;
        System.out.println("Promedio de la Temperatura de las Ciudades");
        for (int i = 0; i < registro.size(); i++) {
            Ciudad TempCiudad = (Ciudad) registro.get(i);

            //Tomó la Temperatura del Objeto y la promedio
            suma += TempCiudad.getTemperatura();
        }
        
        //Hallo el Promedio
        promedio = suma / registro.size();
        System.out.println("El Promedio de la Temperatura es: " + promedio);
    }

    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n**MENÚ DE OPCIONES**
                               **GESTIÓN DE CIUDADES**
                               
                               1. Registrar Ciudades
                               2. Consultar Todos los Registros
                               3. Buscar por Nombre
                               4. Promedio de la Temperatura
                               5. Salir
                               
                               Opcion:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.agregarCiudades();
                    break;
                case 2:
                    this.consultarTodo();
                    break;
                case 3:
                    this.buscarPorNombre();
                    break;
                case 4:
                    this.promediar();
                    break;
            }
        } while (opcion > 0 && opcion < 5);
    }
}
