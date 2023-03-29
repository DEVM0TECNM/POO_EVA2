package com.mycompany.eva2_21_polimorfismo;

public class EVA2_21_POLIMORFISMO {

    public static void main(String[] args) {
      Estudiante estu = new Estudiante("Diego", "Vazquez", 19, 22550345);
      Docente docente = new Docente();
      docente.setNombre("Rodolfo");
      docente.setApellido("Sandoval");
      docente.setEdad(25);
      docente.setPlaza("Calculo Integral");
    
      Persona perso = estu;
     
      Persona perso2 = docente;
      Persona perso3 = new Persona();
      
      Estudiante estu2 = perso3;
    }
}
