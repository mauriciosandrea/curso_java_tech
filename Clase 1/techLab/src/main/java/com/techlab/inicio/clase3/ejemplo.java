package com.techlab.inicio.clase3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ejemplo {
    public static void main(String[] args) {
        //String nombre = "mauricio" ;

       //nombre = "mauri" ;

       // System.out.println(nombre +" hincha de river plate");

        String nombre = "juan";
        String apellido = "ovejero";

        nombre = nombre.toUpperCase().charAt(0) + apellido.substring(1);
        apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1);

        System.out.println(nombre + apellido);

        String url = "https://www.google.com.ar";

        String [] partesUrl = url.split("/");
        System.out.println(Arrays.toString(partesUrl));
    }
}
