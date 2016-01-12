package tests;

import java.io.IOException;

import recursos.SuperClase;

public class TestException {
	public static void main(String[] args) {
		SuperClase objVar1 = new SuperClase();
		
		// TRY
		// Se usa para capturar un error
		// Si un metodo declara un error se debe usar try o lanzar con throws el error fuera del metodo padre
		try {
			//objVar1.metodoNoImplementado();
			int intVar1 = 10 / 0;
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
			
			System.out.println("causa: " + e.getCause());
			System.out.println("mensaje: " + e.getMessage());
		}
		
		// Exception captura todas las excepciones incluyendo runtime exceptions
		catch (Exception e) {
			
		}
		finally {
			
			// Pueden hacer try-catch anidados
			try {
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
				e.printStackTrace();

			}				
		}
	}
}
