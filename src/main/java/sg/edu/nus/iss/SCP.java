package sg.edu.nus.iss;

import java.util.Random;


public class SCP {
  

    public Integer generatedComputerChoice() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public String checkWinner(Integer playerChoice, Integer computerChoice) {
       
       // 0: scissors, 1: paper, 2: stone
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
                 case 1: //paper
                    if (computerChoice == 2) {
                        result = "Computer";
                    } else {
                        result = "Human";
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
