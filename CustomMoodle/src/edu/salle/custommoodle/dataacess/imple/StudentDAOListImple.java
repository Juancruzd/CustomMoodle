/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.imple;

import edu.salle.custommoodle.dataacess.StudentDAO;
import edu.salle.custommoodle.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuandeDios
 */
public class StudentDAOListImple implements StudentDAO {
 private static List<Student> studentList=new ArrayList<>();
    @Override
    public Student save(Student student) {
        String id=Integer.toString(studentList.size()+1);
        student.setId(id);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
    return studentList;
    }

    @Override
    public Student find(String id) {
        for(Student student:studentList)
        {
        if(student.getId().equals(id))
        {
            return student;
        }
        }
        return null;
    }

    @Override
    public Student findByLastName(String lastName) {
    lastName = lastName.toLowerCase().trim();
    for (Student student : studentList){
        if(student.getLastName().toLowerCase().contains(lastName)){
            return student;
        }
    }
    return null;
    }

    @Override
    public boolean delete(Student student) {//recibimos un student y directamente sobre la lista eliminamos
     boolean var=studentList.remove(student);
     return var;
    }

    @Override
    public boolean update(Student student) {
       boolean i=false;
        int pos = studentList.indexOf(student);//obtener la posicion
      if(pos==-1)
      {
      i=false;
      }
          else
      {
          studentList.set(pos, student);//y en esa misma posicion se le va a set (hacer el cambio)
        i=true;
      }
      return i;
        }
    
}
