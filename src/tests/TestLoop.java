package tests;

import java.util.ArrayList;

public class TestLoop {

    public static void main(String[] args) {
        System.out.println("LOOP");
        
        ArrayList<String> strArray = new ArrayList<String>();
        
        strArray.add("10a");
        strArray.add("20a");
        strArray.add("30a");
        strArray.add("40a");
        strArray.add("50a");
        
        
        // FOR
        // Condicion de for puede usar && o ||
        System.out.println("\nFOR");
        for (int i=0; i<strArray.size(); i++) {
            System.out.print(i + " => " + strArray.get(i) + ", ");
        }
        System.out.println();
        
        for (int i=0, j=1000; i<strArray.size() || j>2000; i++, j+=10) {
            System.out.print(i + "." + j + " => " + strArray.get(i) + ", ");
        }
        System.out.println();
        
        // FOREACH
        // Si el tipo del valor no corresponde al del arreglo muestra error de compilacion
        // Si se modifica valor dentro del foreach, no se altera fuera del foreach
        // No se puede insertar ni eliminar elemento dentro del foreach, salvo eliminar el elemento length - 1
        // Si no existe un elemento en la iteracion de reemplaza por null
        System.out.println("\nFOREACH");
        for (String valor: strArray) {
            System.out.print(valor + ", ");
        }
        System.out.println();
        
        // WHILE
        // Se deben usar () en condicion
        System.out.println("\nWHILE");
        int idx = 0;
        while (idx < 10) {
            System.out.print(idx + ", ");
            idx++;
            if (idx == 6) {
                break;
            }
        }
        System.out.println();
        
        // DO-WHILE
        System.out.println("\nDO-WHILE");
        idx = 0;
        do {
            System.out.print(strArray.get(idx) + ", ");
            idx++;
        } while (idx < strArray.size());
        System.out.println();
        
        
        // LABEL
        // La etiqueta debe estar pegado al loop
        // Tambien puede usarse dentro de un if
        // Solo puede saltar a la etiqueta pegada al loop o la condicion
        // No vuelve a ejecutar el loop o el if
        idx = 0;
        saltarEtiqueta:
        for (;;) {
            System.out.print(idx + ", ");
            if (idx == 10) {
                break saltarEtiqueta;
            }
            idx++;
        }
        System.out.println();
        
        saltarEtiqueta2:
        if (idx > 5) {
            System.out.println("salto de etiqueta");
            break saltarEtiqueta2;
        }
    }
    
}
