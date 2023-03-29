package com.mycompany.eva2_21_polimorfismo;

public class Estudiante extends Persona {
    private int noControl;

    public Estudiante() {
        super();
    }

    public Estudiante(String Nombre, String Apellido, int Edad, int noControl) {
        super(Nombre, Apellido, Edad);
        this.noControl = noControl;
    }
 
    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }
    
    
}

