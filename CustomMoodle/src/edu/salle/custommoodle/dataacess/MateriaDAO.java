/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess;

import edu.salle.custommoodle.model.Materia;
import java.util.List;

/**
 * Universidad De La Salle Bajío
 * Ingenieria en Sistemas y Software Computacionales
 * Juan de Dios Guadalupe Cruz Delgado.
 * 67024
 * MateriaDAO
 * @author JuandeDios
 */
public interface MateriaDAO {
    public Materia save(Materia student);
    public List<Materia> findAll();
    public Materia find(String id);
    public List<Materia> findByName(String name);
    public String findName(String id);
    public String findId(String name);
    public boolean delete(Materia student);
    public boolean update(Materia student);
    public void load();
    public void commitChanges();
    public String findNameDocente(String id);
}
