/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdemo;

import java.util.Scanner;

/**
 *
 * @author yoges
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
          Scanner input = new Scanner(System.in);
          Scanner inputTwo = new Scanner(System.in);
            
           
           System.out.println("Are you feeling okay?  yes = 1 / no = 0 ");
           int healthCheck = input.nextInt();
            
            if (healthCheck <= 0){
                
                System.out.println("Where does it hurt?");
                String symptomCheck = inputTwo.nextLine().toLowerCase();
                
                switch(symptomCheck){
                    case "head":
                        System.out.println("TAKE TWO ADVIS AND REST");
                        break;
                        
                    case "stomach":
                        System.out.println("TAKE A SPOON FULL OF BISMUTH");
                        break;
                        
                    default:
                        System.out.println("This sounds serious! Call 911!");
                        break;
                }
              
                
            }else if (healthCheck >= 1){
              System.out.print("Looks like you are feeling fine. Thank you for coming in today.");
                
            }
                        
      }
            
            
 //           System.out.print("Enter your grade: ");
   //         String userGrade = input.nextLine().toUpperCase();
 //                   
//            switch(userGrade){
//                case "A+":
//                case "A":
//                    System.out.println("Distiction");
//                    break;
//                
//                case "B":
//                    System.out.println("B grade");
//                    break;
//                
//                case "C":
//                    System.out.println("C grade");
//                    break;
//                
//                default: 
//                    System.out.println("Fail");
//                    break;
//            }
            
    }
    

