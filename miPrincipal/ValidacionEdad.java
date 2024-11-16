package miPrincipal;

import java.util.Scanner;

public class ValidacionEdad{

    /*
    
    Solicita al usuario que ingrese su edad.
    Intenta convertir la entrada del usuario a un número entero.
    Llama al método validarEdad para verificar si la edad ingresada es válida.
    Si la conversión a entero falla (por ejemplo, si el usuario ingresa texto en lugar de un número), 
    se lanza una excepción NumberFormatException y se captura, lanzando una nueva excepción EdadInvalidaException con un mensaje de error específico.
    Si la validación de la edad falla y lanza una EdadInvalidaException, esta se captura y se vuelve a lanzar.
    Si ocurre cualquier otra excepción, se captura y se lanza una nueva EdadInvalidaException con un mensaje de error que incluye el mensaje de la excepción original.
    */

        
    
    /*
     * Este método debe ser publico y estático y no regresa nada

    validarEdad en ValidacionEdad.
    verifica si la edad ingresada es válida.

    Si la edad es menor que 0 o mayor que 150, lanza una excepción EdadInvalidaException con un mensaje de error específico: "Entrada no válida. Por favor, ingrese un número mayor que 0 y menor que 150".
    Si la edad está dentro del rango válido (0 a 150), no hace nada y permite que el programa continúe.

     */
    

    public static boolean esMayorDeEdad(int edad){
        
        return (edad>=18);

    }
}