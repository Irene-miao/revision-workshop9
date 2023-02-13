package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

public class SCP {
  

    public Integer generatedComputerChoice() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public String checkWinner(Integer playerChoice, Integer computerChoice) {
        String result = "" ;

        if (playerChoice == computerChoice) {
            result = "Tie";
        } else {
            switch (playerChoice) {
                case 0: //scissor
                    if (computerChoice == 1) {
                        result = "Human";
                    } else {
                        result = "Computer";
                    }
                    break;
                 case 2: //stone
                    if (computerChoice == 0) {
                        result = "Human";
                    } else {
                        result = "Computer";
                    }
                    break;
                 default:
                    break;   
            }
        }
        return result;

    }

      
}
