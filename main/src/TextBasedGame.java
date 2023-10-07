public class TextBasedGame {

    public static void main(String[] args) {

        System.out.println("Instructions: When promopted for a response, please either type in your word or a number corresponding to the given choices.");

        Scanner scanner = new Scanner.(System.in);
        System.out.println("Please enter your desired name: ");
        String name = scanner.nextLine();
        scanner.nextLine()

        System.out.println("Guma: " + name + ", I have been waiting for you. I've been looking for the Stone of Kaloxi for as long as I could remember.");
        System.out.println("(1) No \n(2) Of course, it is my pleasure.");
        int response = scanner.nextInt();

        if(response == 1) {
            System.out.println("Guma: You know what, just leave.");
            gameCondition(false);
        }

        else if(response == 2){
            System.out.println("Guma: Knew I could count on you. Let's get to work.")
            gameCondition(true);
        }

        else{
            System.out.println("Guma: You must be funny. Let's go.");
            gameCondition(true);
        }

        System.out.println("You & Guma arrive to the land of Melser");
        System.out.println("Guma: It's on the top of the mountain. I've tried countless times, but I couldn't get through all the obstacles.");

        int healthPacks = 3;
        int water = 3;
        int foodKits = 3;

        int healValue = 2;
        int quenchValue = 2;
        int eatValue = 2;

        System.out.println("You & Guma arrive at the mountain. Choose an action:");
        System.out.println("(1) Proceed and enter mount Melser. \n(2) Wait and observe conditions. \n(3) Leave and go home.");

        if(response == 1) {
            System.out.println("Guma: You know what, just leave.");
            gameCondition(false);
        }

        else if(response == 2){
            System.out.println("Guma: Knew I could count on you. Let's get to work.")
            gameCondition(true);
        }

        else{
            System.out.println("Guma: You must be funny. Let's go.");
            gameCondition(true);
        }

    }

    public static String gameCondition(boolean winLoss){

        if(winLoss == false){
            return "You have failed to retrieve the Stone of Kaloxi. Game over.";
        }
        else{
            return;
        }
    }

    public static


}
