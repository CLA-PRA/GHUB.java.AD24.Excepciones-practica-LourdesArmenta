package miTest;

import miPrincipal.Principal;
import miPrincipal.ConversionTemperaturas;
import miPrincipal.EdadInvalidaException;
import miPrincipal.ValidacionEdad;
import miPrincipal.OperacionesMatrices;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class AppTest {
    
    @Test
    void testMenuManejoExcepciones() {
        // Simular entradas incorrectas y válidas
        /*
        * Simula que en el menú principal ingresaste la letra a y después un retorno de carro(\n)
        * lo cual es un valor incorrecto,si ocurre esto deber á mostrar el mensaje: 
        * "Entrada no válida. Por favor, ingrese un número."
        * Después, simula la entrada del número 1 que es la opción de Conversión de Temeratura, ese dato es correcto
        * En el segundo ingreso se tecleea el número 100 y posteriormente la opción 2 que es convertir a farenhait
        * 
        */
        String input = "a\n1\n100\n2\nabc\n3\n3\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capturar la salida del sistema
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método principal
        Principal.main(new String[]{});

        // Verificar que las excepciones sean manejadas correctamente
        String output = outContent.toString();
        assertTrue(output.contains("Entrada no válida. Por favor, ingrese un número."));

        // Restaurar la entrada y salida del sistema
        System.setIn(System.in);
        System.setOut(System.out);
    }
    

    @Test
    void testCelsiusAFahrenheit() {
        double celsius = 0;
        double expected = 32;
        double result = ConversionTemperaturas.celsiusAFahrenheit(celsius);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void testFahrenheitACelsius() {
        double fahrenheit = 32;
        double expected = 0;
        double result = ConversionTemperaturas.fahrenheitACelsius(fahrenheit);
        assertEquals(expected, result, 0.001);
    }

    
    @Test
    void testValidacionEdad() {
        int edad = 20;
        boolean result = ValidacionEdad.esMayorDeEdad(edad);
        assertTrue(result);
    }

    @Test
    void testSumaMatrices() {
        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{5, 6}, {7, 8}};
        int[][] expected = {{6, 8}, {10, 12}};
        int[][] result = OperacionesMatrices.sumarMatrices(matriz1, matriz2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testMultiplicacionMatrices() {
        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{5, 6}, {7, 8}};
        int[][] expected = {{19, 22}, {43, 50}};
        int[][] result = OperacionesMatrices.multiplicarMatrices(matriz1, matriz2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testManejoExcepciones() {
        // Prueba para ConversionTemperaturas
        try {
            ConversionTemperaturas.celsiusAFahrenheit(Double.parseDouble("abc"));
            fail("Se esperaba una NumberFormatException");
        } catch (NumberFormatException e) {
            String expectedMessage = "Para la cadena de entrada";
            String actualMessage = e.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }

        // Prueba para ValidacionEdad
        try {
            ValidacionEdad.esMayorDeEdad(Integer.parseInt("abc"));
            fail("Se esperaba una NumberFormatException");
        } catch (NumberFormatException e) {
            String expectedMessage = "Error: Entrada no válida. Por favor, ingresa un número.";
            String actualMessage = e.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }

        // Prueba para OperacionesMatrices
        try {
            int[][] matriz1 = {{1, 2}, {3, 4}};
            int[][] matriz2 = {{5, 6}, {7, Integer.parseInt("abc")}};
            OperacionesMatrices.sumarMatrices(matriz1, matriz2);
            fail("Se esperaba una NumberFormatException");
        } catch (NumberFormatException e) {
            String expectedMessage = "Para la cadena de entrada";
            String actualMessage = e.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }
    }

    @Test
    void testValidacionEdadExcepcion() {
        // Simular entrada de edad negativa
        String input = "-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        // Verificar que se lanza la excepción EdadInvalidaException
        try {
            
            ValidacionEdad.validar(scanner);
            fail("Se esperaba una EdadInvalidaException");
        } catch (EdadInvalidaException e) {
            String expectedMessage = "Entrada no válida. Por favor, ingrese un número mayor que 0 y menor que 50";
            String actualMessage = e.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }

        // Restaurar la entrada del sistema
        System.setIn(System.in);
    }

    @Test
    void testValidacionEdadEntradaNoValida() {
        // Simular entrada no válida
        String input = "abc\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        // Verificar que se lanza la excepción EdadInvalidaException
        try {
            ValidacionEdad.validar(scanner);
            fail("Se esperaba una EdadInvalidaException");
        } catch (EdadInvalidaException e) {
            String expectedMessage = "Error: Entrada no válida. Por favor, ingresa un número.";
            String actualMessage = e.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }

        // Restaurar la entrada del sistema
        System.setIn(System.in);
    }

    
}