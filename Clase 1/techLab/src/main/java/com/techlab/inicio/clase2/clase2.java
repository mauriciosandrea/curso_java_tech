package com.techlab.inicio.clase2;

public class clase2 {
    public static void main(String[] args) {
        /*
        // numeros enteros ( 32 bits rango -2 647.
        int saldo = 123456789 ;
        // numero enteros (64 bits - 9 898 )
        long saldo2 = 32135151l ;
        //numero entero 8bits  128 a 127
        byte edad = 23 ;
        // numeros decimales 32 bits
        float dinero = 123.3f ;
        // numeros 64 bits
        double masDinero = 1235.45025;

        // tipos booleanos
        boolean tieneDinero = true ;
        boolean hayDescuentos = false ;

        char arroba = '@';

        String nombre = "Maurcio ";

        nombre.toUpperCase();


        System.out.println(nombre.toUpperCase());

         */
        int contador = 20;
        System.out.println(contador++);
        

        int edad = 20 ;
        String nombre = "mauricio";
        if (edad >= 18 && nombre == "mauricio"){
            System.out.println("sos mayor de edad");
        } else {
            System.out.println("sos menor");
        }

    }

}