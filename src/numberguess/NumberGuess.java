
package numberguess;

/**
 *
 * @author Matthew Voci
 */
public class NumberGuess {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws java.io.IOException, InterruptedException{

        //test test test test
        // random useless comments 
        // hello everyone
        //Zoë
        
        java.io.BufferedReader keyIn = new java.io.
                BufferedReader(new java.io.InputStreamReader(System.in));

        int number = 45;
        int nguess = 10;
        int guess;

        System.out.println("Let's play guess the number");

        for(int i = 1; i <= nguess ; i++){
            System.out.print("\nGuess a number from 1 - 100: ");
            guess = Integer.parseInt(keyIn.readLine());

            if (guess == number){
                System.out.println("Congrats, you guessed it!");
                i = nguess;
            }
            if (guess > number){
                System.out.println("Your guess is too high");

            }
            if (guess < number){
                System.out.println("Your guess is too low");
            }

        }

        System.out.println("GAME OVER");


    }

}
