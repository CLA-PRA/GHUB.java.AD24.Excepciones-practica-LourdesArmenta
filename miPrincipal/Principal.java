package miPrincipal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("Menú Principal:");
                System.out.println("1. Conversión de Temperatura");
                System.out.println("2. Validación de Edad");
                System.out.println("3. Operaciones con Matrices");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                switch (opcion) {
                    case 1:
                        ConversionTemperaturas.conversion(scanner);
                        break;
                    case 2:
                        ValidacionEdad.validar(scanner);
                        break;
                    case 3:
                        OperacionesMatrices.menu(scanner);
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada incorrecta
            } catch (EdadInvalidaException e) {
               System.out.println(e.getMessage());            
               e.printStackTrace();
            } 
        } while (opcion != 4);

        scanner.close();
    }
    
}