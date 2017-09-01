/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;


public class Game {
    
    private Scanner sc = new Scanner(System.in);

    private final String UserWinsMessageString = "You win!";
    private final String ComputerWinsMessageString = "You lose.";
    private final String TieMessageString = "Tie";
    
    private String userChoice;
    private String computerChoice;
    
    public Game(){
        
    }
    
     private void choices(String computerChoiceParam){
        
        userChoice = sc.nextLine();
         
        computerChoice = computerChoiceParam;
        }
    
    public void play(){
        
        choices("paper");
        
        System.out.println(userChoice);
        System.out.println(computerChoice);
        
        if(userChoice.equals(computerChoice)){
        System.out.println(TieMessageString);
   }
        else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
            System.out.println(ComputerWinsMessageString);
        }
        else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println(UserWinsMessageString);
        }
        else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println(UserWinsMessageString);
        }
        else if (userChoice.equals("paper") && computerChoice.equals("scissors")) {
            System.out.println(ComputerWinsMessageString);
        }
        else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
            System.out.println(UserWinsMessageString);
        }
        else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println(UserWinsMessageString);
        }
    }
    
    
}

   
