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
   
    public String print(int grade){
     
       if(grade > 98)
           return "You passed";
      else if(grade > 50)
            return "You nearly failed";
      else if(grade < 49)
          return "You failed";
    else
          return "You need to study";
        
    }

  
    
}
