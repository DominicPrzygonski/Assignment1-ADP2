/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mponeng Ratego
 * 216178991
 */
public class Calculations {
    
 int number;
 
   // Constructor
   public Calculations() {
      this.number = 0;
   }

   public Calculations(int number) {
      this.number = number;
   }
 
   // Getter and setter
   public int getNumber() {
      return number;
   }
 
   public void setNumber(int number) {
      this.number = number;
   }
 
   // Public methods
   public Calculations add(Calculations rhs) {
      this.number += rhs.number;
      return this;
   }
 
   public Calculations div(Calculations rhs) {
      if (rhs.number == 0) throw new IllegalArgumentException("Cannot divide by 0!");
      this.number /= rhs.number;
      return this;
   }   
    
}