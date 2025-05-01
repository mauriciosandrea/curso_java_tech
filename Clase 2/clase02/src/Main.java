//clase numero 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int precioUnitario = 200;
        int cantidad = 100;
        int costoTotal = precioUnitario * cantidad; // 2000
        System.out.println("El costo total del pedido es: $" + costoTotal);

        //clase scanner para leer datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingresá tu nombre: ");
        String nombreCliente = sc.nextLine();
        System.out.println("¡Bienvenide a nuestra tienda, " + nombreCliente + "!");
        
    }
}




