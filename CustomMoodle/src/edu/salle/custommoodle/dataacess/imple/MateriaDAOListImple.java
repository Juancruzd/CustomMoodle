/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.salle.custommoodle.businesslogic.MateriaBLO;
import edu.salle.custommoodle.dataacess.MateriaDAO;
import edu.salle.custommoodle.model.Materia;
import edu.salle.custommoodle.model.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuandeDios
 */
public class MateriaDAOListImple implements MateriaDAO {
    private static List<Materia> MateriaList=new ArrayList<>();
    @Override
    public Materia save(Materia mat) {
        String id=Integer.toString(MateriaList.size()+1);
        mat.setId(id);
        MateriaList.add(mat);
        return mat;
    }

    @Override
    public List<Materia> findAll() {
    return MateriaList;
    }

    @Override
    public Materia find(String id) {
        for(Materia student:MateriaList)
        {
        if(student.getId().equals(id))
        {
            return student;
        }
        }
        return null;
    }

    @Override
    public List<Materia> findByName(String lastName) {
        List<Materia> resMateriaList=new ArrayList<>();
    lastName = lastName.toLowerCase().trim();
    for (Materia student : MateriaList){
        if(student.getName().toLowerCase().contains(lastName) || student.getDocente().toLowerCase().contains(lastName))
        {
            resMateriaList.add(student);
        }
    }
    return resMateriaList;
    }

    @Override
    public boolean delete(Materia student) {//recibimos un student y directamente sobre la lista eliminamos
     boolean var=MateriaList.remove(student);
     return var;
    }

    @Override
    public boolean update(Materia student) {
       boolean i=false;
        int pos = MateriaList.indexOf(student);//obtener la posicion
      if(pos==-1)
      {
      i=false;
      }
          else
      {
          MateriaList.set(pos, student);//y en esa misma posicion se le va a set (hacer el cambio)
        i=true;
      }
      return i;
        }

    @Override
    public void load() {
  
     try {
          Gson gson=new Gson();
         BufferedReader br
                 =new BufferedReader(new FileReader("CatalogoMaterias.json"));
         MateriaList=gson.fromJson(br,new TypeToken<List<Materia>>()
                 {}.getType());
     br.close();
     if(MateriaList==null)
     {
         MateriaList=new ArrayList<>();
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
         FileWriter writer=new FileWriter("CatalogoMaterias.json");
         writer.write(gson.toJson(MateriaList));
         writer.close();
     } 
     catch (Exception ex) {
        ex.printStackTrace();
     }
    }

    @Override
    public String findName(String id) {
        String resMateriaList="";
    id = id.toLowerCase().trim();
    for (Materia student : MateriaList){
        if(student.getId().toLowerCase().contains(id))
        {
            resMateriaList=student.getName();
        }
    }
    return resMateriaList;}
    @Override
    public String findNameDocente(String id) {
        String resMateriaList="";
    id = id.toLowerCase().trim();
    for (Materia student : MateriaList){
        if(student.getId().toLowerCase().contains(id))
        {
            resMateriaList=student.getDocente();
        }
    }
    return resMateriaList;
    }
    @Override
    public String findId(String name) {
        String resMateriaList="";
    name = name.toLowerCase().trim();
    for (Materia student : MateriaList){
        if(student.getName().toLowerCase().contains(name))
        {
            resMateriaList=student.getId();
        }
    }
    return resMateriaList;}
    
}
