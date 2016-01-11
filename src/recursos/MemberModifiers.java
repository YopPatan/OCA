package recursos;

public class MemberModifiers {
	public String strPublic = "public";
	private String strPrivate = "private";
	protected String strProtected = "protected";
	String strDefault = "default";
	
	public MemberModifiers() {
		
	}
	
	public MemberModifiers(String str) {
		this.strPublic = str;
	}
	
	public String toString() {
		return this.strPublic;
	}
	
	public String getStrPrivate() {
		// private => solo dentro de la clase
		return this.strPrivate;
	}
}
