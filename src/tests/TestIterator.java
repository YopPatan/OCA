package tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {
    public static void main(String[] args) {
        System.out.println("ITERATOR");
        
        ArrayList voidArray1 = new ArrayList();
        voidArray1.add("100");
        voidArray1.add("200");
        voidArray1.add("300");
        voidArray1.add("400");
        voidArray1.add("500");
        voidArray1.add("600");
        
        
        // ITERATOR
        // Solo hacia adelante
        // hasNext(), next() y remove()
        // remove() tambien elimina el objeto del arreglo original
        Iterator<String> strIte1 = voidArray1.iterator();
        
        int idx = 0;
        while (strIte1.hasNext()) {
            System.out.print(strIte1.next() + ", ");
            if (idx == 1) {
                strIte1.remove();
            }
            idx++;
        }
        System.out.println();
        
        while (strIte1.hasNext()) {
            System.out.print(strIte1.next());
        }
        System.out.println();
        
        
        // LISTITERATOR
        // hasNext(), next(), nextIndex()
        // hasPrevious(), previous(), previousIndex()
        // remove(), set() y add()
        // nextIndex() y previousIndex() se pueden usar en cualquier momento pero solo funcionan despues de next() o previous()
        // nextIndex() y previousIndex() no mueven el puntero, buscan el indice segun el elemento actual
        // remove(), set() deben ser usados despues de next() o previous()
        // remove() mueve el puntero hacia atras
        // add() mueve el puntero delante del valor agregado
        ListIterator<String> strIte2 = voidArray1.listIterator();
        System.out.println("primer indice " + strIte2.nextIndex());
        strIte2.add("add 100");
        System.out.println("add indice " + strIte2.nextIndex());
        
        // Hacia adelante
        idx = 0;
        while (strIte2.hasNext()) {
            System.out.print(strIte2.nextIndex() + "=>" + strIte2.next() + ", ");
            strIte2.set("prueba " + idx);
            if (idx == 1) {
                // Borra el elemento por lo que mueve el puntero hacia atras
                strIte2.remove();
            }
            idx++;
        }
        System.out.println();
        
        // Hacia atras
        while (strIte2.hasPrevious()) {
            System.out.print(strIte2.previousIndex() + "=>" + strIte2.previous() + ", ");
        }
        System.out.println();
        
    }
}
