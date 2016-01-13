package tests;

public class TestModifier {
	
	// Transiente es usado para indicar que la variable no sea serializada
	// La variable es guardada en un almacen de persistencia como null (bd, archivos, etc)
	// Puede ser usado solo en variables
	public transient String transientVar1;
	
	// Volatile es usado para indicar que la variable puede ser modificada en otro hilo
	// Puede ser usado solo en variables
	public volatile String volatileVar1;
	
	public static void main(String[] args) {
		StrictfpClase strictfpVar1 = new StrictfpClase();
		strictfpVar1.metodoCalcular();
	}
	
	// Native es usado para indicar que este metodo esta implementado en otros lenguajes
	// Puede ser usado solo en metodos
	// El metodo no debe implementarse {}
	public native int metodoNativo();
}

// Strictfp es usado forzar la presicion del punto flotante segun el standar
// Puede ser usado en clases, interfaces y metodos
// No puede ser usado en atributos o constructores
strictfp class StrictfpClase {
	
    double num1 = 10e+102;
    double num2 = 6e+08;
	
	strictfp void metodoCalcular() {
		
		System.out.println(num1 + num2);  // 1.0E103
	}
}
