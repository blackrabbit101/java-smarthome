/*
 * File: LivingRoom.java
 * Author: Alex Norman norman1@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/25/2019 AWN - initial coding
 *
 * Credits:  (if any for sections of code)
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;





/**
 *
 * @author Alex Norman norman1@uab.edu
 */
public class LivingRoom extends lights {
 public static int ComponentNumber = 1;


    /**
     *
     * @param title this is the title of the light could be just L1- debatable usefulness for this project. 
     */

    public LivingRoom(String title) {
        super(); //we call our parent function that handles all of our consturction. 
        
      
        UID = "(" +UIDcount +")";
       
          ComponentTitle = "Living Room light number "+ ComponentNumber; // we essentially save the number and title here in our component title when its genrated then increment
            ComponentNumber++; // we add to to the number of components after its generated
        
        
     
      
    }
    
    /**
     *
     * @param change this will allow any color to be changed in the living room. 
     */
    public void changeColorLivingRoom(ColorType change){
        
        Color = change;
        
    }
    
  
       
       
       
   
}