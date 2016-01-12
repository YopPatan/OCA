package recursos;

import java.io.IOException;

// Puede extender solo de otras interfaces
public interface SubInterfaz1 extends SuperInterfaz {
	
	// Puede sobreescribir atributos de super ya que siempre son estaticos
	int intVar1 = 20;
	int intVar3 = 20;
	
	// Puede sobre escribir metodos de super interfaz
	// Puede tener excepciones iguales o mas especificas que super interfaz
	void metodoInterfaz2() throws IOException;
	
	void metodoInterfaz3() throws IOException;
	
	void metodoSubInterfaz10();

}
