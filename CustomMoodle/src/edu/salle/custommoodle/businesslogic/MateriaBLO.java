/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.businesslogic;

import edu.salle.custommoodle.dataacess.MateriaDAO;
import edu.salle.custommoodle.dataacess.StudentDAO;
import edu.salle.custommoodle.dataacess.imple.MateriaDAOListImple;
import edu.salle.custommoodle.dataacess.imple.StudentDAOListImple;
import edu.salle.custommoodle.model.Materia;
import edu.salle.custommoodle.model.Student;
import java.util.List;

/**
 * Universidad De La Salle Bajío
 * Ingenieria en Sistemas y Software Computacionales
 * Juan de Dios Guadalupe Cruz Delgado.
 * 67024
 * MateriaBLO
 * @author JuandeDios
 */
public class MateriaBLO {
    private MateriaDAO MateriaDAO;
    public MateriaBLO (){
        MateriaDAO=new MateriaDAOListImple();
    }
    public Materia save(Materia student)
    {
        return MateriaDAO.save(student);
    }
    public List<Materia> findAll()
    {
        return MateriaDAO.findAll();
    }
    public Materia find(String id)
    {
        return MateriaDAO.find(id);
    }
    public List<Materia> findByName(String Name){
        return MateriaDAO.findByName(Name);
    }
    
    public boolean delete(Materia mat){
       return MateriaDAO.delete(mat);
    }
    
    public boolean update(Materia mat){
        return MateriaDAO.update(mat);
    }
    public void load()
    {
        MateriaDAO.load();
    };
    public void commitChanges()
    {
        MateriaDAO.commitChanges();
    };
    public String findName(String id)
    {
    return MateriaDAO.findName(id);
    };
    public String findId(String name){
    return MateriaDAO.findId(name);
    };
    public String findNameDocente(String id)
    {return MateriaDAO.findNameDocente(id);
    };
}
