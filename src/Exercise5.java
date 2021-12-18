import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter text");
        String str = scanner.nextLine();
        char mostCommonChar = mostCommonChar(str);
        char secondCommonChar=secondCommonChar(str);
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==mostCommonChar){
                System.out.print(secondCommonChar);
            }else if (str.charAt(i)==secondCommonChar){
                System.out.print(mostCommonChar);
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static char mostCommonChar(String str) {
        int mostCommon = 0;
        int charPlace = 0;
        char mostCommonChar = str.charAt(0);
        while (charPlace < str.length()) {
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(charPlace) == str.charAt(i)) {
                    counter++;
                }
            }
            if (mostCommon < counter) {
                mostCommonChar = str.charAt(charPlace);
                mostCommon = counter;
            }
            charPlace++;
        }
        return mostCommonChar;
    }

    public static char secondCommonChar(String str) {
        int newStringLength = 0;
        int newStringIndex = 0;
        char mostCommonChar = mostCommonChar(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != mostCommonChar) {
                newStringLength++;
            }
        }
        char[] newCharArray = new char[newStringLength];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != mostCommonChar) {
                newCharArray[newStringIndex] = str.charAt(i);
                newStringIndex++;
            }
        }
        String newString = new String(newCharArray);
        char secondCommonChar = mostCommonChar(newString);
        return secondCommonChar;
    }
}

