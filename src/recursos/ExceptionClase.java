package recursos;

// EXCEPCION
// Extiende de la clase Exception
public class ExceptionClase extends Exception {
    
    private String information;
    
    public ExceptionClase(String information) {
        super(information);
        this.information = information + " EXCEPCION CREADA";
    }
    
    public ExceptionClase(Throwable e) {
        super(e);
    }
    
    public String getMensajePersonalizado() {
        return this.information;
    }
    
}