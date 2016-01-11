package recursos;

// Enum puede ser usado como clase
public enum AnimalesEnumDummy {
    GATO("miau"), PERRO("guau"), POLLO("pio"), RATON;
    
    // Puede o no tener constructor y miembros de clase
    private String sonido;
    
    // Constructor de Enum no tiene member modifier
    // NO puede ser llamado directamente
    AnimalesEnumDummy() {
        this.sonido = "ninguno";
    }
    
    AnimalesEnumDummy(String sonido) {
        this.sonido = sonido;
    }
    
    public String getSonido() {
        return this.sonido;
    }
}
