/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess;

import edu.salle.custommoodle.model.SM;
import java.util.List;

/**
 * Universidad De La Salle Bajío
 * Ingenieria en Sistemas y Software Computacionales
 * Juan de Dios Guadalupe Cruz Delgado.
 * 67024
 * SMDAO
 * @author JuandeDios
 */
public interface SMDAO {
    public SM save(SM student);
    public List<SM> findAll();
    public SM find(String id);
    public List<SM> findByCurp(String name);
    public String findName(String id);
    public String findId(String name);
    public boolean delete(SM student);
    public boolean update(SM student);
    public void load();
    public void commitChanges();
    
    public List<SM> findStudentsMat(String name);
    public boolean updateCurpMat(String curpO,String curp);
    public boolean Baja(SM student);
    public boolean updateMat(List<String> Mat,String curpO);
}
