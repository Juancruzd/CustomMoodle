/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Student;
import edu.salle.custommoodle.view.StudentWindow;

/**
 *
 * @author JuandeDios
 */
public class App {
    public static void main(String[] args) {
//        Student s1=new Student("Alex","Cornejo");
//         Student s2=new Student("Francisco","Pérez");
//          Student s3=new Student("Sofía","Enriquez");
//           Student s4=new Student("Karol","Jí");
//           StudentBLO studentBLO=new StudentBLO();
//           studentBLO.save(s1);
//           studentBLO.save(s2);
//           studentBLO.save(s3);
//           studentBLO.save(s4);
           
StudentWindow n =new StudentWindow();
n.setVisible(true);
           
    }
}
