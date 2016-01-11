package recursos;

// Sub Clase dentro del mismo paquete
// Accede a public, protected, default

// Clase Normal del mismo paquete
// Accede public, protected, default
public class SubMemberModifiers extends MemberModifiers {

	public String getStrPublic() {
		return this.strPublic;
	}
	
	public String getStrProtected() {
		return this.strProtected + " (derivado interno)";
	}
	
	public String getStrDefault() {
		return this.strDefault + " (derivado interno)";
	}
	
	
	// Sin herencia del mismo paquete
	public String getNewStrPublic() {
		MemberModifiers member = new MemberModifiers();
		return member.strPublic + " (interno)";
	}
	
	public String getNewStrDefault() {
		MemberModifiers member = new MemberModifiers();
		return member.strDefault + " (interno)";
	}
	
	public String getNewStrProtected() {
		MemberModifiers member = new MemberModifiers();
		return member.strProtected + " (interno)";		
	}
	
}
