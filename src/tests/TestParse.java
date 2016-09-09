package tests;

import recursos.ExceptionClase;
import recursos.SuperInterfaz;

// PARSE
// String.valueOf(primitivo) => devuelve string
// Integer.valueOf(string) => devuelve int
// Float.valueOf(string) => devuelve float
// Double.valueOf(string) => devuelve double
// Integer.parseInt(string) => devuelve int
// Float.parseFloat(string) => devuelve float
// Double.parseDouble(string) => devuelve double


public class TestParse {
    
    public static void main(String[] args) {
        System.out.println("PARSE");
        
        int intVar = 10;
        int intVarB8 = 020;
        int intVarB16 = 0x1A;
        int intBarB2 = 0b01010101;
        long longVar = 100L;
        byte byteVar = 127;  // byte desde 0 hasta 127
        char charVar = 'a'; // char debe ser con comillas simples, solo una letra
        String strVar1 = "hola";
        String strVar2 = "100";
        float floatVar = 1.01F;
        double doubleVar = 10.0001D;
        
        // CAST
        // No se puede realizar cast de desde o hacia String
        // Se puede realizar cast de int B16 a float B10
        // Se puede realizar cast de int B16 a int B10
        // CUIDADO CON PARENTESIS:
        // - ((String) ObjetoString).getIntegerValue();
        // - (Integer) ObjetoString.getIntegerValue();
        System.out.println("\nCast");
        int floatToInt = (int) floatVar; // narrowing (estrechamiento)
        int byteToInt = (int) byteVar;
        float intToFloat = (float) intVar;  // widening (ampliacion)
        float doubleToFloat = (float) doubleVar;  // narrowing
        float intB16ToFloat = (float) intVarB16;
        int intB16ToInt = (int) intVarB16;
        
        System.out.println("float to int: " + floatToInt);
        System.out.println("byte to int: " + byteToInt);
        System.out.println("int to float: " + intToFloat);
        System.out.println("double to float: " + doubleToFloat);
        System.out.println("b16 to float: " + intB16ToFloat);
        System.out.println("b16 to int: " + intB16ToInt);

        
		// Puede realizarse cast de cualquier cosa, pero no significa que no arroje Excepciones en runtime
		// SuperInterfaz inter1 = (SuperInterfaz) new ExceptionClase("hola");

        
        // AUTOCAST
        // Se usa la suma (+) o resta (-) entre variables o la asignacion-suma (+=) o asignacion-resta (-=)
        // Asi se puede realizar cast hacia String
        // La conversion se realiza de izquierda a derecha
        // Se puede convertir de B16 a B10
        System.out.println("\nAutocast");
        String intToStr = "" + intVar;
        String floatToStr = "" + floatVar;
        int byteToInt2 = 1000 - byteVar;
        int intB16ToInt2 = 1000 - intVarB16;
        
        System.out.println("int to string: " + intToStr);
        System.out.println("float to string: " + floatToStr);
        System.out.println("byte to int: " + byteToInt2);
        System.out.println("byte to int: " + intB16ToInt2);
        
        
        // PARSE valueOf()
        // Si no puede realizar la conversion a integer se lanza NumberFormatException
        // String.valueOf() solo se puede transformar de numero a string
        // <Numeric>.valueOf() solo se puede transformar de string a numeric
        System.out.println("\nParse valueOf()");
        String intToStr2 = String.valueOf(1000);
        String floatToStr2 = String.valueOf(7.07);
        int strToInt = Integer.valueOf("10");
        float strToFloat = Float.valueOf("5.05");
        double strToDouble = Double.valueOf("2.00002");
        
        System.out.println("int to string: " + intToStr2);
        System.out.println("float to string: " + floatToStr2);
        System.out.println("string to int: " + strToInt);
        System.out.println("string to float: " + strToFloat);
        System.out.println("string to double: " + strToDouble);
        
        
        // PARSE parseInt(), parseDouble()
        // Solo para parsear a string
        System.out.println("\nParse parseInt(), parseDouble()");
        int strToInt3 = Integer.parseInt("10");
        float strToFloat2 = Float.parseFloat("5.05");
        double strToDouble2 = Double.parseDouble("2.00002");
        
        System.out.println("string to int: " + strToInt3);
        System.out.println("string to float: " + strToFloat2);
        System.out.println("string to double: " + strToDouble2);
        
        
        // IGUALDAD
        // No se puede usar ===
        // String no se puede comparar con otro tipo usando ==
        // String no se puede comparar con int
        // Numeric se puede comparar con otros numeric
        System.out.println("\nIGUALDAD");
        int intVar10 = 10;
        long longVar10 = 10L;
        float floatVar10 = 10.0F;
        double doubleVar10 = 10.000D;
        String strVar10 = "10";
        
        if (intVar10 == longVar10) {
            System.out.println("int es igual a float");
        }
        
        if (strVar10.equals(intVar10)) {
            System.out.println("int es igual a string");
        }
        
        if (floatVar10 == doubleVar10) {
            System.out.println("float es igual a double");
        }
        
        if (intVar10 == floatVar10) {
            System.out.println("int es igual a float");
        }
        
    }
    
}
