package com.mycompany.eva2_2_herencia;

public class estudiante {

private String nombre;
private String apellido;
private int edad;
private int nControl;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getnControl() {
        return nControl;
    }

    public void setnControl(int nControl) {
        this.nControl = nControl;
    }

    public estudiante(String nombre, String apellido, int edad, int nControl) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nControl = nControl;
    }

    

}
