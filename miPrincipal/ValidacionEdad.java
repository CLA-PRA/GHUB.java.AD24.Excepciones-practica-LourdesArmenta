package miPrincipal;

import java.util.Scanner;

public class ValidacionEdad{
    public static void validar(Scanner scanner) throws EdadInvalidaException{
        

        try {
            System.out.print("Ingresa tu edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            validarEdad(edad);

            System.out.println("La edad ingresada es válida: " + edad + " años.");

        } catch (NumberFormatException e) {
            throw new EdadInvalidaException("Error: Entrada no válida. Por favor, ingresa un número.");
        } catch (EdadInvalidaException e) {
            throw e;
        } catch (Exception e) {
            throw new EdadInvalidaException("Ha ocurrido un error inesperado: " + e.getMessage());
        }
        
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 150) {
            throw new EdadInvalidaException("Entrada no válida. Por favor, ingrese un número mayor que 0 y menor que 50");
        }
    }

    public static boolean esMayorDeEdad(int edad){
        
        return (edad>=18);

    }
}