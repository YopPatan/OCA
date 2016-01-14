// package debe ser la primera linea no comentada del archivo
package tests;

import externo.ExtSubMemberModifiers;
// IMPORT
// import no importa subpaquetes
// Puede importarse varias veces la misma clase
// No se pueden importar directamente los paquetes
import recursos.*;

// Clase solo puede ser public o default
// <MemberModifier> abstract class <ClassName>
// <MemberModifier> y abstract puede estar en cualquier orden
// Clases no puede ser static
public class TestClase {
	
	// La declaracion de variable es segun el siguiente orden orden
	// <MemberModifier> final static <RefVarType> <RefVar> = new <ObjectType>();
	// <MemberModifier>, final y static pueden estar en cualquier orden al principio de la declaracion
	// Un atributo puede ser public, private, protected o default
	private int intVar = 10;
	private String strVar = "10";
	private final long LONGVARCONST = 100L;
	private static long longVarStatic = 100L;
	
	
	// El nombre de la variable puede tener letra, numero, (_), ($)
	// El nombre de la variable no puede comenzar con numeros
	public String nombreVar;
	public String _nombre_Var_;
	public String $nombre$Var$;
	public String nombreVar123;
	public String _$_nombre__$$__Var123___$$$___;
	
	
	// Solo puede haber un main por clase
	// Pueden existir otros metodos main pero no con los mismos parametros
	public static void main(String[] args) throws Exception {
		System.out.println("ejecuta main");
		
		System.out.println("\ncrea SubClase()");
		SubClase subVar1 = new SubClase();
		
		System.out.println("\ncrea SubClase(String)");
		SubClase subVar2 = new SubClase("1000a");
		

		System.out.println("\ninicializacion variables");
		System.out.println("(1) inicializa variables con valores default");
		System.out.println("(2) inicializa variables estaticas y finales");
		System.out.println("(3) inicializa variables de instancia (si tiene)");
		System.out.println("(4) ejecuta bloques");
		System.out.println("(5) ejecuta constructores");
		
                
		// public => clase, derivado (dentro y fuera de paquete), paquete, externo
		// private => clase
		// protected => clase, derivado (dentro y fuera paquete), paquete
		// default => clase, derivado (mismo paquete), paquete
		MemberModifiers member = new MemberModifiers();
		SubMemberModifiers submember = new SubMemberModifiers();
		ExtSubMemberModifiers extsubmember = new ExtSubMemberModifiers();
		
		System.out.println("\nmember modifier");
		System.out.println(member.strPublic + " => clase, derivado (dentro y fuera paquete), paquete, externo ");
		System.out.println(member.getStrPrivate() + " => clase ");
		System.out.println(submember.getStrProtected() + " => clase, derivado (dentro y fuera paquete), paquete");
		System.out.println(extsubmember.getStrProtected() + " => clase, derivado (dentro y fuera paquete), paquete");
		System.out.println(submember.getNewStrProtected() + " => clase, derivado (dentro y fuera paquete), paquete");
		System.out.println(submember.getStrDefault() + " => clase, derivado (mismo paquete), paquete");
		System.out.println(submember.getNewStrDefault() + " => clase, derivado (mismo paquete), paquete");

		// UPCASTING
		// La inicializacion de variables es la misma que en instanciacion normal
		// Ejecuta metodos de super que sean public o default cuando estan en el mismo paquete
		// Ejecuta metodos overridden en sub (que cumplan tambien con la condicion anterior en super)
		// NO puede ejecutar metodos propios de sub
		// Ejecuta constructor de SUPER y SUB
		// Usa atributos solo de super auque se sobreescriban en sub
		// Constructor de sub puede asignar variablesy metodos propias en upcasting
		System.out.println("\nUPCASTING");
		SuperClase superVar1 = new SubClase();
		superVar1.superMetodo2();
		superVar1.superMetodo4();
		System.out.println("uc supervar var1: " + superVar1.intVar1);
		System.out.println("uc supervar var2: " + superVar1.intVar2);
		
		SubClase subVar4 = new SubClase();
		System.out.println("subvar var2: " + subVar4.intVar2);
		
		// No puede usar atributos que solo esten en Subclase 
		// System.out.println(superVar1.intSubVar1);
		
		System.out.println("upcasting con interfaces");
		SubInterfaz1 subInterfaz1 = new SubAbstractClase();
		subInterfaz1.metodoInterfaz3();
		

		// DOWNCASTING
		// En algunos casos lanza ClassCastException
		// Se puede realizar downcasting dependiendo de los miembros de clases
		System.out.println("\nDOWNCASTING");
		// SubClase subVar3 = (SubClase) new SuperClase();
		System.out.println("ClassCastException");
		
		
		// PASO DE PARAMETROS
		// Cuando se pasa un primitivo, solo se modifica dentro del metodo
		// Cuando se pasa un string, solo se modifica dentro del metodo ya que se crea uno nuevo
		// Cuando se pasa una referencia, se modifica dentro y fuera del metodo
		System.out.println("\nPASO DE PARAMETROS");

		int intVar1 = 1;
		String strVar1 = "1";
		StringBuffer bufferVar1 = new StringBuffer("1");
		
		System.out.println("int antes de metodo: " + intVar1);
		System.out.println("string antes de metodo: " + strVar1);
		System.out.println("stringBuffer antes de metodo: " + bufferVar1);
		
		pasoDeParametros(intVar1, strVar1, bufferVar1);
		
		System.out.println("int despues de metodo: " + intVar1);
		System.out.println("string despues de metodo: " + strVar1);
		System.out.println("stringBuffer despues de metodo: " + bufferVar1);
		
		
		// VALORES POR DEFECTO DE ATRIBUTOS
		System.out.println("\nVALORES POR DEFECTO DE ATRIBUTOS");
		
		SubClase subVar3 = new SubClase();
		System.out.println("int: " + subVar3.intVacioVar);
		System.out.println("long: " + subVar3.longVacioVar);
		System.out.println("float: " + subVar3.floatVacioVar);
		System.out.println("double: " + subVar3.doubleVacioVar);
		System.out.println("string: " + subVar3.stringVacioVar);
		System.out.println("wrapper int: " + subVar3.intWrapperVacioVar);
		System.out.println("wrapper float: " + subVar3.floatWrapperVacioVar);
		System.out.println("static int: " + subVar3.intVacioStatic);

		System.out.println("\nvalores por defecto dentro de metodo");
		valoresDefaultMetodo();
		
		// Se puede llamar atributos y metodos directamente despues de new sin usar ()
		System.out.println("\nOTROS");
		System.out.println(new SubClase().intVar2);
		
	}
	
	
	// Un metodo puede ser public, private, protected o default
	public Boolean testMethod() {
		return true;
	}
	        
	// Solo se permite una parametros var-args
	// Parametro var-args debe estar siempre al final
	public Boolean testVarArgs(int cantidad, String... elementos) {
		return true;
	}
	
	
	// Metodos static pueden alterar objetos que pasan como parametro
	public static void pasoDeParametros(int intVar, String strVar, StringBuffer bufferVar) {
		intVar = 100;
		strVar = "100";
		bufferVar.append("000");
		
		System.out.println("int dentro de metodo: " + intVar);
		System.out.println("string dentro de metodo: " + strVar);
		System.out.println("stringBuffer dentro de metodo: " + bufferVar);
	}
	
	public static void valoresDefaultMetodo() {
		int intVacioVar;
		String stringVacioVar;
		
		// Las letras F y D solo se utilizan para indicar el tipo del literal
		// Al imprimir NO se muestran las letras F y D
		float floatVar = 0.0F;
		double doubleVar = 0.0D;
		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		
		
		// Si no se ha instanciado la variable se produce ERROR COMPILACION
		// Error aplica tanto a primitivos como a wrapper
		// System.out.println(intVacioVar);
		// System.out.println(stringVacioVar);
	}

}


// clases anidadas no pueden tener member modifier
class TestNestedClase {
	
}
