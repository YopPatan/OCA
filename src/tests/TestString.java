package tests;
public class TestString {
	public static void main(String[] args) {
		System.out.println("STRING");
		
		// STRING solo pueden usar comillas dobles ("")
		// CHAR solo pueden usar comillas simples ('')
		String strLiteral1 = "prueba 1";  // LITERAL
		String strLiteral2 = "prueba 1";  // LITERAL
		String strLleno1 = new String("prueba 1");
		String strLleno2 = new String("prueba 1");
		String strLleno3 = new String("PRUEBA 1");
		String strLleno4 = new String("ESTA ES UNA PRUEBA");
		String strVacio = new String();
		String strRef1 = strLiteral1;
		String strRef2 = strLleno1; 
		String strNulo;
		
		// STRING BUFFER
		// Sincronizado, mas pesado y funciona con hilos
		// No se puede crear un StringBuffer usando literales
		StringBuffer bufferLleno = new StringBuffer("prueba buffer 1");
		StringBuffer bufferVacio = new StringBuffer();
		StringBuffer bufferNulo;
		
		// STRING BUILDER
		// No sincronizado, mas liviano no funciona con hilos
		// No se puede crear un StringBuilder usando literales
		final StringBuilder builderLleno = new StringBuilder("prueba builder 1");
		StringBuilder builderVacio = new StringBuilder();
		StringBuilder builderNulo;
		
		String strBuffer1 = new String(bufferLleno);
		String strBuffer2 = new String(bufferVacio);
		String strBuilder1 = new String(builderLleno);
		String strBuilder2 = new String(builderVacio);
		

		// USANDO IGUALDAD
		// Compara referencias en el caso de NO SER un literal
		// Compara valores en el caso de ser literal
		// No se puede comparar objetos sin inicializar, pero si objetos vacios
		System.out.println("\nComparacion de string usando igualdad");
		
		System.out.println("literal-objeto: " + (strLiteral1 == strLleno1));  // FALSE compara referencias entre literal y objeto
		System.out.println("objeto-objeto: " + (strLleno1 == strLleno2));  // FALSE compara referencias entre objetos
		System.out.println("referencia-objeto: " + (strRef2 == strLleno1));  // TRUE compara referencias
		System.out.println("literal-literal: " + (strLiteral1 == strLiteral2));  // TRUE compara literal
		System.out.println("referencia-literal: " + (strRef1 == strLiteral2));  // TRUE compara literal, ademas apuntan al mismo objeto
		
		
		// USANDO equals
		// Literales puede usar equals
		// Texto directo puede usar equals
		// Es falso al comparar con equals un String con un StringBuffer.
		System.out.println("\nComparacion de string usando equals()");
		
		System.out.println("literal-literal: " + strLiteral1.equals(strLiteral2));  // TRUE
		System.out.println("literalTexto-literal: " + "prueba 1".equals(strLiteral2));  // TRUE
		System.out.println("literal-literalTexto: " + strLiteral1.equals("prueba 1"));  // TRUE
		System.out.println("objeto-literal: " + strLleno1.equals(strLiteral1));  // TRUE
		System.out.println("objeto-objeto: " + strLleno1.equals(strLleno2));  // TRUE
		System.out.println("objeto-LITERALTEXTO: " + strLleno1.equals("PRUEBA 1"));  // FALSE
		System.out.println(strBuffer1 + " equals " + builderLleno + ": " + strBuffer1.equals(builderLleno));
		
		
		// USANDO equalsIgnoreCase
		System.out.println("\nComparacion de string usando equalsIgnoreCase()");
		System.out.println("objeto-OBJETO: " + strLleno1.equalsIgnoreCase(strLleno3));  // TRUE
		System.out.println("OBJETO-literal: " + strLleno3.equalsIgnoreCase(strLiteral1));  // TRUE
		
		
		// USANDO compareTo
		// Solo funciona con String, NO para StringBuffer, NO para StringBuilder
		// Si compareTo arreja 0 entonces los textos son iguales
		System.out.println("\nComparacion de string usando compareTo()");
		System.out.println("literal-literal: " + strLiteral1.compareTo(strLiteral2));  // TRUE
		System.out.println("literal-literalTexto: " + strLiteral1.compareTo("prueba 1"));  // TRUE
		System.out.println("objeto-OBJETO: " + strLleno1.compareTo(strLleno3));
		System.out.println("OBJETO-objeto: " + strLleno3.compareTo(strLleno1));

		
		// USANDO length()
		// Pueden ser usado con String, StringBuffer o StringBuilder
		System.out.println("\nLargo de string usando length()");
		System.out.println("largo " + strLiteral1 + ": " + strLiteral1.length());
		System.out.println("largo " + strLleno3 + ": " + strLleno3.length());
		
		
		// USANDO charAt()
		// Pueden ser usado con String, StringBuffer o StringBuilder
		// Indice empieza de 0
		// Si el indice a buscar esta fuera de rango se produce un StringIndexOutOfBoundsException
		System.out.println("\nUsando charAt");
		System.out.println("posicion 3 " + strLiteral1 + ": " + strLiteral1.charAt(3));
		System.out.println("posicion 4 " + strLleno3 + ": " + strLleno3.charAt(3));
		//System.out.println("posicion 20 " + strLleno3 + ": " + strLleno3.charAt(20));
		
		
		// USANDO subString()
		// Pueden ser usado con String, StringBuffer o StringBuilder
		// Indice empieza en 0
		// Posicion final es excluido
		// Si el inicio y fin esta fuera de rango se produce un StringIndexOutOfBoundsException
		System.out.println("\nUsando subString");
		System.out.println("posicion 1 a 4 " + strLiteral1 + ": " + strLiteral1.substring(1, 4));
		System.out.println("posicion 1 a 4 " + strLleno3 + ": " + strLleno3.substring(1, 4));
		//System.out.println("posicion 1 a 20 " + strLleno3 + ": " + strLleno3.substring(1, 20));
		
		
		// USANDO indexOf() y lastIndexOf()
		// Pueden ser usado con String, StringBuffer o StringBuilder
		// Puede buscar un caracter o una cadena
		// Retorna -1 cuando no encuentra el elemento
		System.out.println("\nUsando indexOf() y lastIndexOf()");
		System.out.println("primera posicion U " + strLleno4 + ": " + strLleno4.indexOf("U"));
		System.out.println("ultima posicion U " + strLleno4 + ": " + strLleno4.lastIndexOf("U"));
		System.out.println("primera posicion F " + strLleno4 + ": " + strLleno4.indexOf("F"));
		System.out.println("primera posicion RU " + strLleno4 + ": " + strLleno4.lastIndexOf("RU"));
		
		
		// USANDO replace
		// Pueden ser usado con String, StringBuffer o StringBuilder
		// Retorna un nuevo String (NO StringBuffer), NO modifica el que se esta usando
		// Si el string buscado no existe no se realiza el reemplazo
		System.out.println("\nUsando replace()");
		System.out.println("remplazando U por _HOLA_ " + strLleno4 + ": " + strLleno4.replace("U", "_HOLA_"));
		System.out.println("remplazando BB por _HOLA_ " + strLleno4 + ": " + strLleno4.replace("BB", "_HOLA_"));
		String strReemplazado = strLleno2.replace("u", "U");
		System.out.println("remplazando u por U anticipado " + strReemplazado);
		
		
		// USANDO trim(), toLowerCase() y toUpperCase()
		// Pueden ser usado con String, StringBuffer o StringBuilder
		// Los tres retornan un nuevo String (NO StringBuffer), NO modifican el que se esta usando
		String strTrim = "  HOLA  ";
		System.out.println("\nUsando trim(), toLowerCase() y toUpperCase()");
		System.out.println("trim (" + strTrim + "): (" + strTrim.trim() + ")");
		System.out.println("lower " + strLleno4 + ": " + strLleno4.toLowerCase());
		System.out.println("upper " + strLiteral1 + ": " + strLiteral1.toUpperCase());
		System.out.println("buffer upper " + strBuffer1 + ": " + strBuffer1.toUpperCase());
		
		
		// USANDO append()
		// Devuelve un referencia a StringBuffer y ademas modifica el que se esta usando
		// Agrega texto al final
		System.out.println("\nUsando append");
		System.out.println("texto: " + bufferLleno);
		StringBuffer bufferLleno2 = bufferLleno.append("(primer append)");
		System.out.println("append: " + bufferLleno);
		System.out.println("append: " + bufferLleno.append("(segundo append)"));
		System.out.println("append ref: " + bufferLleno2);
		
		
		// USANDO insert()
		// Devuelve un referencia a StringBuffer y ademas modifica el que se esta usando
		// Si el indice a buscar esta fuera de rango se produce un StringIndexOutOfBoundsException
		System.out.println("\nUsando insert");
		StringBuffer bufferLleno3 = bufferLleno.insert(1, "_H_");
		System.out.println("insert: " + bufferLleno);
		System.out.println("insert: " + bufferLleno.insert(8, "_J_"));
		System.out.println("insert ref: " + bufferLleno3);
		
		
		// USANDO delete()
		// Tiene inicio y termino (excluido)
		// Devuelve un referencia a StringBuffer y ademas modifica el que se esta usando
		// Si el indice a buscar esta fuera de rango se produce un StringIndexOutOfBoundsException
		System.out.println("\nUsando delete()");
		System.out.println("texto: " + builderLleno);
		StringBuilder builderLleno2 = builderLleno.delete(2, 4);
		System.out.println("delete: " + builderLleno);
		System.out.println("delete ref: " + builderLleno2.delete(6, 8));
		
		
		// USANDO reverse()
		// Tome el primer char en la ultima posicion
		// Devuelve un referencia a StringBuffer y ademas modifica el que se esta usando
		System.out.println("\nUsando reverse()");
		System.out.println("texto: " + builderLleno);
		System.out.println("reverse: " + builderLleno.reverse());
		
		
		// USANDO toString()
		System.out.println("\nUsando toString()");
		String strBuilder3 = builderLleno.toString();
		System.out.println("texto: " + strBuilder3);
	}

}
