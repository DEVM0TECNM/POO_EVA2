package com.mycompany.eva2_21_polimorfismo;

public class Docente extends Persona {
    private String Plaza;
    
    public Docente(){
        super();
        this.Plaza = "-----";
    }
    
    public Docente(String Nombre, String Apellido, int Edad, String Plaza){
        super(Nombre, Apellido, Edad);
        this.Plaza = Plaza;
    }
    public String getPlaza() {
        return Plaza;
    }

    public void setPlaza(String Plaza) {
        this.Plaza = Plaza;
    }
    
    
}