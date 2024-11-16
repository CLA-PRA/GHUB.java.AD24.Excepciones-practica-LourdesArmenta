
package miPrincipal;

import java.util.Scanner;

public class ConversionTemperaturas{
    
    public static void conversion(Scanner scanner){
       

        try {
            System.out.print("Ingresa la temperatura: ");
            double temperatura = Double.parseDouble(scanner.nextLine());

            System.out.print("Elige la conversión (1: Celsius a Fahrenheit, 2: Fahrenheit a Celsius): ");
            int opcion = Integer.parseInt(scanner.nextLine());

            double resultado;

            switch (opcion) {
                case 1:
                    resultado = celsiusAFahrenheit(temperatura);
                    System.out.println(temperatura + " grados Celsius son " + resultado + " grados Fahrenheit.");
                    break;
                case 2:
                    resultado = fahrenheitACelsius(temperatura);
                    System.out.println(temperatura + " grados Fahrenheit son " + resultado + " grados Celsius.");
                    break;
                default:
                    throw new IllegalArgumentException("Opción no válida");
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor, ingrese un número.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}