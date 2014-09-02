package piglatinproject;

/* 
 * Chapter No. 1    Excercise No. 1
 * File Name: PigLatinProject.java
 * @author: Eric Schenck
 * Date: September 2, 2012
 * 
 * Problem Statement: Ask the user to input their first name, then their last 
 * name. convert the first and last name to pig latin by taking the first letter
 * of each name and placing that letter at the end, adding "ay" to the end of 
 * that, and capitalize the first letter of the newly created names. print out 
 * the results along with a messege.
 * 
 * 
 * Overall plan:
 * 1.) Print an initial welcoming message to the screen
 * 2.) Prompt the user to enter their first, then last name.
 * 3.) move the first letter to the end of each name
 * 4.) add "ay" to the end of the name
 * 5.) capitalize the first letter of the name
 * 6.) print out the new pig latin version of the user name
 * 
 * 
 */

import java.util.Scanner;


public class PigLatinProject {

   
    public static void main(String[] args) {
        
    System.out.println("Hello there, can you please enter your first name:");
        
        // Declaring string variables
        String wrd1, wrd2, wrd3, wrd4, wrd5, wrd6;
        String pgt1, pgt2, pgt3, pgt4;
        String fnl1,fnl2, fnl3, fnl4;
        
        
        
        
        Scanner keyboard = new Scanner(System.in);
     
        
        // user inputs their first name
        wrd1 = keyboard.next();
        
    System.out.println("Now enter your last name:");
    
        // user inputs their last name
        wrd2 = keyboard.next();
       
            //making the input drop the first letter, and calling that pgt.
            pgt1 = wrd1.substring(1);
            pgt2 = wrd2.substring(1);
        
            //putting the original first letter onto the end of pgt, and 
            //adding "ay" in order to make it proper pig latin.
            wrd3 = (pgt1 + (wrd1.charAt(0)) + "ay");
            wrd4 = (pgt2 + (wrd2.charAt(0)) + "ay");
        
            //making the fnl product all lower case
            fnl1 = wrd3.toLowerCase();
            fnl2 = wrd4.toLowerCase();
        
            //taking the first letter of my product word, and naming it pgt3-4.
            pgt3 = fnl1.substring(0,1);
            pgt4 = fnl2.substring(0,1);
        
        //dropping the first letter of my product word, and naming it wrd5-6.
            wrd5 = fnl1.substring(1);
            wrd6 = fnl2.substring(1);
        
            //reforming my product word so that the first letter is uppercase
            fnl3 = (pgt3.toUpperCase() + wrd5);
            fnl4 = (pgt4.toUpperCase() + wrd6);
       
    // Print out a message along with the users name in Pig Latin
    // with the first letter of each name capitolized. =)
    System.out.println("Your name in Pig Latin is: " + fnl3 + " " + fnl4);
        
  
    }
}
