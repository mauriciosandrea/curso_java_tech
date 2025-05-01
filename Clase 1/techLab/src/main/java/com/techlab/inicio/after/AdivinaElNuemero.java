package com.techlab.inicio.after;
import java.util.Scanner;
import java.util.Random;

public class AdivinaElNuemero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa tu nombre: ");
        String usuario = scanner.nextLine();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentosMaximos = 7;
        int intento;
        boolean adivino = false;

        System.out.println("¡Bienvenido/a " + usuario + " al juego de Adivina el Numero!");
        System.out.println("Estoy pensando un numero entre 1 y 100.");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinarlo.");

        for(int i = 1; i <= intentosMaximos ; i++) {
            System.out.println("Intento " + i + ": ingresa tu número: ");
            intento = scanner.nextInt();

            if(intento == numeroSecreto) {
                System.out.println("🎉 ¡Felicidades " + usuario + "! Adivinaste el número en el intento " + i + ".");
                adivino = true;
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("❌ Muy bajo. Intenta con un número más alto.");
            } else {
                System.out.println("❌ Muy alto. Intenta con un número más bajo.");
            }


        }
        if(!adivino) {
            System.out.println("😢 Se acabaron los intentos. El número era: " + numeroSecreto);
        }

        System.out.println("Gracias por jugar. ¡Nos vemos!");

    }
}