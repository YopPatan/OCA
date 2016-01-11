package recursos;

public class SubClase extends SuperClase {
	
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
	// Siempre se ejecuta el constructor de la SuperClase
	// Si tiene super(algo) ejecuta ese super-constructor, sino ejecuta el super-constructor por defecto (sin argumentos)
	// Si no tiene super() ejecuta el constructor por defecto de SuperClase
	public SubClase() {
		System.out.println("(6) ejecuta constructor SubClase()");
		
	}
	
	public SubClase(String strVar) {
		// Ejecutar el constructor especifico de la SuperClase
		// Si super() aparece, siempre debe ser la primera linea sin comentar, sino se produce un ERROR COMPILACION
		super(strVar);
		System.out.println("(6) ejecuta constructor privado SubClase(String)");
	}
	
	// Si el constructor es private solo se permite una instancia de la clase
	private SubClase(int intVar, String strVar) {
		System.out.println("ejecuta constructor privado SubClase(String)");
	}
	
	// Metodo con el mismo nombre del constructor, NO es un constructor
	public void SubClase() {
		
	}
	
	// Solo se permite una parametros var-args
	// Parametro var-args debe estar siempre al final
	public Boolean testVarArgs(int cantidad, String... elementos) {
		System.out.println("ejecuta metodo SubClase::testVarArgs(int, Strings)");
		return true;
	}

}
