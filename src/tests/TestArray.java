package tests;
import java.util.Arrays;
import java.util.List;

import recursos.MemberModifiers;

// Los metodos de arrays son estaticos
// Arrays.metodo()
public class TestArray {
	public static void main(String[] argv) {
		System.out.println("ARRAY");
		
		// Los arrays deben ser tratados como objetos
		// Array siempre deben ser declarados y creados antes de usar;
		String[] strArrayVacio = new String[5];
		String strArrayLleno[] = new String[5];
		String strArrayLleno2[] = {"1", "2", "3", "4", "5"};
		String strArrayRef[] = strArrayLleno;
		String strArrayNulo[];
		
		// Asignacion de arrays
		strArrayLleno[0] = "1";
		strArrayLleno[1] = "2";
		strArrayLleno[2] = "3";
		strArrayLleno[3] = "4";
		strArrayLleno[4] = "5";

		
		int[] intArrayVacio = new int[5];
		int intArrayLleno[] = {1, 2, 3, 4, 5};
		int intArrayNulo[] = new int[2];
		
		// Creacion de arrays con objetos
		MemberModifiers[] memberArrayVacio = new MemberModifiers[3];
		MemberModifiers memberArrayLleno[] = new MemberModifiers[3];
		MemberModifiers memberArrayNulo[];
		
		memberArrayLleno[0] = new MemberModifiers("member 1");
		memberArrayLleno[1] = new MemberModifiers("member 2");
		memberArrayLleno[2] = new MemberModifiers("member 3");

		

		// COMPARACION ENTRE ARRAYS
		// No se puede comparar si el arreglo no esta inicializado (creado) ERROR DE COMPILACION!!!
		
		// Compara referencias entre arrays 
		System.out.println("\nComparacion de referencias");
		System.out.println(strArrayLleno == strArrayLleno2);  // FALSE
		System.out.println(strArrayLleno == strArrayRef);  // TRUE
		System.out.println(strArrayLleno.equals(strArrayLleno2));  // FALSE
		
		// Compara valores entre arrays
		System.out.println("\nComparacion de valores");
		System.out.println(Arrays.equals(strArrayLleno, strArrayLleno2));  // TRUE
		System.out.println(Arrays.equals(strArrayLleno, strArrayRef));  // TRUE
		System.out.println(Arrays.deepEquals(strArrayLleno, strArrayLleno2));	// TRUE
		
		
		
		// COPIA DE ARRAY USANDO System.arraycopy()
		// Utiliza un arreglo ya instanciado (creado), no solo declarado (nulo)
		// No se puede copiar mas del largo del arreglo original EXCEPTION!!!
		System.out.println("\nCopia de arreglo usando System.arraycopy()");
		
		// INTEGER: Copia valores primitivos de un array a otro
		System.arraycopy(intArrayLleno, 0, intArrayVacio, 1, 3);
		for (int valor: intArrayVacio) {
			System.out.print(valor + ", ");  // 0, 1, 2, 3, 0
		}
		System.out.print("TOTAL: " + intArrayVacio.length + ", ");  // 5
		
		System.out.print("IGUAL ANTES: " + (intArrayVacio[1] == intArrayLleno[0]) + ", ");  // TRUE porque compara valor en primitivos
		intArrayVacio[1] = 100;
		System.out.println("IGUAL DESPUES: " + (intArrayVacio[1] == intArrayLleno[0]));  // FALSE porque en primitivo no copia referencia
		
		// STRING: Copia referencia de string de un array a otro
		System.arraycopy(strArrayLleno, 0, strArrayVacio, 1, 3);
		for (String valor: strArrayVacio) {
			System.out.print(valor + ", ");  // null, 1, 2, 3, null
		}
		System.out.print("TOTAL: " + strArrayVacio.length + ", ");  // 5
		
		System.out.print("IGUAL ANTES: " + (strArrayVacio[1] == strArrayLleno[0]) + ", ");  // TRUE porque compara referencia
		strArrayVacio[1] = "100";
		System.out.println("IGUAL DESPUES: " + (strArrayVacio[1] == strArrayLleno[0]));  // FALSE porque string es inmutable
		
		// OBJETO: Copia referencia de objetivos de un array a otro
		System.arraycopy(memberArrayLleno, 0, memberArrayVacio, 1, 2);
		for (MemberModifiers member: memberArrayVacio) {
			System.out.print(member + ", ");  // null, member 1, member 2,
		}
		System.out.print("TOTAL: " + memberArrayVacio.length + ", ");  // 3

		System.out.print("IGUAL ANTES: " + (memberArrayVacio[1] == memberArrayLleno[0]) + ", ");  // TRUE porque compara referencia
		memberArrayVacio[1].strPublic = "member Modificado";
		System.out.println("IGUAL DESPUES: " + (memberArrayVacio[1] == memberArrayLleno[0]));  // TRUE porque sigue comparando la misma referencia
		
		
		
		// COPIA DE ARRAY USANDO Arrays.copyOf(), Arrays.copyOfRange()
		// Utiliza un arreglo solo declarado (nulo) o puede pisar tambien un arreglo inicializado (creado)
		// Crea un nuevo array del largo de los elementos copiados
		// Arrays.copyOf() copia desde 0 hasta un largo para crear nuevo array
		// Arrays.copyOfRange() copia desde la position inicial y final (excluida) para crear un nuevo array
		System.out.println("\nCopia de arreglos usando Arrays.copyOf() y Arrays.copyOfRange()");
		
		// STRING
		strArrayNulo = Arrays.copyOfRange(strArrayLleno, 2, 4);
		for (String valor: strArrayNulo) {
			System.out.print(valor + ", ");  // 3, 4 
		}
		System.out.print("TOTAL: " + strArrayNulo.length + ", ");  // 2

		System.out.print("IGUAL ANTES: " + (strArrayNulo[0] == strArrayLleno[0]) + ", ");  // TRUE porque compara referencia
		strArrayNulo[0] = "100";
		System.out.println("IGUAL DESPUES: " + (strArrayNulo[0] == strArrayLleno[0]));  // FALSE porque string es inmutable
		
		// MEMBER
		memberArrayNulo = Arrays.copyOf(memberArrayLleno, 2);
		for (MemberModifiers valor: memberArrayNulo) {
			System.out.print(valor + ", ");
		}
		System.out.print("TOTAL: " + memberArrayNulo.length + ", ");  // 1
		
		System.out.print("IGUAL ANTES: " + (memberArrayNulo[0] == memberArrayLleno[0]) + ", ");  // TRUE porque compara referencia
		memberArrayNulo[0].strPublic = "member Re-Modificado";
		System.out.println("IGUAL DESPUES: " + (memberArrayNulo[0] == memberArrayLleno[0]));  // TRUE porque sigue comparando la misma referencia
		
		
		
		// CREACION MULTI ARRAY
		// Simbolo de array en ambos lados del nombre de la variable es multi-array
		String[] strMultiVacio[] = new String[3][];
		String[][] strMultiLLeno = {{"1","2"}, {"3","4"}, {"5","6"}};
		String strMultiLLeno2[][] = {{"1","2"}, {"3","4"}, {"5","6"}};
		String strMultiRef[][] = strMultiLLeno;
		String strMultiNulo[][];

		
		// COMPARA MULTI ARRAY
		System.out.println("\nComparacion de multiarray referencias");
		System.out.println(strMultiLLeno == strMultiLLeno2);  // FALSE
		System.out.println(strMultiLLeno == strMultiRef);  // TRUE
		System.out.println(strMultiLLeno.equals(strMultiLLeno2));  // FALSE
		
		System.out.println("\nComparacion de multiarray valores");
		System.out.println(Arrays.equals(strMultiLLeno, strMultiLLeno2));  // FALSE
		System.out.println(Arrays.deepEquals(strMultiLLeno, strMultiLLeno2));	// TRUE

		
		// RELLENAR
		// Rellena arreglos instanciados vacios o llenos
		System.out.println("\nRellena array");
		Arrays.fill(strArrayVacio, "fill");
		
		for (String valor: strArrayVacio) {
			System.out.print(valor + ", ");
		}
		System.out.println();
		
		
		// TOSTRING
		// Sirve solo para arreglos de 1 dimension
		System.out.println("\nTostring array");
		String printString = Arrays.toString(strArrayLleno);
		System.out.println(printString);
		String printMember = Arrays.toString(memberArrayLleno);
		System.out.println(printMember);
		String printMulti = Arrays.toString(strMultiLLeno);  // solo obtiene referencias
		System.out.println(printMulti);
		
		
		// TOSTRING DEEP 
		// Sirve tanto para arreglos de una o mas dimensiones
		System.out.println("\ndeepTostring array");
		String deepString = Arrays.deepToString(strArrayLleno);
		System.out.println(deepString);
		String deepMulti = Arrays.deepToString(strMultiLLeno);
		System.out.println(deepMulti);
		
		
		// ASLIST ARRAYS
		// Devuelve List NO ArrayList
		System.out.println("\nasList array");
		List<String> strListLleno = Arrays.asList(strArrayLleno);
		for (String valor: strListLleno) {
			System.out.print(valor + ", ");
		}
		System.out.println();
		
		List<MemberModifiers> memberListLleno = Arrays.asList(memberArrayLleno);
		for (MemberModifiers valor: memberListLleno) {
			System.out.print(valor.strPublic + ", ");
		}
		System.out.println();
		
		List<String[]> multiListLleno = Arrays.asList(strMultiLLeno);
		for (String[] array: multiListLleno) {
			String printMulti2 = Arrays.toString(array);
			System.out.print(printMulti2 + ", ");
		}
		System.out.println();
		

		// DECLARACIONES COMPUESTAS
		// Si es inicializado {}  NO se puede definir dimension (tanto para array como para multiarray) 
		// Puede tener {} o tener {valores}
		// Multi array puede instanciarse solo con {} o tener {arreglos}
		// En multi array cada elemento en {} es un array o null
		System.out.println("\nDECLARACION COMPUESTAS DE ARRAY");
		String[] strComp1 = new String[] {};
		String[] strComp2 = new String[] {"10", "20", "30"};
		// String[] strComp3 = new String[] {};
		// String[] strComp4 = new String[3] {"10", "20", "30"};
		String[][] strComp10 = new String[][] {};
		String[][] strComp11 = new String[][] {null, null, {"10"}};
		
	}
}
