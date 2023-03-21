package com.mycompany.eva2_16_protected;

public class EVA2_16_PROTECTED {
    public static void main(String[] args) {
        superClase objSuper = new superClase();
        objSuper.dato = 100;
    }
}
class superClase{
    protected int dato;
}
class subClase extends superClase{
    public void imprimirDato(){
        System.out.println("El valor del dato es: " + dato);
    }
}
