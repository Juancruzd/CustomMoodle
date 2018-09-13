/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author JuandeDios
 */
public class SM {
    private String id;
    private String curp;
    private String idmateria;
public SM()
     {}
    public SM(String curp, String id) {
        this.curp = curp;
        this.idmateria=id;
        
    }
     public SM(String id,String curp, String idm) {
        
        this.id=id;
        this.curp = curp;
        this.idmateria=idm;
    }
     public SM(String id) {
        this.id=id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getIdMateria() {
        return idmateria;
    }

    public void setIdMateria(String materia) {
        this.idmateria = materia;
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
        final SM other = (SM) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
