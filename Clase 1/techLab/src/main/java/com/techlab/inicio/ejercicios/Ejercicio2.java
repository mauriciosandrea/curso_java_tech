package com.techlab.inicio.ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables
        double precioProducto = 150.0;
        int cantidadDeseada = 3;
        double costoTotal = precioProducto * cantidadDeseada;
        System.out.println("Costo total: $" + costoTotal);

        precioProducto = 200.0;
        costoTotal = precioProducto * cantidadDeseada;
        System.out.println("Nuevo Costo total: $" + costoTotal);

        System.out.println("Ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Cuantos productos queres comprar: ");
        int cantidadCompra = scanner.nextInt();

        double precioFijoUnidad = 120.0;
        double totalCompra = precioFijoUnidad * cantidadCompra;

        if (cantidadCompra >= 100) {
            System.out.println("Felicitaciones se te aplico un descuento");
        }

        // 🔹 Bucles - for
        System.out.print("Ingresá un número (usaremos for para contar): ");
        int numero = scanner.nextInt();

        System.out.println("Contando con for:");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        // 🔹 Bucles - while
        System.out.print("Ingresá otro número (usaremos while para contar): ");
        int numeroWhile = scanner.nextInt();

        System.out.println("Contando con while:");
        int contador = 1;
        while (contador <= numeroWhile) {
            System.out.println(contador);
            contador++;
        }
    }
}