/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.com.salle.custommoodle.model;

import java.util.Objects;

/**
 *
 * @author diego
 * implements Comparable
 */
public class Student {
private String name;
private String lastName;
private String id;


    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    
    public Student(){      
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return String.format("id=%s,\nname=%s,\nlastName=%s", id, name, lastName); //To change body of generated methods, choose Tools | Templates.
    }
//
//    @Override
//    public int compareTo(Object t) {
//   return ((Student)t).id.compareTo(id);    // COMPARE TO PARA ORDENAR CUANDO UNO ES MAYOR QUE EL OTRO ETC
//    }
    
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
