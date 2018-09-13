/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.businesslogic;

import edu.salle.custommoodle.dataacess.SMDAO;
import edu.salle.custommoodle.dataacess.imple.SMDAOListImple;
import edu.salle.custommoodle.model.SM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuandeDios
 */
public class SMBLO {
     
    private SMDAO SMDAO;
    public SMBLO (){
        SMDAO=new SMDAOListImple();
    }
    public SM save(SM student)
    {
        return SMDAO.save(student);
    }
    public List<SM> findAll()
    {
        return SMDAO.findAll();
    }
    public SM find(String id)
    {
        return SMDAO.find(id);
    }
    public List<SM> findByCurp(String Name){
        return SMDAO.findByCurp(Name);
    }
    
    public boolean delete(SM mat){
       return SMDAO.delete(mat);
    }
    
    public boolean update(SM mat){
        return SMDAO.update(mat);
    }
    public void load()
    {
        SMDAO.load();
    };
    public void commitChanges()
    {
        SMDAO.commitChanges();
    };
    public String findName(String id)
    {
    return SMDAO.findName(id);
    };
    public List<SM> findStudentsMat(String lastName){
    return SMDAO.findStudentsMat(lastName);
    };
   public boolean updateCurpMat(String curpO,String curp)
    {
//        return SMDAO.updateCurpMat(String curpO,List<String> mate,String curp);
        return SMDAO.updateCurpMat(curpO,curp);
    };
   public boolean Baja(SM student)
   {
       return  SMDAO.Baja(student);
   };
}
