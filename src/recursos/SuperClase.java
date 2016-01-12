package recursos;

// Debe tener constructor para ser heredable

import java.io.IOException;

// Tambien una clase abstracta puede ser heredable 
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
        
        protected void superMetodo1() throws Exception {
        }

        public void superMetodo2() throws Exception {
            System.out.println("ejecuta SuperClase.superMetodo2()");
        }

        private void superMetodo3() {
        }

        public void superMetodo4() {
            System.out.println("ejecuta SuperClase.superMetodo4()");
        }

        
}
