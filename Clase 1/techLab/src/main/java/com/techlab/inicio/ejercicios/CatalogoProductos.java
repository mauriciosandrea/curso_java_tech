package com.techlab.inicio.ejercicios;

public class CatalogoProductos {
    public static void main(String[] args) {
        // parte manipulacion de cadenas
        String producto = " te CHAi ";

        //eliminar espacios extras en el inicio y al final

        producto = producto.trim();

        //convertir a minusculas y luego capitalizar la primera letra de cada palabra

        String[] palabras = producto.toLowerCase().split(" ");
        StringBuilder productoFormateado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()){
                productoFormateado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(2))
                        .append(" ");
            }
        }

        // resultado sin espacios extras al final

        String productoFinal = productoFormateado.toString().trim();

        // Mostrar resultados
        System.out.println("Producto formateado: " + productoFinal);
        System.out.println("Longitud: " + productoFinal.length());
        System.out.println("Primera letra: " + productoFinal.charAt(0));
        System.out.println("¿Contiene 'Chai'? " + productoFinal.contains("Chai"));

        // Parte 2: Arrays
        String[] productosArray = new String[5];
        productosArray[0] = "Té Chai";
        productosArray[1] = "Café";
        productosArray[2] = "Mate";
        productosArray[3] = "Agua";
        productosArray[4] = "Jugo";

        System.out.println("\nCatálogo (array):");
        for (String prod : productosArray) {
            System.out.println(prod);
        }

        // Intentar agregar un sexto producto
        try {
            productosArray[5] = "Gaseosa"; // Esto lanza un error en tiempo de ejecución
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n❌ No se puede agregar un sexto producto: " + e.getMessage());
        }
    }
}


