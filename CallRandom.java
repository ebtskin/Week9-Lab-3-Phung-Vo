// Lab 3 part CallRandom

import java.util.Scanner;

public class CallRandom 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random myRandonNumber = new Random();
        int i = 0;
        int size = 10;
        int[] oddGuess = new int[size];
        int[] evenGuess = new int[size];
        int[] compNum = new int[size];
        int[] won = new int [size];
        int[] lost = new int [size];
        int[] round = new int [size];
        String response = null;
        
        
        while (i < 10 )
        {
            
            compNum[i] = myRandonNumber.GetANumber_Between_1_and_10();
            int gameNum = compNum[i];
            System.out.println("Guess if the dice is odd or even. Use 1 for odds and 10 for even!");
            int userGuess = input.nextInt();
            if ((userGuess < 1)|| (userGuess > 10))
            {
                System.out.println("Please use either 1 or 10");
            }
            else 
            {
                if ((userGuess == 2)|| (userGuess == 4)|| (userGuess == 6)|| (userGuess == 8)|| (userGuess == 10))
                {
                    evenGuess[i] = 1;
                }
                else 
                {
                oddGuess[i] = 1;
                }
                if (userGuess == gameNum)
                {
                    response = "You guessed right";
                    won[i] = 1;
                }
                else
                {
                    response = "Sorry you guessed wrong!"+" Computer Number is: "+gameNum;
                    lost[i] = 1;
                            
                }
                
            }
            System.out.println(response);
            round[i] = i+1;
            i++;
        }    
        i = 0;
        while (i <10)
        {
            System.out.print("round: "+round[i]+" Even Guess: "+evenGuess[i]+" Odd Guess: "+oddGuess[i]+" Computer's Numnber: "+compNum[i]+" Won: "+won[i]+"\n");
            i++;
        }
    }
    
}
