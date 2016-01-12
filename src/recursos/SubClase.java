package recursos;

// Usa extends para heredar

import java.io.IOException;

public class SubClase extends SuperClase {

	// Atributos no puede ser overridden
	// Si son estaticos se pueden sobreescribir
	public int intVar2 = 10;
	
	// Bloques estaticos no pueden tener member modifier
	// Se ejecuta apenas se instancia la clase
	// Solo se ejecuta una vez (estatico)
	// Una clase puede tener varios bloques estaticos
	// Los bloques estaticos se ejecutan por orden de aparicion
	static {
		System.out.println("(2) ejecua bloque estatico SubClase");
	}
	
	static {
		System.out.println("(2) ejecua 'segundo' bloque estatico SubClase");
	}
	
	// Se ejecuta apenas se instancia la clase pero despues de bloques estaticos
	{
		System.out.println("(5) ejecuta bloque NO estatico SubClase");
	}
	
	// Constructor de la clase
	// Siempre se ejecuta el constructor de la SuperClase primero
	// Si tiene super(algo) ejecuta ese super-constructor, sino ejecuta el super-constructor por defecto (sin argumentos)
	// Si no tiene super() ejecuta el constructor por defecto de SuperClase
	public SubClase() {
		System.out.println("(6) ejecuta constructor SubClase()");
		
	}
	
	public SubClase(String strVar) {
		// Ejecutar el constructor especifico de la SuperClase
		// super() invoca al constructor de super clase
		// Si super() aparece, siempre debe ser la primera linea sin comentar, sino se produce un ERROR COMPILACION
		super(strVar);
		System.out.println("(6) ejecuta constructor privado SubClase(String)");
		
		// Super puede ser usado para llamar a cualquier atributo o metodo de la super clase
		// No puede acceder a private
		// Cuando se llama un atributo o un metodo puede estar en cualquier linea
		int intVarLocal = super.intVar1;
	}
	
	// Si el constructor es private solo se permite una instancia de la clase
	private SubClase(int intVar, String strVar) {
		System.out.println("ejecuta constructor privado SubClase(String)");
	}
	
	// Metodo con el mismo nombre del constructor, NO es un constructor
	public void SubClase() {
	}

	// OVERRIDDEN
	// Puede lanzar excepcion iguales o mas especificas que en super
	// Member Modifier tiene que ser igual o menos restringido que en super
	// Debe retornar el mismo tipo de variable que en super
	protected void superMetodo1() throws IOException {
	}

	// OVERRIDDEN
	// Puede no lanzar ninguna excepcion aunque super lanza excepcion
	public void superMetodo2() {
		System.out.println("ejecuta SubClase.superMetodo2()");
	}

	// Aunque el metodo se llama igual que en super, no es overridden ya que en super es private
	public void superMetodo3() {
	}

	
	private void subMetodo() throws NumberFormatException {
	}

	// OVERLOADING
	// Debe tener diferentes tipos o cantidad de argumentos
	// Debe tener el mismo nombre
	// Puede lanzar diferente tipo de excepcion
	// Puede tener diferente Member Modifier
	// Puede retornar diferente tipo de variable
	public boolean subMetodo(String strVal) throws IOException {
		return true;
	}
}
