package miPrincipal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
   
    public static void main(String[] args) {
        //Declara objeto Scannr
        int opcion = 0;

        do {
            //coloca el menu dentro de un bloque try
            
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
            } //coloca el codigo correspondiente para validar que se capture un número
            
               
                scanner.next(); // Limpiar la entrada incorrecta
            }//coloca un codigo correspondiente para atrapar laexcepcion  EdadInvalidaException
             //coloca el codigo apropiado 
            
              
            
        } while //coloque lo faltante

        scanner.close();
    }
    
}