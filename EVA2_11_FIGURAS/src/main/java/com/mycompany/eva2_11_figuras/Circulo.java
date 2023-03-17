package com.mycompany.eva2_11_figuras;

public class Circulo extends Figura {

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (radio * radio);
    }
    
    @Override
    public double calcularPerimetro(){
        return Math.PI * ( radio * 2);
        
    }
}
