/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeclass;

import java.util.Scanner;

/**
 *
 * @author sarbrinder dhillon
 */
public class TimeTester {
    public static void main(String[] args)
    {
        TimeClass time =new TimeClass();
        int hours, minutes, seconds;
        boolean invalidInputs =true;
        Scanner keyboard =new Scanner(System.in);
        do{
          System.out.print("Enter the hours: " );
         
         hours =keyboard.nextInt();
         
         System.out.print("Enter the minutes: " );
          minutes =keyboard.nextInt();
          System.out.print("Enter the seconds: " );
          seconds =keyboard.nextInt();
          
          try{
              time.setTime(hours, minutes, seconds);
              invalidInputs =false;
          }
          catch(IllegalArgumentException e)
          {
              System.err.printf("%%s%n", e.getMessage());
          }
        }
        while(invalidInputs);
        
        System.out.printf("The time is %s%n", time.toMilitaryTime());
        System.out.printf("The time is %s%n", time.toStandardTime());
        
       
    }
}
