/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess;

import edu.salle.custommoodle.model.Student;
import java.util.List;

/**
 * Universidad De La Salle Bajío
 * Ingenieria en Sistemas y Software Computacionales
 * Juan de Dios Guadalupe Cruz Delgado.
 * 67024
 * StudentDAO
 * @author JuandeDios
 */
public interface StudentDAO {
    public Student save(Student student);
    public List<Student> findAll();
    public Student find(String id);
    public List<Student> findByLastName(String name);
    public boolean delete(Student student);
    public boolean update(Student student);
    
    public void load();
    public void commitChanges();
}
