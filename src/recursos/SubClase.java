package recursos;

// Usa extends para heredar

import java.io.IOException;

// FINAL
// Si una clase es declarada final, no puede ser heredable
// Solo puede ser aplicada a atributos, metodos y clases
// No puede usarse en interfaces ni clases abstractas
final public class SubClase extends SuperClase {

	// Puede reescribir atributos
	// Puede incluso cambiar el tipo del atributo
	// Si no se reescribe el atributo ocupa el de super
	public String intVar2 = "hola";
	public int intSubVar1 = 10;
	
	public int intVacioVar;
	public long longVacioVar;
	public float floatVacioVar;
	public double doubleVacioVar;
	public String stringVacioVar;
	public Integer intWrapperVacioVar;
	public Float floatWrapperVacioVar;
	public static int intVacioStatic;
	
	// FINAL
	// Si una variable es final tiene que estar instanciada
	// Si una variable es declarada final no puede ser modificada
	// Si un objeto es declarado final, quiere decir que no puede cambiar la referencia
	// El objeto en si puede cambiar, por ejemplo StringBuffer puede cambiar de valor su string
	public final int intVar3 = 50;
	public final MemberModifiers memberVar1 = new MemberModifiers();
	
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
		this.intVar2 = "prueba 2";
		this.intSubVar1 = 1002;
		this.subMetodo();
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
	
	// FINAL
	// Si un  metodo es declarado final, no puede ser overridden
	public final void metodoFinal() {
		
	}

	// OVERRIDDEN
	// Asociado a polimorfismo
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
		System.out.println("ejecuta SubClase.subMetodo()");
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
