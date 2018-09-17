/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

import java.util.Objects;

/**
 * Universidad De La Salle Bajío
 * Ingenieria en Sistemas y Software Computacionales
 * Juan de Dios Guadalupe Cruz Delgado.
 * 67024
 * Model Materia
 * @author JuandeDios
 */
public class Materia {
     private String name;
     private String id;
     private String Docente;
public Materia()
     {}
    public Materia(String name, String docente) {
        this.name = name;
        this.Docente=docente;
        
    }
     public Materia(String id,String name, String docente) {
        
        this.id=id;
        this.name = name;
        this.Docente=docente;
    }
     public Materia(String id) {
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }
    @Override
         public int hashCode(){ //forzar al programa que me los compare con un objeto especifico
        return id.hashCode();//el metodo trabaja de manera matematica osea hashea los obj y compara
    }
   //NOS QUEDAMOS CON EL METODO EQUALS
    @Override
    public boolean equals(Object obj) { //metodo para saber cuando un objeto es igual a otro
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
