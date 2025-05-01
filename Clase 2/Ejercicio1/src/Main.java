import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1️⃣ Registro del stock de productos
        int stockDisponible = 50;

        // 2️⃣ Cálculo del costo total de un pedido
        int precioUnitario = 150;
        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = input.nextInt();
        int costoTotal = precioUnitario * cantidad;
        System.out.println("El costo total del pedido es: $" + costoTotal);

        // 3️⃣ Solicitud de datos para personalizar la experiencia
        input.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = input.nextLine();
        System.out.println("¡Bienvenido, " + nombreCliente + "! Gracias por su compra.");

        // 4️⃣ Verificación de stock
        if (cantidad <= stockDisponible) {
            System.out.println("✅ Hay suficiente stock para cubrir su pedido.");
        } else {
            System.out.println("❌ Lo sentimos, no tenemos stock suficiente.");
        }

        // 5️⃣ Procesar lista de productos pendientes con while
        System.out.println("\n📋 Lista de productos pendientes (WHILE):");
        String[] productosPendientes = {"Teclado", "Mouse", "Monitor", "Notebook"};
        int i = 0;
        while (i < productosPendientes.length) {
            System.out.println("- " + productosPendientes[i]);
            i++;
        }

        // 6️⃣ Procesar lista de productos pendientes con for (más elegante)
        System.out.println("\n📋 Lista de productos pendientes (FOR):");
        for (int j = 0; j < productosPendientes.length; j++) {
            System.out.println("- " + productosPendientes[j]);
        }

        input.close();
    }
}
