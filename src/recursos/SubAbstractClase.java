package recursos;

import java.io.FileNotFoundException;

// Debe implementar todos los metodos abstractos de super o convertirse en abstracta
// Debe implementar todas interfaces o convertirse en abstracta
// Primero respeta la herencia y despues la implementacion
public class SubAbstractClase extends AbstractClase implements SubInterfaz1, SubInterfaz2 {

	// IMPLEMENTACION METODO ABSTRACTO
	// Debe tener Member Modifier igual o menos restrictico
	public void metodoAbstracto1() {
	}
	
	public void metodoInterfaz1() {
	}

	// SuperInterfaz lanza Excepcion
	// SubInterfaz1 lanza IOExcepcion
	// Implementacion lanza FileNotFoundException
	public void metodoInterfaz3() throws FileNotFoundException {
	}
	
	// IMPLEMENTACION INTERFACES
	public void metodoSubInterfaz10() {
	}
	
	public void metodoSubInterfaz20() {
	}
	
}
