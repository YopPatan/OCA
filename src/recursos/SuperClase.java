package recursos;

// Debe tener constructor para ser heredable

import java.io.IOException;

// Tambien una clase abstracta puede ser heredable 
public class SuperClase {
	
	public int intVar1 = 10;
	public int intVar2 = 100;
	
	// Siempre se ejecuta los estaticos de la superclase antes de estaticos de subclase
	static {
		System.out.println("(1) ejecuta bloque estatico SuperClase");
	}
	
	{
		System.out.println("(3) ejecuta bloque NO estatico SuperClase");
	}
	
	// CONSTRUCTORES
	public SuperClase() {
		System.out.println("(4) ejecuta constructor SuperClase()");
	}
	
	public SuperClase(String strVar) {
		System.out.println("(4) ejecuta constructor SuperClase(String)");
	}

	// METODOS
	protected void superMetodo1() throws Exception {
		System.out.println("ejecuta SuperClase.superMetodo1()");
	}

	public void superMetodo2() throws Exception {
		System.out.println("ejecuta SuperClase.superMetodo2()");
	}

	private void superMetodo3() {
		System.out.println("ejecuta SuperClase.superMetodo3()");
	}

	public void superMetodo4() {
		System.out.println("ejecuta SuperClase.superMetodo4()");
	}
	
	// Excepciones
	// Si el metodo no esta implementado es comun que se ejecute UnsupportedOperationException
	// Hay excepciones que no necesitan throws en el metodo (UnsupportedOperationException, ArithmeticException)
	// Otras excepciones necesitan throws en el metodo (IOException)
	public void metodoNoImplementado() {
		// Lanza excepcion
		throw new UnsupportedOperationException();
	}

	public void metodoErrorCalculo() {
		// Lanza excepcion
		throw new ArithmeticException();
	}
	
	public void metodoErrorIO() throws IOException {
		// Lanza excepcion
		throw new IOException("memsaje de excepcion de prueba");
	}
	

        
}
