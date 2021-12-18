import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] passcode = passcode();
        printInstructions();
        int triesRemaining;
        int difficult = getUserDifficult();
        if (difficult==-1){
            triesRemaining=random.nextInt(20)+6;
        }else {
            triesRemaining=difficult;
        }
        while (triesRemaining > 0) {
            int[] userPasscode = getUserInput();
            boolean checkUserInput = isInputOk(userPasscode);
            if (!checkUserInput) {
                triesRemaining --;
                System.out.println("some off your digits repeat herself you lost 2 tries");
            }
            int accurateGuesses = accurateGuesses(passcode, userPasscode);
            int partialGuesses = partialGuesses(passcode, userPasscode);
            System.out.println("your accurate guesses: " + accurateGuesses);
            System.out.println("your partial guesses: " + partialGuesses);
            if (accurateGuesses == 4) {
                System.out.println("you win");
                break;
            }
            triesRemaining--;
            while (difficult!=-1) {
                System.out.println("tries left: " + triesRemaining);
                break;
            }if (triesRemaining==0){
                System.out.println("you lose");
                System.out.println("the passcode is: ");
                printPasscode(passcode);
            }
        }
    }

    public static int[] passcode() {
        Random random = new Random();
        int[] passcode = new int[4];
        int number=0;
        for (int i = 0; i < passcode.length; i++) {
            do {
                number = random.nextInt(6) + 1;
            } while ((number == passcode[0])||( number == passcode[1] )||(number == passcode[2])||(number == passcode[3]));
            passcode[i] = number;
        }
        return passcode;
    }

    public static void printPasscode(int[] passcode){
        for (int i=0;i< passcode().length;i++){
            System.out.print(passcode[i]+", ");
        }
    }

    public static int[] getUserInput(){
        Scanner scanner=new Scanner(System.in);
        int[] userInput=new int[4];
        for (int i=0;i<userInput.length;i++){
            do {
                System.out.println("\nguess the " + (i + 1) + " number off passcode");
                userInput[i] = scanner.nextInt();
                if (userInput[i]>6||userInput[i]<1){
                    System.out.println("number must be between 1-6 try again");
                }
            }while ((userInput[i]>6)||(userInput[i]<1));
        }return userInput;
    }

    public static boolean isInputOk(int[] userInput){
        boolean checkUserInput=true;
        for (int i=0;i<userInput.length;i++){
            for (int j=0;j<userInput.length;j++) {
                while (i != j) {
                    if (userInput[i] == userInput[j]) {
                        checkUserInput = false;
                    }break;
                }
            }if (!checkUserInput) {
                break;
            }
        }return checkUserInput;
    }

    public static int getUserDifficult(){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("choose your game difficult");
        System.out.println("1-the easy way-20 chances to guess the code");
        System.out.println("2-the medium way-15 chances to guess the code");
        System.out.println("3-the hard way-only 10 chances to guess the code");
        System.out.println("4-surprise me-a number between 5-25 will pick randomly");
        int userChoice=0;
        int numberOffChances=0;
        do {
            userChoice=scanner.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("you choose- the easy way");
                    numberOffChances=20;
                    break;
                case 2:
                    System.out.println("you choose- the medium way");
                    numberOffChances=15;
                    break;
                case 3:
                    System.out.println("you choose- the hard way");
                    numberOffChances=10;
                    break;
                case 4:
                    System.out.println("you choose- the surprising way" +"" +
                            " a number will pick randomly");
                    numberOffChances=-1;
                    break;
            }
            if (userChoice>4||userChoice<1){
                System.out.println("your choice is illegal try again");
            }
        }while (userChoice>4||userChoice<1);
        return numberOffChances;
    }
    public static void printInstructions(){
        System.out.println("a 4 digits passcode is randomly picked by the computer ");
        System.out.println("the passcode contains digits from 1-6 and the same digit cannot appear twice");
        System.out.println("to win the game you need to guess the passcode in a limited number of tries ");
        System.out.println("caution!!! if you guess a passcode with a digits that repeat herself more than once,"+
                "2 off your guess will be removes");
    }
    public static int accurateGuesses(int[] passcode,int[] userPasscode){
        int numberOffAccurateGuesses=0;
        for (int i=0;i< passcode().length;i++){
            if (passcode[i]==userPasscode[i]){
                numberOffAccurateGuesses++;
            }
        }return numberOffAccurateGuesses;
    }
    public static int partialGuesses(int[] passcode,int[] userPasscode){
        int partialGuesses=0;
        for (int i=0;i<passcode.length;i++){
            for (int j=0;j<userPasscode.length;j++){
                while(i!=j){
                    if (passcode[i]==userPasscode[j]){
                        partialGuesses++;
                    }break;
                }
            }
        }return partialGuesses;
    }
}
