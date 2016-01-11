package recursos;

public class SuperClase {
	
	// Siempre se ejecuta los estaticos de la superclase antes de estaticos de subclase
	static {
		System.out.println("(1) ejecuta bloque estatico SuperClase");
	}
	
	{
		System.out.println("(3) ejecuta bloque NO estatico SuperClase");
	}
	
	public SuperClase() {
		System.out.println("(4) ejecuta constructor SuperClase()");
	}
	
	public SuperClase(String strVar) {
		System.out.println("(4) ejecuta constructor SuperClase(String)");
	}
}
