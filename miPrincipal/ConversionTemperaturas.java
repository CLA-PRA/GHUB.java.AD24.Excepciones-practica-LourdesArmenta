
package miPrincipal;

import java.util.Scanner;

public class ConversionTemperaturas{
    
    public static void conversion(Scanner scanner){
       

        //coloque un bloque try con 3 catch
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

        } 
        /*
        captura una excepción de tipo NumberFormatException.
         Esta excepción se lanza cuando se intenta convertir 
         una cadena que no tiene un formato numérico válido 
         a un número. Cuando ocurre esta excepción, 
         el programa imprime el mensaje 
         "Entrada no válida. Por favor, ingrese un número." 
         en la consola para informar al usuario que la entrada
          proporcionada no es un número válido.
        */
        
        } // coloque aquó otro catch
        /*
        captura una excepción de tipo IllegalArgumentException.
         Esta excepción se lanza cuando se pasa un argumento 
         ilegal o inapropiado a un método.
          Cuando ocurre esta excepción, el programa imprime 
          el mensaje de la excepción en la consola utilizando 
          System.out.println(e.getMessage()).
        */
        
        }//coloque un último catch 
        /*
        captura cualquier excepción que no haya sido capturada 
        por los bloques catch anteriores.
         Cuando ocurre una excepción, 
         el programa imprime el mensaje de la excepción 
         en la consola utilizando System.out.println(e.getMessage())
        */

        
        
        
    }

    public static double celsiusAFahrenheit(double celsius) {
       //coloque el código
    }

    //cree un método público estático que regrese un double
    //deberá recibir un valor fahrenheit y convertirlo
    // a Celsius
    
}