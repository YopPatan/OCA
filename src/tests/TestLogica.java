package tests;

import recursos.AnimalesEnum;

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
		final char charVar = 'a'; // SIEMPRE TIENE QUE ESTAR EN COMILLAS SIMPLES
		final String strVar = "20a";
		
		// IF
		// if sin {} considera solo la siguiente linea, a menos que sea otro if, en tal caso considera todos los if y else anidados
		// La condicion SIEMPRE debe ser boolean
		// 0 y 1 NO SON boolean, producen ERROR DE COMPILACION
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
		
		// Solo se pueden negar boolean, no se puede negar integer o comparaciones
		// if (!intVar > 10) {}
		

		// IF TERNATY
		System.out.println("\nIF TERNARY");
		String resultado1 = (condicionOk()) ? "entro" : "NO entro";
		System.out.println("resultado 1: " + resultado1);
		String resultado2 = (condicionError()) ? "entro" : "NO entro";
		System.out.println("resultado 2: " + resultado2);
		String resultado3 = (condicionOk() | condicionError()) ? "entro" : "NO entro";
		System.out.println("resultado 3: " + resultado3);
		String resultado4 = (condicionOk() & condicionError()) ? "entro" : "NO entro";
		System.out.println("resultado 4: " + resultado4);
		
		AnimalesEnum enumPerro = AnimalesEnum.PERRO;
		String resultado5 = (enumPerro == AnimalesEnum.PERRO) ? "entro" : "NO entro";
		System.out.println("resultado 5: " + resultado5);
		AnimalesEnum enumVacio = (enumPerro == AnimalesEnum.PERRO) ? AnimalesEnum.GATO : AnimalesEnum.PERRO;
		System.out.println("resultado 6: " + enumVacio.getSonido());
		
		
		
		
		// SWITCH
		// switch puede tener variables o literales
		// switch puede solo contener int, byte, char, string y enum (NO LONG, NI FLOAT, NI DOUBLE)
		// switch permite primitivos y wrapper classes
		// switch no puede tener case con valores duplicados aunque sean dintintas variables
		// case puede usar SOLO literales o variable con atributo final (constantes), esto aplica tambien a String aunque son inmutable
		// case no ocupan {}
		// cuando entra a un case que no tiene break, ejecuta cada uno de los siguientes case o default hasta encontrar un break o terminar el switch
		// default puede estar en cualquier posicion dentro del switch o NO apararecer
		// solo puede existir un default dentro de un switch
		// SI existe case para el valor asociado este se ejecutara primero independiente de donde este ubicado el default
		// valores de case pueden o no ocupar ()
		// valores de case necesitan ocupar () si se realiza un cast
		System.out.println("\nSWITCH 1");
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
		
		System.out.println("\nSWITCH 2");
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
		
		
		// if && => (ambos verdareros) si el primero el falso no ejecuta el segundo
		// if || => (al menos uno verdadero) si el primero es verdadero no ejecuta el segundo
		// if & => (ambos verdareros) ejecuta el primero y el segundo
		// if | => (al menos uno verdadero) ejecuta el primero y el segundo
		// if ^ => (SOLO uno verdadero) ejecuta el primero y el segundo
		System.out.println("\nLOGICA");
		System.out.println("Operadores && y ||");
		
		System.out.print("if || ");
		if (condicionOk() || condicionError()) {}
		System.out.println();
		
		System.out.print("if && ");
		if (condicionError() && condicionOk()) {}
		System.out.println();

		System.out.print("if | ");
		if (condicionOk() | condicionError()) {}
		System.out.println();
		
		System.out.print("if & ");
		if (condicionError() & condicionOk()) {}
		System.out.println();
		
		System.out.print("if true ^ true ");
		if (condicionOk() ^ condicionOk())
		    System.out.println("entro");
		else
		    System.out.println("NO entro");

		System.out.print("if false ^ true ");
		if (condicionError() ^ condicionOk())
		    System.out.println("entro");
		else
		    System.out.println("NO entro");

		
		// VAR++ => ocupa variable y despues suma
		// ++VAR => suma y despues ocupa variable
		// Ocurre al imprimir y al asignar variable
		System.out.println("\nOperadores VAR++ y ++VAR");
		
		int intVar10 = 0;
		System.out.print(intVar10);
		System.out.println(" (VAR++) " + intVar10++);
		System.out.print(intVar10);
		System.out.println(" (++VAR) " + ++intVar10);
		
		System.out.print(intVar10);
		int intVar11 = intVar10++;  // 2
		System.out.println(" i=(VAR++) " + intVar11);
		
		System.out.print(intVar10);
		int intVar12 = ++intVar10;  // 4
		System.out.println(" i=(++VAR) " + intVar12);
		
		
		// primitivos no tienen referencia
		// wrapper class no tienen referencia
		System.out.println("\nOTROS");
		Boolean boolVar1 = new Boolean(true);
		Boolean boolVar2 = boolVar1;
		boolVar1 = false;
		System.out.println(boolVar2);
		
		// a = b; if (a)
		// Si no es boolean produce ERROR COMPILACION
		boolVar1 = false;
		boolVar2 = true;
		if (boolVar1=boolVar2) {
		    System.out.println(boolVar2);
		}
		
		// ORDER DE EJECUCION
		// Ejecuta primero /, *, %
		// Despues ejecuta +, - segun el orden de izquierda a derecha
		// Si - viene despues de un string arroja ERROR COMPILACION
		// % devuelve lo que falta para llegar al entero 10 % 3 = 1
		System.out.println("\nORDEN EN CONCATENACION");
		System.out.println("foo" + 10/5);
		System.out.println("foo" + 10 + 2);
		System.out.println(10 + 2 + "foo");
		System.out.println("foo" + 10 % 3);
		
		int intVarOper1 = 2 + 7*3;
		int intVarOper2 = 2 + 7%3;
		int intVarOper3 = 2 + (-3) * (-7);
		System.out.println("2 + 7*3: " + intVarOper1);  // 23
		System.out.println("2 + 7%3: " + intVarOper2);  // 3
		System.out.println("2 + (-3) * (-7): " + intVarOper3);  // 23

	}
	
	public static boolean condicionOk() {
	    System.out.print("ejecuta condicion Ok, ");
	    return true;
	}
	
	public static boolean condicionError() {
	    System.out.print("ejecuta condicion Error, ");
	    return false;
	}

	
}
