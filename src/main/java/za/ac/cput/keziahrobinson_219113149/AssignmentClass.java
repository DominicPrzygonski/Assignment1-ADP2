/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.keziahrobinson_219113149;

/**
 *
 * @author keziah
 * 219113149
 */
public class AssignmentClass {
   private String Name; 
   private int num1, num2;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "AssignmentClass{" + "Name=" + Name + ", num1=" + num1 + ", num2=" + num2 + '}';
    }
  

    
}
   

