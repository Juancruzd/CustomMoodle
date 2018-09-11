/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

import java.util.Objects;

/**
 *
 * @author JuandeDios
 */
public class Student {
     private String name;
     private String apellidoP; 
     private String apellidoM; 
     private String fechaNacimiento; 
     private String sexo; 
     private String estado;
     private String curp; 
     private String idMateria;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
     
     
     public Student()
     {}
    public Student(String name, String p,String M,String S,String F,String C,String Estado,String Materia) {
        this.name = name;
        this.apellidoP = p;
        this.apellidoM = M;
        this.sexo = S;
        this.curp = C ;
        this.fechaNacimiento=F;
        this.estado=Estado;
        this.idMateria=Materia;
        
    }
     public Student(String id,String name, String p,String M,String S,String F,String C,String Estado,String Materia) {
        this.idMateria=Materia;
        this.curp=id;
        this.name = name;
        this.apellidoP = p;
        this.apellidoM = M;
        this.sexo = S;
        this.curp = C ;
        this.fechaNacimiento=F;
        this.estado=Estado;
    }
     public Student(String id) {
        this.curp=id;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    

    @Override
    public String toString() {
        return String.format("id=%s,\n name=%s,\nLastName=%s\n",curp,name,apellidoP); //To change body of generated methods, choose Tools | Templates.
    }
       @Override
         public int hashCode(){ //forzar al programa que me los compare con un objeto especifico
        return curp.hashCode();//el metodo trabaja de manera matematica osea hashea los obj y compara
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.curp, other.curp)) {
            return false;
        }
        return true;
    }
}
