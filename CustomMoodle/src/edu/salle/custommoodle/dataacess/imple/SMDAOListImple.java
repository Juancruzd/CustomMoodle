/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.salle.custommoodle.businesslogic.MateriaBLO;
import edu.salle.custommoodle.dataacess.SMDAO;
import edu.salle.custommoodle.model.Materia;
import edu.salle.custommoodle.model.SM;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuandeDios
 */
public class SMDAOListImple implements SMDAO{
   
    private static List<SM> SMList=new ArrayList<>();
    @Override
    public SM save(SM mat) {
        String id=Integer.toString(SMList.size()+1);
        mat.setId(id);
        SMList.add(mat);
        return mat;
    }

    @Override
    public List<SM> findAll() {
    return SMList;
    }

    @Override
    public SM find(String id) {
        for(SM student:SMList)
        {
        if(student.getId().equals(id))
        {
            return student;
        }
        }
        return null;
    }

    @Override
    public List<SM> findByCurp(String curp) {
        List<SM> resMateriaList=new ArrayList<>();
    curp = curp.toLowerCase().trim();
    for (SM student : SMList){
        if(student.getCurp().toLowerCase().contains(curp) )
        {
            resMateriaList.add(student);
        }
    }
    return resMateriaList;
    }

    @Override
    public boolean delete(SM student) {//recibimos un student y directamente sobre la lista eliminamos
        
     boolean var=SMList.remove(student);
     return var;
    }
@Override
    public boolean Baja(SM student) {//recibimos un student y directamente sobre la lista eliminamos
        String id="";
        String curp="";
        String idm="";
    curp=student.getCurp() ;
    idm=student.getIdMateria();
    curp=curp.toLowerCase().trim();
    idm= idm.toLowerCase().trim();
    for (SM studen : SMList){
        if(studen.getIdMateria().toLowerCase().contains(idm) && studen.getCurp().toLowerCase().contains(curp) )
        {
           id=studen.getId();
        }
    }
    SM lol=new SM();
    lol.setCurp(curp);
    lol.setId(id);
    lol.setIdMateria(idm);
     boolean var=SMList.remove(lol);
     return var;
    }
    @Override
    public boolean update(SM student) {
       boolean i=false;
        int pos = SMList.indexOf(student);//obtener la posicion
      if(pos==-1)
      {
      i=false;
      }
          else
      {
          SMList.set(pos, student);//y en esa misma posicion se le va a set (hacer el cambio)
        i=true;
      }
      return i;
        }
@Override
    public boolean updateCurpMat(String curpO,String curp) {
        List<SM> resMateriaList=new ArrayList<>();
    curpO = curpO.toLowerCase().trim();
    for (SM student : SMList){
        if(student.getCurp().toLowerCase().contains(curpO) )
        {
            resMateriaList.add(student);
        }
    }
    //////////////////Cambiar Curp y Materias o Agregar Nuevas si no las tiene
       boolean i=false;
       for(int j=0;j<resMateriaList.size();j++)
       {
       int pos = SMList.indexOf(resMateriaList.get(j));//obtener la posicion
       
       if(pos==-1)
      {
         i=false;
      }
       else
       {
           SM sm=new SM();
          sm.setCurp(curp);
          sm.setId(resMateriaList.get(j).getId());
          sm.setIdMateria(resMateriaList.get(j).getIdMateria());
            SMList.set(pos,sm);//y en esa misma posicion se le va a set (hacer el cambio)}
            i=true;
       }
        
      
     
        }
        return i;
    }

    @Override
    public void load() {
  
     try {
          Gson gson=new Gson();
         BufferedReader br
                 =new BufferedReader(new FileReader("StudentMat.json"));
         SMList=gson.fromJson(br,new TypeToken<List<SM>>()
                 {}.getType());
     br.close();
     if(SMList==null)
     {
         SMList=new ArrayList<>();
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
         FileWriter writer=new FileWriter("StudentMat.json");
         writer.write(gson.toJson(SMList));
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
    for (SM student : SMList){
        if(student.getId().toLowerCase().contains(id))
        {
            resMateriaList=student.getIdMateria();
        }
    }
    return resMateriaList;}
    @Override
    public List<SM> findStudentsMat(String id) {
        List<SM> resMateriaList=new ArrayList<>();
    id = id.toLowerCase().trim();
    MateriaBLO N=new MateriaBLO();
    String i=N.findId(id);
    for (SM student : SMList){
        if(student.getIdMateria().toLowerCase().contains(i))
        {
            resMateriaList.add(student);
        }
    }
    return resMateriaList;
    }

    @Override
    public String findId(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


    
}
