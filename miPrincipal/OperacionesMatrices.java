package miPrincipal;

import java.util.Scanner;

public class OperacionesMatrices {

    public static void menu(Scanner scanner) {
        
        int opcion;

        do {
            System.out.println("Menú de Operaciones con Matrices:");
            System.out.println("1. Suma de Matrices");
            System.out.println("2. Multiplicación de Matrices");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sumaMatrices(scanner);
                    break;
                case 2:
                    multiplicacionMatrices(scanner);
                    break;
                case 3:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

       
    }

    private static void sumaMatrices(Scanner scanner) {
        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la primera matriz:");
        //coloque el codigo para ingresar los elementos de la matriz1

        System.out.println("Ingrese los elementos de la segunda matriz:");
       //coloque el codigo para ingresar los elementos de la matriz2

       //invoque al método sumarMatrices
    }

    public static //complete el método para sumarMatrices
    {
        
        return suma;//valor de retoro que deberá ser un arreglo de enteros

    }


    private static void multiplicacionMatrices(Scanner scanner) {
        System.out.print("Ingrese el número de filas de la primera matriz: ");
        int filas1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz (y filas de la segunda matriz): ");
        int columnas1Filas2 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int columnas2 = scanner.nextInt();

        int[][] matriz1 = new int[filas1][columnas1Filas2];
        int[][] matriz2 = new int[columnas1Filas2][columnas2];

        System.out.println("Ingrese los elementos de la primera matriz:");
        //coloque elcódigo para ingresar los elementos de la primera matriz

        System.out.println("Ingrese los elementos de la segunda matriz:");
        //coloque el código para ingresar los elementos de la segunda matriz

        multiplicarMatrices(matriz1,matriz2);

       
    }

    //cree un método estático que regrese la multiplicacion de las dos matrices
    //el método deberá nombrarse multiplicarMatrices y retornará una matriz de enteros
    

    }
}