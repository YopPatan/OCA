package tests;

import java.io.FileWriter;
import java.io.IOException;
import recursos.ExceptionClase;

import recursos.SuperClase;

public class TestException {
	public static void main(String[] args) {
		SuperClase objVar1 = new SuperClase();
		int intVar1 = 34;
		
		// TRY
		// Se usa para capturar un error
		// Si un metodo declara un error se debe usar try o lanzar con throws el error fuera del metodo padre
		// Si la asignacion de una variable produce una excepcion, entonces la variable queda con su valor anterior
		try {
			//objVar1.metodoNoImplementado();
			intVar1 = 10 / 0;
		}
		
		// Puede tener 0 o mas catch
		// Captura el error
		// Si no existe catch DEBE existir finaly
		// Puede capturar varios errores simultaneamente
		catch (NumberFormatException e) {
			
		}
		catch (IllegalArgumentException e) {
			
		}
		catch (ArithmeticException | NullPointerException e) {
			System.out.println("\nArithmeticException");
			System.out.println("numero intVar: " + intVar1);
			
            Throwable error = e.getCause();
			System.out.println("causa: " + error);
			System.out.println("mensaje: " + e.getMessage());
            System.out.println("local mensaje: " + e.getLocalizedMessage());
            System.out.println("to string: " + e.toString());
            
            StackTraceElement[] trace = e.getStackTrace();
            
            // Imprime por defecto
            // e.printStackTrace();
		}
		
		// Exception captura todas las excepciones incluyendo runtime exceptions
		catch (Exception e) {
			
		}
        
        // Siempre se ejecuta independiente si entro o no a catch
		finally {
			
            // TRY CON RECURSOS
			// Pueden hacer try-catch anidados
            // Declara el recurso dentro de parentesis de try
			try (FileWriter recurso = new FileWriter("prueba.txt")) {
				objVar1.metodoErrorIO();
			}
			// Hay excepciones que solo se pueden capturar cuando esta declarado que puede ocurrir
			// Por ejemplo si estan declaradas en el metodo con throws
			catch (IOException e) {
				System.out.println("\nIOException");
				
				System.out.println("causa: " + e.getCause());
				System.out.println("mensaje: " + e.getMessage());
				System.out.println("localized mensaje: " + e.getLocalizedMessage());
				System.out.println("to string: " + e.toString());
				System.out.println();
				
				// Obtiene cadena de errores
				// Cada error es un StackTraceElement
				StackTraceElement[] trace = e.getStackTrace();
				
				// printStackTrace() imprime directamente la cadena de errores
				// e.printStackTrace();
            }			
		}
        
        System.out.println("\nEXCEPCION PERSONALIZADA");
        try {
            throw new ExceptionClase("excepcion personalizada");
        }
        
        // Las excepciones propias solo se pueden capturar cuando esta declarado que puede ocurrir
        // Se ocupa un metodo que la lance o lanzarla directamente con throw
        catch (ExceptionClase e) {
            System.out.println("mensaje: " + e.getMessage());
            System.out.println("local mensaje: " + e.getLocalizedMessage());
            System.out.println("to string: " + e.toString());
            System.out.println("personalizado: " + e.getMensajePersonalizado());
            
            //e.printStackTrace();
        }
	}
}