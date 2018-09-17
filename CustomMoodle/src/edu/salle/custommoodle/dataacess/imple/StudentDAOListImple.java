/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.salle.custommoodle.dataacess.StudentDAO;
import edu.salle.custommoodle.model.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Universidad De La Salle Bajío
 * Ingenieria en Sistemas y Software Computacionales
 * Juan de Dios Guadalupe Cruz Delgado.
 * 67024
 * StudentDAOListImple
 * @author JuandeDios
 */
public class StudentDAOListImple implements StudentDAO {
 private static List<Student> studentList=new ArrayList<>();
    @Override
    public Student save(Student student) {
//        String id=Integer.toString(studentList.size()+1);
//        student.setCurp(id);
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
        if(student.getCurp().equals(id))
        {
            return student;
        }
        }
        return null;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        List<Student> resStudentList=new ArrayList<>();
    lastName = lastName.toLowerCase().trim();
    for (Student student : studentList){
        if(student.getApellidoM().toLowerCase().contains(lastName) || student.getName().toLowerCase().contains(lastName)||
                student.getApellidoP().toLowerCase().contains(lastName)||student.getCurp().toLowerCase().contains(lastName) ){
            resStudentList.add(student);
        }
    }
    return resStudentList;
    }

    @Override
    public boolean delete(Student student) {//recibimos un student y directamente sobre la lista eliminamos
     boolean var=studentList.remove(student);
     return var;
    }

    @Override
    public boolean update(Student student) {
       boolean i=false;
       Student o=new Student();
          o.setCurp(student.getCurp());
          o.setApellidoM(student.getApellidoM());
          o.setApellidoP(student.getApellidoP());
          o.setEstado(student.getEstado());
          o.setSexo(student.getSexo());
          o.setFechaNacimiento(student.getFechaNacimiento());
          o.setName(student.getName());
          
        int pos = studentList.indexOf(o);//obtener la posicion
      if(pos==-1)
      {
      i=false;
      }
          else
      {
          Student n=new Student();
          n.setCurp(student.getCurpcop());
          n.setApellidoM(student.getApellidoM());
          n.setApellidoP(student.getApellidoP());
          n.setEstado(student.getEstado());
          n.setSexo(student.getSexo());
          n.setFechaNacimiento(student.getFechaNacimiento());
          n.setName(student.getName());
          
          studentList.set(pos, n);//y en esa misma posicion se le va a set (hacer el cambio)
        i=true;
      }
      return i;
        }

    @Override
    public void load() {
  
     try {
          Gson gson=new Gson();
         BufferedReader br
                 =new BufferedReader(new FileReader("students.json"));
         studentList=gson.fromJson(br,new TypeToken<List<Student>>()
                 {}.getType());
     br.close();
     if(studentList==null)
     {
         studentList=new ArrayList<>();
     }
     } 
     catch (Exception ex) {
        ex.printStackTrace();
     }
        
    }

    @Override
    public void commitChanges() {
        try {
          Gson gson=new Gson();
         FileWriter writer=new FileWriter("students.json");
         writer.write(gson.toJson(studentList));
         writer.close();
     } 
     catch (Exception ex) {
        ex.printStackTrace();
     }
    }
    
    
}
