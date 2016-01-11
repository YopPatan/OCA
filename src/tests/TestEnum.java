package tests;

import recursos.AnimalesEnumDummy;

public class TestEnum {
    
    // Enum puede ser usado como attributo
    // Puede tener member modifier
    private enum AlimentosEnum {
        CARNE, PAN
    }
    
    // Solo puede ser llamado dentro de la clase
    private enum PersonasEnum {
        JORGE("talloni", 34), MARCELA("guzman", 27);
        
        private String apellido;
        private int edad;
        
        PersonasEnum(String apellido, int edad) {
            this.apellido = apellido;
            this.edad = edad;
        }
        
        public String getApellido() {
            return this.apellido;
        }
        
        public int getEdad() {
            return this.edad;
        }
    }
    
    // Enum puede NO puede ser creado dentro de metodos
    public static void main(String[] args) {
        System.out.println("ENUMERATOR");
        
        AlimentosEnum alimento1 = AlimentosEnum.CARNE;
        
        PersonasEnum jorge = PersonasEnum.JORGE;
        System.out.println("jorge:" + jorge.getApellido() + " " + jorge.getEdad());
        
        AnimalesEnumDummy perro = AnimalesEnumDummy.PERRO;
        System.out.println("perro: " + perro.getSonido());
    }
}