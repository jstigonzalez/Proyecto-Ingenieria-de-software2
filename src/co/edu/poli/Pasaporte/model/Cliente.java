package co.edu.poli.Pasaporte.model;

import java.util.Scanner;

public class Cliente {

    private String nombre;
    private Pasaporte pasaporte; 

   
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", pasaporte=" + pasaporte + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        Cliente cliente = new Cliente(nombreCliente); 

        // Datos del pasaporte
        System.out.print("Ingrese el ID del pasaporte: ");
        String idPasaporte = sc.nextLine();

        // Datos del titular
        System.out.print("Ingrese el ID del titular: ");
        String idTitular = sc.nextLine();
        System.out.print("Ingrese el nombre del titular: ");
        String nombreTitular = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento del titular: ");
        String fechaTitular = sc.nextLine();
        Titular titular = new Titular(idTitular, nombreTitular, fechaTitular); 

        // Datos del país
        System.out.print("Ingrese el código del país: ");
        String codigoPais = sc.nextLine();
        System.out.print("Ingrese el nombre del país: ");
        String nombrePais = sc.nextLine();
        System.out.print("Ingrese la ciudad: ");
        String ciudadPais = sc.nextLine();
        Pais pais = new Pais(codigoPais, nombrePais, ciudadPais); 

        // Crear el pasaporte
        Pasaporte pasaporte = new Pasaporte(idPasaporte, titular, pais);

        // Asignar el pasaporte al cliente
        cliente.setPasaporte(pasaporte);

        // Mostrar datos del cliente con su pasaporte
        System.out.println("\nCliente creado:");
        System.out.println(cliente);
        
        sc.close();
    }
}
