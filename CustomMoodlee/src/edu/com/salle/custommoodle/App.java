/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.com.salle.custommoodle;

import edu.com.salle.custommoodle.businesslogic.StudentBLO;
import edu.com.salle.custommoodle.model.Student;
import edu.com.salle.custommoodle.view.StudentWindow;
/**
 *
 * @author diego
 */
public class App {  
       public static void main(String[] args){
//           Student s1 = new Student("Alex", "Cornejo");
//           Student s2 = new Student("Francisco","Perez");
//           Student s3 = new Student("Alejandra", "nejo");
//           Student s4 = new Student("Morena","Pedroza");
//
//           StudentBLO studentBLO = new StudentBLO();
//           studentBLO.save(s1);
//           studentBLO.save(s2);
//           studentBLO.save(s3);
//           studentBLO.save(s4);
//           
//           Student studentBLO = new StudentBLO.findAll();
//           for (Student student : studentList){
//           System.out.println(s1);
//       }
      StudentWindow window = new StudentWindow();
      window.setVisible(true);
    }
}
    
