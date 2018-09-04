/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.com.salle.custommoodle.dataacess;

import edu.com.salle.custommoodle.model.Student;
import java.util.List;

/**
 *
 * @author diego
 */
public interface StudentDAO {
    public Student save(Student student);
    
    public List<Student> findAll();
    
    public Student find(String id);
    
    public Student findByLastName(String name);
    
    public void delete(Student student);
    
    public void update(Student student);
    
}
