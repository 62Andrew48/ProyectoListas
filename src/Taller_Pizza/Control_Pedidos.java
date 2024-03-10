/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_Pizza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Control_Pedidos {

    ArrayList cliente = new ArrayList();

    Scanner scan = new Scanner(System.in);
    
    int código = 1;
    
    //Método para Añadir los Pedidos a la Lista
    void agregarPedidos() {
        System.out.println("\n**Pedido del Cliente**");

        //Pedir los Datos
        System.out.print("Digite el Celular del Cliente: ");
        int celular = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite la Dirección del Cliente: ");
        String dirección = scan.nextLine();
        System.out.print("Digite el Barrio del Cliente: ");
        String barrio = scan.nextLine();
        System.out.print("Digite el Nombre del Cliente: ");
        String nombre = scan.nextLine();

        //Creó un objeto de tipo Pedido
        Pedido order = new Pedido();

        //Seteó los datos que digito el usuario
        order.setCelular(celular);
        order.setDirección(dirección);
        order.setBarrio(barrio);
        order.setNombre(nombre);
        
        //Asignar un código al Pedido
        order.setCódigo(código++);
        
        //Agregó el Objeto a la Lista
        cliente.add(order);
        System.out.println("Datos del Pedido registrados!!");
    }

    //Método para Consultar todos los Datos
    void listarTodo() {
        if (cliente.isEmpty()) {
            System.out.println("No hay ningún Pedido registrado!!");

        } else {
            
            System.out.println("Código / Celular / Dirección / Barrio / Nombre");
            for (int i = 0; i < cliente.size(); i++) {
                Pedido PedidoRecuperado = (Pedido) cliente.get(i);
                System.out.println();
                System.out.println(PedidoRecuperado.getCódigo() + " / "
                        + PedidoRecuperado.getCelular() + " / "
                        + PedidoRecuperado.getDirección() + " / "
                        + PedidoRecuperado.getBarrio() + " / "
                        + PedidoRecuperado.getNombre());
            }
        }
    }
    
    //Método para Eliminar 1 Pedido
    void eliminarPedido() {
        System.out.print("Digite el Código de Pedido a Eliminar: ");
        int códigoEliminar = scan.nextInt();
        
        for (int i = 0; i < cliente.size(); i++) {
            Pedido PedidoEliminado = (Pedido) cliente.get(i);
            if (PedidoEliminado.getCódigo() == códigoEliminar) {
                cliente.remove(i);
                System.out.println("Pedido eliminado exitosamente!");
                código--;
                return;
            }
        }
        System.out.println("No se encontró ningún pedido con ese Código");
    }
    
    //Método para Borrar todos Pedidos
    void borrarPedidos() {
        cliente.clear();
        código = 1; //Reiniciar el Contador de Códigos
        System.out.println("Todos los Pedidos han sido Borrados!!");
    }
    
    //Método para Buscar por Barrio
    void buscarPorBarrio() {
        System.out.print("Digite el Barrio para Buscar el Pedido: ");
        scan.nextLine();
        String barrioBuscar = scan.nextLine();
        
        boolean bandera = false;
        for (int i = 0; i < cliente.size(); i++) {
            Pedido PedidoEncontrado = (Pedido) cliente.get(i);
            
            //Tomó el Barrio del Objeto y la comparo
            if (barrioBuscar.equals(PedidoEncontrado.getBarrio())) {
                System.out.println("Celular del Cliente: " + PedidoEncontrado.getCelular());
                System.out.println("Dirección del Cliente: " + PedidoEncontrado.getDirección());
                System.out.println("Nombre del Cliente: " + PedidoEncontrado.getNombre());
                bandera = true;
            }
        }
        
        if (bandera == false) {
            System.out.println("Pedido NO registrado!!");
        }
    }
    
    //Menú
    void menu() {
        int opción = 0;
        do {
            System.out.println("""
                               \n**MENÚ DE OPCIONES**
                               **GESTIÓN DE PEDIDOS**
                               
                               1. Registrar Pedidos
                               2. Listar los Pedidos
                               3. Eliminar 1 Pedido
                               4. Borrar todos los Pedidos
                               5. Buscar el Pedido por el Barrio
                               6. Salir
                               
                               Opción:""");
            opción = scan.nextInt();
            switch (opción) {
                case 1:
                    this.agregarPedidos();
                    break;
                case 2:
                    this.listarTodo();
                    break;
                case 3:
                    this.eliminarPedido();
                    break;
                case 4:
                    this.borrarPedidos();
                    break;
                case 5:
                    this.buscarPorBarrio();
                    break;
            }
        } while (opción > 0 && opción < 6);
    }
}
