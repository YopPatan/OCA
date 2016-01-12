package recursos;

import java.io.IOException;

// CLASE ABSTRACTA
// Puede implementar interfaz
// No necesita implementar toda la interfaz
// No puede ser final y abstracta a la vez
// Puede ser clase abstracta sin metodos abstractos
// Si una clase tiene un metodo abstracto esta deber ser abstracta
// No puede ser instanciada
public abstract class AbstractClase implements SuperInterfaz  {
    
	// Clase abstracta puede tener bloques estaticos
	static {
	}
	
	// Clase abstracta puede tener atributos
	public String strVar1 = "10";
	
	// Clase abstracta puede tener constructor
	// Cumple las mismas reglas que en herencia normal
	// El constructor es llamado cuando se ejecuta sub
	public AbstractClase() {
	}
	
	// METODO ABSTRACTO
	// No puede ser private ni final
	// No puede estar implementado, tener {}
	// Debe ser implementado en subclase o convertir subclase en abstracta
    public abstract void metodoAbstracto1();
    
    // Puede tener metodos no abstractos
    public void metodoNormal1() {
    }
    
    // IMPLEMENTAR INTERFAZ
    // Puede sobre declarar un metodo de la interfaz
    // No puede agregar excepcion si interfaz no lo tiene
    public abstract void metodoInterfaz1();
    
    // Puede tener una excepcion igual a mas espefica
    // Puede implementar metodos de interfaz
    public void metodoInterfaz2() throws IOException {
    }

    
}
