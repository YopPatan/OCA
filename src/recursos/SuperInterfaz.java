package recursos;


// INTERFAZ
// <MemberModifier> interface <Nombre>
// Puede ser public o default
// Puede extender solo otras interfaces
// No puede tener bloques estaticos
public interface SuperInterfaz {

	// ATRIBUTOS INTERFAZ
	// Son por defecto public final y static
	int intVar1 = 1;
	public final static int intVar2 = 2;
	
	// METODOS INTERFAZ
	// Son por defecto public y abstract
	// No puede ser privados ni protected
	void metodoInterfaz1();
	public abstract void metodoInterfaz2() throws Exception;
	public abstract void metodoInterfaz3() throws Exception;
	
}
