import java.util.Random;
import java.util.Scanner;
public class GuessMain {

    public static int rando()
    {
        Random gen = new Random();
        return gen.nextInt(20) + 1;// generating a number between 1 and 20

    }
    public static void rng()
    {   int gen=rando();
        int count=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String newline= scan.nextLine();
        System.out.println("Well, "+newline+", I am thinking of a number between 1 and 20.\n Take a guess.");
        newline= scan.nextLine();
        while (!(Parseable(newline) instanceof Integer)||Integer.decode(newline) < 1 || Integer.decode(newline) > 20) {
            System.out.println("The number was not between 1 and 20. Please type a number between 1 and 20.");
            newline = scan.nextLine();
        }
            while (Integer.decode(newline) != gen) {

                while (!(Parseable(newline) instanceof Integer)||Integer.decode(newline) < 1 || Integer.decode(newline) > 20) {
                    System.out.println("The number was not between 1 and 20. Please type a number between 1 and 20.");
                    newline = scan.nextLine();
                }
                if (Integer.decode(newline) < gen) {
                    System.out.println("Try a larger number.");
                    count++;
                    newline = scan.nextLine();
                }
                if (Integer.decode(newline) > gen) {
                    System.out.println("Try a smaller number.");
                    count++;
                    newline = scan.nextLine();
                }
            }


        count++;
        if(count<=6)
        System.out.println("You win! You guessed the correct number in "+count+" tries.");
        else
            System.out.println("You guessed the correct number, but you got it after too many attempts.");

        }
        public static Object Parseable(String str)
        {  //This function tests if the user input can be parsed into an int.
            try{
                return Integer.decode(str);
            }
            catch(Exception e){
                return "The line typed was not a number between 1 and 20.";
            }
        }
        public static Object yesOrNo(String str)
        {
            if(str.equals("y")||str.equals("n"))
                return str;
            else
                return 0;
        }
    public static void main(String[] args)
    {
       rng();//runs the game for at least one round
       System.out.println("Try again? (Type 'y' for yes, 'n' for no)");
       Scanner scan=new Scanner(System.in);
       String check=scan.nextLine();
        while(true)
        {    try {
            if (yesOrNo(check).equals("y")) {
                rng();//restart the guessing game.
                System.out.println("Try again? (Type 'y' for yes, 'n' for no)");
                check = scan.nextLine();
            }
            if (yesOrNo(check).equals("n")) {
                break;
            }
        }
        catch (Exception e){
            System.out.println("Please type either 'y' for another game, or 'n' to cancel.");
        }

        }
    }
}
