package tests;

public class TestLogica {

	public static void main(String[] args) {
		System.out.println("CONDITIONS");
		
		int[] intArray = {10, 20, 30, 40, 50, 60, 70};
		String[] strArray = {"10a", "20a", "30a"};
		final int intVar1 = 10;
		final int intVar2 = 20;
		final int intVar3 = 50;
		final long longVar = 70L;
		final float floatVar = 60.0F;
		final char charVar = 'a';
		final String strVar = "20a";
		
		// IF
		// if sin {} considera solo la siguiente linea, a menos que sea otro if, en tal caso considera todos los if y else anidados
		System.out.println("\nIF");
		for (int val: intArray) {
			System.out.print(val + " ");
			if (intVar1 == val || intVar2 == val) {
				System.out.println("entra a primera condicion");
			}
			else if (intVar3 == val && val != 10) {
				System.out.println("entra a segunda condicion");
			}
			else {
				if (val == 30 || val == 40)
					if (val == 30)
						System.out.println("entra a else-if-if");
					else
						System.out.println("entra a else-if-else");
				else
					System.out.println("entra a else");
			}
		}
		
		
		// SWITCH
		// switch puede tener variables o literales
		// switch puede solo contener int, byte, char, string y enum (NO LONG, NI FLOAT, NI DOUBLE)
		// switch permite primitivos y wrapper classes
		// switch no puede tener case con valores duplicados aunque sean dintintas variables
		// case puede usar literales o variable con atributo final (constantes), esto aplica tambien a String aunque son inmutable
		// case no ocupan {}
		// cuando entra a un case que no tiene break, ejecuta cada uno de los siguientes case o default hasta encontrar un break o terminar el switch
		// default puede estar en cualquier posicion dentro del switch o NO apararecer
		// solo puede existir un default dentro de un switch
		// SI existe case para el valor asociado este se ejecutara primero independiente de donde este ubicado el default
		// valores de case pueden o no ocupar ()
		// valores de case necesitan ocupar () si se realiza un cast
		System.out.println("\nSWITCH");
		for (int val: intArray) {
			System.out.println("valor: " + val);
			switch (val) {
				case 1:
					System.out.println("entro a primer case 1");
				case intVar1:
					System.out.println("entro a segundo case " + intVar1);
				case intVar3:
					System.out.println("entro a tercer case " + intVar3);
				default:
					System.out.println("entro a default");
				case 3:
					System.out.println("entro a cuarto case 3");
				case (4):
					System.out.println("entro a quinto case 4");
					break;
				case 5:
					System.out.println("entro a sexto case 5");
				case intVar2:
					System.out.println("entro a septimo case " + intVar2);
				case ((int) floatVar):
					System.out.println("entro a octavo case " + floatVar);
				case 40 + 40:
					System.out.println("entro a noveno case 80");
			}
		}
		System.out.println();
		
		for (String val: strArray) {
			System.out.println("valor: " + val);
			switch (val) {
				default:
					System.out.println("entra a default");
					break;
				case "10a":
					System.out.println("entra a literal 10a");
					break;
				case strVar:
					System.out.println("entra a variable " + strVar);
				case "30" + "a":
					System.out.println("entra a concatenacion 30a");
				case "40" + charVar:
					System.out.println("entra a char");
			}
		}
		System.out.println();
		
	}
	
}
