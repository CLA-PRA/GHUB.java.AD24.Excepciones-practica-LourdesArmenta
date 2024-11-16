package miPrincipal;

import java.util.Scanner;

public class OperacionesMatrices {

    public static void menu(Scanner scanner) {
        //Scanner scanner = new Scanner(System.in);
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
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        sumarMatrices(matriz1,matriz2);

        
    }

    public static int [][] sumarMatrices(int matriz1[][], int matriz2[][])
    {
        int filas = matriz1.length;
        int columnas =matriz1[0].length;

        int[][] suma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Resultado de la suma de matrices:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
        return suma;

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
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1Filas2; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < columnas1Filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        multiplicarMatrices(matriz1,matriz2);

       
    }

    public static int [][] multiplicarMatrices(int matriz1[][], int matriz2[][]){
        
        int filas1=matriz1.length;
        int columnas1Filas2 = matriz1[0].length;
        int columnas2 =matriz2.length;

        int[][] producto = new int[filas1][columnas2];
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1Filas2; k++) {
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Resultado de la multiplicación de matrices:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
        return producto;

    }
}