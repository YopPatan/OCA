package tests;

import recursos.MemberModifiers;
import recursos.SubMemberModifiers;

public class TestObject {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Clase Object");
		MemberModifiers member = new MemberModifiers();
		SubMemberModifiers submember = new SubMemberModifiers();
		
		// instanceof es true si pertenece a la clase o al padre de la clase
		System.out.println("member instancia de MemberModifiers: " + (member instanceof MemberModifiers));
		System.out.println("member instancia de SubMemberModifiers: " + (member instanceof SubMemberModifiers));
		System.out.println("submember instancia de MemberModifiers: " + (submember instanceof MemberModifiers));
		System.out.println("submember instancia de SubMemberModifiers: " + (submember instanceof SubMemberModifiers));
		
		// Obtiene la clase del objeto
		System.out.println("getClass(): " + member.getClass().getName());
		
		// Retorna key para insertar elemento en hash
		System.out.println("hashCode(): " + member.hashCode());
		
		// Retorna un string en representacion del objeto
		// El valor por defecto es el Member Modifier de la clase
		System.out.println("toString(): " + member.toString());
		
		
		// MANEJO DE HILOS
		// Si no existen hilos devuelve IllegalMonitorStateException
		
		// Notifica a un hilo especifico que despierte
		// member.notify();
		
		// Notifica a todos los hilos que despierten
		// member.notifyAll();
		
		// Notifica a un hilo especifico para que duerma
		// member.wait();
		
		
		// NO SE PUDIERON USAR
		// clone()
		// finalize()
		
	}
	
}
