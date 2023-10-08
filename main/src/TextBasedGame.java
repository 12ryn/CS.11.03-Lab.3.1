package src;

import java.util.Scanner;
public class TextBasedGame {

    public static void main(String[] args) {

        System.out.println(">>> RGL STUDIOS PRESENT: RUN OF MELSER <<<");
        System.out.println("When prompted for a response, please either type in your word or a number corresponding to the given choices.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your desired name: ");
        String name = scanner.nextLine();

        System.out.println("Guma: " + name + ", I have been waiting for you. I've been looking for the Stone of Kalos for as long as I could remember, and I heard you were the one capable.");
        System.out.println("(1) No \n(2) Of course, it is my pleasure.");
        int response = scanner.nextInt();

        if (response == 1) {
            System.out.println("Guma: You know what, just leave.");
            scanner.nextLine();
            gameCondition(true);
        } else if (response == 2) {
            System.out.println("Guma: Knew I could count on you. Let's get to work.");
            gameCondition(false);
        } else {
            System.out.println("Guma: You must be funny. Let's go.");
            gameCondition(false);
        }


        System.out.println("You & Guma arrive to Mount Melser.");
        System.out.println("Guma: It's on the top of the mountain. I've tried countless times, but I could never get through all the obstacles.");

        System.out.println("Choose an action:");
        System.out.println("(1) Proceed and enter mount Melser. \n(2) Wait and observe conditions. \n(3) Leave and go home.");

        response = scanner.nextInt();

        if (response == 1) {
            System.out.println("Guma: I admire your courage. Come with me.");
            gameCondition(false);
        } else if (response == 2) {
            System.out.println("Guma: Seriously? MORE time? Come on now, I don't have all day.");
            gameCondition(false);
        } else if (response <= 0 || response >= 4) {
            System.out.println("It was funny the first time. You do that once more you're out of this journey.");
            gameCondition(false);
        } else {
            System.out.println("Guma: Shame.");
            gameCondition(true);
        }

        int health = 5;

        System.out.println("You and Guma arrive at a cave. However, you bump into a hungry bear.");
        System.out.println("(1) Fight the bear! \n(2) Run for your life.");

        response = scanner.nextInt();

        if (response == 1) {
            System.out.println(bearAttack(Math.random(), health));
            gameCondition(false);
        } else if (response == 2) {
            System.out.println("Guma: Why would you do that?! Come on, we're fighting it.");
            System.out.println(bearAttack(Math.random(), health));
            gameCondition(false);
        } else {
            System.out.println("Did I not make myself clear!? Clowns belong in the circus, not in the quest to retrieve a prized stone.");
            gameCondition(true);
        }

        oldManSpeech("You and Guma make your way higher up the mountain. Unfortunately, you are bothered by an old man who wants to sell you his homemade chicken wings.\nOld man: Buy some of my hot chili wings, will ya? \nGuma: I'll tell you something, they are pretty good. You wanna get some? \n(1) Buy some wings \n(2) Forget it and move on");
        response = scanner.nextInt();

        if (response == 1) {
            System.out.println("Old man: How many?");
            response = scanner.nextInt();
            System.out.println(oldMan(true, response, Math.random(), health));
            gameCondition(false);
        } else if (response == 2) {
            System.out.println(oldMan(false, 0, Math.random(), health));
            gameCondition(false);
        } else {
            System.out.println("Did I not make myself clear!? Clowns belong in the circus, not in the quest to retrieve a prized stone.");
            gameCondition(true);
        }

        int code = gateCode(Math.random(), Math.random());
        System.out.println("You and Guma find yourselves at a gate. However, it requires a code for you to figure out before entering. ");
        System.out.println("Guma: I remember it. The code was " + code + ". Could you type it in for me?");

        response = scanner.nextInt();

        if (response == code) {
            System.out.println("Guma: Thanks. Look, there's your sword. \nYou pick up the sword in front of you.");
        } else {
            System.out.println("You have been denied authorization and set off a series of traps, leading to your death.");
            gameCondition(true);
        }

        System.out.println("Guma: Hey, heres a health potion. Drink this before you enter.");
        System.out.println("You consume Guma's health potion. \nHealth: 5");
        System.out.println("Goombas: INTRUDERS! LEAVE AT ONCE OR WE SHALL LEAD YOU TO YOUR DEMISE!");
        System.out.println("(1) Attack \n(2) Run");

        response = scanner.nextInt();

        if (response == 1) {
            System.out.println(goombaAttack(Math.random()));
        } else if (response == 2) {
            System.out.println("Coward. Knew I shouldn't have trusted you.");
            gameCondition(true);
        } else {
            System.out.println("Did I not make myself clear!? Clowns belong in the circus, not in the quest to retrieve a prized stone.");
            gameCondition(true);
        }

        int years = (int) ((Math.random() * 100) % 5) + 5;

        System.out.println("You and Guma make your way higher up the mountain.");
        System.out.println("???: You dare step in my territory?");
        System.out.println("Guma: That must be Galarios. I've fought him for more than " + years + " years. I swear I'll beat him this time.");
        System.out.println("Galarios: Looks like you've brought a buddy this time, that's cute. Ready to lose?");
        System.out.println("Choose your action: \n(1) Use sword and attack \n(2) Fight with Guma \n(3) Run away");

        response = scanner.nextInt();
        bossAttackOne(response);

        int gumaPotions = (int) (Math.random() * 10) + 3;
        int thirdOfPotions = gumaPotions / 3;
        System.out.println("Guma: I despise him. " + name + ", get me about a third of my healing potions. It's in my bag, theres " + gumaPotions + ", quick!");
        System.out.println("(1) Take all the potions and splash it on Guma \n(2) Take " + thirdOfPotions + " and splash it on Guma \n(3) Jump off the cliff");
        response = scanner.nextInt();
        potion(response);

        System.out.println("Galarios: Such a nuisance. DIE! \nGalarios swings at you viciously.");
        System.out.println("Choose your next action: \n(1) Dodge \n(2) Swing back \n(3) Run");
        response = scanner.nextInt();
        bossAttackTwo(response);

        System.out.println("Choose your next action: \n(1) Run for your life \n(2) Swing ferociously at Galarios");
        response = scanner.nextInt();
        bossAttackThree(response);
    }

    // METHODS BELOW !!

    public static boolean gameCondition(boolean gameOver) {

        if (gameOver) {
            System.out.println("You have failed to retrieve the Stone of Kalos. Game over.");
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }

    public static String bearAttack(double a, int hearts) {

        if (a < 0.2 || a >= 0.8) {
            hearts = hearts - 1;
            return "The Bear has bitten you!" + "\nHealth: " + hearts + "\nGuma: Gotta be more careful man...I heard those exact bears mauled 5 people at once a few winters back.";
        } else {
            return "You have slain the bear. You look closely and find absolutely zero loot. Brave, but unlucky.";
        }
    }

    public static void oldManSpeech(String oldman){

        System.out.println(oldman);
    }

    public static String oldMan(boolean buy, int amount, double foodPoison, int hearts){
        if (buy){

            if(amount <= 0){
                return "Old man: No wings for you, dimwit.";
            }

            else{
                System.out.println("Old man: " + amount + " wings, right here for ya! \nYou and Guma thoroughly enjoy the well-prepared chicken wings.");

                if(foodPoison < 0.2){

                    hearts = hearts - 1;
                    return "You have unexpectedly gotten food poisoning from the wings! \nHealth: " + hearts;
                }
            }
        }
        return "Guma: Alright then, let's get going.";
    }

    public static int gateCode(double a, double b){

        int intA = (int) (a * 10000);
        int intB = (int) (b * 100) + 1;

        return intA + intB;

    }

    public static String goombaAttack(double a){

        if(a < 0.5){

            return "You have successfully slain the Goomba. \nGuma: Annoying, aren't they? Come on, we haven't even fought the final boss yet.";

        }

        return "You strike the Goomba with a violent hit, causing it to run away.";

    }

    public static void bossAttackOne(int re){

        if(re == 1){
            System.out.println("Galarios has dodged your attack.");
            System.out.println("Hah, can't hit me.");
            gameCondition(false);
        }
        else if(re == 2){
            System.out.println("You have dealt 50 damage on Galarios!");
            gameCondition(false);
        }
        else if(re == 3){
            System.out.println("Coward. Knew I shouldn't have trusted you.");
            gameCondition(true);
        }
        else{
            System.out.println("Did I not make myself clear!? Clowns belong in the circus, not in the quest to retrieve a prized stone.");
            gameCondition(true);
        }
    }

    public static void potion(int pot) {

        if (pot == 1) {
            System.out.println("Guma: you...absolute...idiot.... \nGuma overdoses on the potions and dies. Consequently, you have no help and get stabbed by Galarios.");
            gameCondition(true);
        }

        else if (pot == 2) {
            System.out.println("Guma: Thanks, come on, hes weak.");
            gameCondition(false);
        }

        else if (pot == 3) {
            System.out.println("You leap off the cliff and fall to your death.");
            gameCondition(true);
        }

        else {
            System.out.println("Did I not make myself clear!? Clowns belong in the circus, not in the quest to retrieve a prized stone.");
            gameCondition(true);
        }
    }

    public static void bossAttackTwo(int action) {

        if (action == 1) {
            System.out.println("Guma: Close one. One deadly hit should do it!");
            gameCondition(false);
        }

        else if (action == 2) {
            System.out.println("Guma: So close! Just one more!");
            gameCondition(false);
        }

        else if (action == 3) {
            System.out.println("Guma: Coward. Knew I shouldn't have counted on you.");
            gameCondition(true);
        }

        else {
            System.out.println("Did I not make myself clear!? Clowns belong in the circus, not in the quest to retrieve a prized stone.");
            gameCondition(true);
        }
    }

    public static void bossAttackThree(int action) {

        if (action == 1) {
            System.out.println("Guma: WHY WOULD YOU DO THAT? You absolute...");
            gameCondition(true);
        }

        else if (action == 2) {
            System.out.println("Guma: Finally...after all these years, I've done it. Thank you so much, fellow comrade. I wish you a safe journey home.");
            System.out.println("You have successfully retrieved the Stone of Kalos and earned yourself the title of Guma's Bro.");
            System.out.println(">>> YOU WIN <<<");
            gameCondition(false);
        }

        else {
            System.out.println("Did I not make myself clear!? Clowns belong in the circus, not in the quest to retrieve a prized stone.");
            gameCondition(true);
        }
    }
}