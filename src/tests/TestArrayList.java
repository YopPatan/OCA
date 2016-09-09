package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import recursos.MemberModifiers;


// ARRAYLIST
// Collections.sort(arraylist)
// .add(obj)
// .add(int, obj)
// .addAll(array)
// .addAll(int, array)
// .get(int)
// .indexOf(obj)
// .remove(obj)
// .removeAll(array)
// .set(int, obj)
// .clear()
// .toArray()
// .size()
// .equals()  // compara elementos


public class TestArrayList {

    public static void main(String[] args) {
        
        System.out.println("ARRAY LIST");
        

        // Inicializacion
        // No se puede inicializar con ARRAY
        // El tamaño fijo inicial se modifica al agregar mas elementos
        // No se puede ocupar primitivos
        // Ejecuta autoboxing
        ArrayList<String> strArray1 = new ArrayList<String>();  // Sin tamaño fijo inicial
        ArrayList<String> strArray2 = new ArrayList<String>(20);  // Con tamaño fijo inicial
        ArrayList voidArray1 = new ArrayList();  // Sin tipo fijo
        ArrayList voidArray2 = new ArrayList();
        ArrayList refArray1 = voidArray1;
        
        MemberModifiers member1 = new MemberModifiers("dummy 1");
        MemberModifiers member2 = new MemberModifiers("dummy 2");
        MemberModifiers member3 = new MemberModifiers("dummy 3");
        MemberModifiers member4 = new MemberModifiers("dummy 4");
        MemberModifiers memberRef = member1;
        
        
        // Usando add() y addAll()
        // add() agrega un elemento y addAll() agrega una coleccion
        // Se puede agregar con o sin indice
        // Si se agrega sin indice se coloca el elemento al final y devuelve un boolean
        // Si se intenta de agregar un elemento de un tipo diferente al definido en el arreglo produce ERROR COMPILACION
        // Si indice esta fuera de rango entonces se lanza IndexOutOfBoundsException
        strArray1.add("10");
        strArray1.add("20");
        strArray1.add(2, "30");
        strArray1.add(3, "40");
        strArray2.add("1000");
        strArray2.add("2000");
        
        strArray1.addAll(strArray2);
        strArray1.addAll(4, strArray2);
        
        voidArray1.add(member1);
        voidArray1.add(member2);
        voidArray1.add(member3);
        voidArray2.add(0, member3);
        voidArray2.add(1, member4);
        
        // Constructor usando Collection
        ArrayList strArray3 = new ArrayList(strArray1);        
        strArray1.add(1, "100");
        
        
        // USANDO get() y indexOf()
        // Indice empieza en 0
        // En get(), si indice esta fuera de rango entonces se lanza IndexOutOfBoundsException
        // En indexOf(), si objeto no existe en array devuelve -1
        // Al usar get con un arreglo sin tipo de debe realizar un cast, sino se produce un EERROR COMPILACION
        // Se obtiene una referencia al objeto
        System.out.println("\nUsando get() y indexOf()");
        System.out.println("array1 (con add):" + strArray1.toString());
        System.out.println("array3 (con constructor): " + strArray3.toString());
        System.out.println("posicion 1: " + strArray1.get(1));
        System.out.println("posicion 3: " + strArray1.get(3));
        
        MemberModifiers memberRef2 = (MemberModifiers) voidArray1.get(2);
        System.out.println("member: " + memberRef2.toString());
        memberRef2.strPublic = "member referencia 3";
        System.out.println("array: " + voidArray1.toString());
        System.out.println("indice ref: " + voidArray1.indexOf(memberRef2));
        System.out.println("indice member2: " + voidArray1.indexOf(member2));
        System.out.println("indice member4: " + voidArray1.indexOf(member4));
        
        
        // USANDO remove() y removeAll()
        // remove(indice) devuelve el objeto eliminado
        // remove(objeto) devuelve boolean segun eliminacion del objeto
        // removeAll(coleccion) devuelve boolean segun eliminacion de la coleccion, puede eliminar parte o total del array buscado
        System.out.println("\nUsando remove() y removeAll()");
        System.out.println("array:" + voidArray1.toString());
        MemberModifiers memberDel = (MemberModifiers) voidArray1.remove(1);
        System.out.println("array remove: " + voidArray1.toString());
        System.out.println("remove 0: " + voidArray1.remove(member1));
        System.out.println("remove All no existe: " + voidArray1.removeAll(strArray1));
        System.out.println("remove All existe: " + voidArray1.removeAll(voidArray2));
        System.out.println("array remove: " + voidArray1.toString());
        
        
        // USANDO set()
        // Si indice esta fuera de rango entonces se lanza IndexOutOfBoundsException
        // Si elemento no es del array se produce ERROR COMPILACION
        System.out.println("\nUsando set()");
        System.out.println("array: " + strArray1.toString());
        strArray1.set(2, "nuevo 300");
        System.out.println("array set: " + strArray1.toString());
        
        
        // USANDO clear()
        // Limpia array
        // No devuelve nada void
        // NO elimina el objeto solo la referencia dentro del array
        System.out.println("\nUsando clear()");
        System.out.println("array: " + strArray1.toString());
        strArray1.clear();
        System.out.println("array: " + strArray1.toString());        
        
        // USANDO Collections.sort(array)
        System.out.println("\nUsando sort()");
        System.out.println("array: " + strArray3.toString());
        Collections.sort(strArray3);
        System.out.println("array: " + strArray3.toString());
        
        
        // USANDO toArray()
        System.out.println("\nUsando toArray()");
        Object[] strArraySolo = strArray3.toArray(new String[2]);
        System.out.println("array solo: " + Arrays.toString(strArraySolo));
        
        
        // USANDO size()
        System.out.println("\nUsando size()");
        System.out.println("size: " + strArray3.size());
        
        
        // Equals
        // Compara elementos del array
        System.out.println("\nUsando equals()");
        ArrayList voidArray4 = new ArrayList();
        ArrayList voidArray5 = new ArrayList();
        ArrayList voidRef4 = voidArray4;
        voidArray4.add(member1);
        voidArray5.add(member1);
        System.out.println(voidArray4.equals(voidArray5));
        System.out.println(voidArray4.equals(voidArray1));
        System.out.println(voidArray4 == voidRef4);
        
        
    }
    
}
