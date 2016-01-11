package externo;

import recursos.MemberModifiers;

// Sub Clase dentro del mismo paquete
// Accede a public, protected

// Clase Normal del mismo paquete
// Accede public
public class ExtSubMemberModifiers extends MemberModifiers {
	
	public String getStrPublic() {
		return this.strPublic;
	}
	
	public String getStrProtected() {
		return this.strProtected + " (derivado externo)";
	}
	
	
	// Sin herencia del mismo paquete
	public String getNewStrPublic() {
		MemberModifiers member = new MemberModifiers();
		return member.strPublic + " (interno)";
	}
	
}
