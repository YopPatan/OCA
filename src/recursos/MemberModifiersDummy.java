package recursos;

public class MemberModifiersDummy {
	public String strPublic;
	private String strPrivate;
	protected String strProtected;
	
	public MemberModifiersDummy(String str) {
		this.strPublic = str;
	}
	
	public String toString() {
		return this.strPublic;
	}
}
