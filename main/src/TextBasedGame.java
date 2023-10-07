package src;

import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {


        System.out.println("Instructions: When promopted for a response, please either type in your word or a number corresponding to the given choices.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your desired name: ");
        String name = scanner.nextLine();

        System.out.println("Guma: " + name + ", I have been waiting for you. I've been looking for the Stone of Kalos for as long as I could remember.");
        System.out.println("(1) No \n(2) Of course, it is my pleasure.");
        int response = scanner.nextInt();

        if(response) {
            if (response == 1) {
                System.out.println("Guma: You know what, just leave.");
                scanner.nextLine();
                gameCondition(true);
            }

            else if (response == 2) {
                System.out.println("Guma: Knew I could count on you. Let's get to work.");
                gameCondition(false);
            }

            else {
                System.out.println("Guma: You must be funny. Let's go.");
                gameCondition(false);
            }
        }


        System.out.println("You & Guma arrive to Mount Melser.");
        System.out.println("Guma: It's on the top of the mountain. I've tried countless times, but I couldn't get through all the obstacles.\nI have provided you with some health packs, water and food. Make sure you use them wisely.");
        System.out.println("If you ever wish to consume a health pack, water or food, please tell Guma by typing in 'Use health pack', 'Use water' or 'Use food' respectively");

        int healthPacks = 2;
        int water = 2;
        int foodKits = 2;

        int healValue = 1;
        int quenchValue = 1;
        int eatValue = 1;

        int health = 5;
        int thirst = 5;
        int hunger = 5;

        System.out.println("Choose an action:");
        System.out.println("(1) Proceed and enter mount Melser. \n(2) Wait and observe conditions. \n(3) Leave and go home.");

        response = scanner.nextInt();

        if(response){

            if(response == 1){
                System.out.println("Guma: I admire your courage. Come with me.");
                gameCondition(false);
            }
            else if(response == 2){
                System.out.println("Guma: Seriously? MORE time? Come on now, I don't have all day.");
                gameCondition(false);
            }
            else if(response <= 0 || response >= 4){
                System.out.println("It was funny the first time. You do that once more you're out of this journey.");
                gameCondition(false);
            }
            else{
                System.out.println("Guma: Shame.");
                gameCondition(true);
            }
        }

        System.out.println("You and Guma arrive at a cave. However, you bump into a hungry bear.");
        System.out.println("(1) Fight the bear! \n(2) Run for your life.");

        response = scanner.nextInt();

        if(response){

            if(response == 1){
                System.out.println(bearAttack(Math.random(), Math.random()));
                gameCondition(false);
            }
            else if(response == 2){
                System.out.println("Guma: Why would you do that?! Come on, we're fighting it.");
                System.out.println(bearAttack(Math.random(), Math.random()));
                gameCondition(false);
            }
            }
            else{
                System.out.println("Guma: I told you. GET OUT!");
                gameCondition(true);
            }
        }
    }

    public static boolean gameCondition(boolean gameOver){

        if(gameOver == true){
            System.out.println("You have failed to retrieve the Stone of Kalos. Game over.");
            System.exit(0);
            return true;
        }
        else{
            return false;
        }
    }

    public static String bearAttack(int a, int b){

        if(a < 0.4){
            return "The Bear has bitten you! \nHealth: 4 \nThirst: 5 \nHunger: 4";
        }

        else if(a >= 0.4){
            if (b < 0.5) {
                return "You have slain the bear. You look closely and find absolutely zero loot. Brave, but unlucky.";
            }
            else {
                return "You have slain the bear. You look closely and find a potion of damage.";
            }
        }

        return "";
    }

}
