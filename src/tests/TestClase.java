// package debe ser la primera linea no comentada del archivo
package tests;

// import no importa subpaquetes
import recursos.SubClase;
import recursos.SubMemberModifiers;
import externo.ExtSubMemberModifiers;
import recursos.AbstractClase;
import recursos.MemberModifiers;
import recursos.SuperClase;

// Clase solo puede ser public o default
// <MemberModifier> abstract class <ClassName>
// <MemberModifier> y abstract puede estar en cualquier orden
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
		// La inicializacion de variables es la misma que en instanciacion
		// normal
		// Ejecuta metodos de super que sean public o default cuando estan en el
		// mismo paquete
		// Ejecuta metodos overridden en sub (que cumplan tambien con la
		// condicion anterior en super)
		// NO puede ejecutar metodos propios de sub
		System.out.println("\nupcasting");
		SuperClase superVar1 = new SubClase();
		superVar1.superMetodo2();
		superVar1.superMetodo4();

		// DOWNCASTING
		// En algunos casos lanza ClassCastException
		// Se puede realizar downcasting dependiendo de los miembros de clases
		System.out.println("\ndowncasting");
		// SubClase subVar3 = (SubClase) new SuperClase();
		System.out.println("ClassCastException");
		
		
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

}


// clases anidadas no pueden tener member modifier
class TestNestedClase {
	
}
