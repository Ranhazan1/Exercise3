import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int[] newArr=intToArray(number);
       // for (int i=0;i<newArr.length;i++){
          //  System.out.println(newArr[i]);
        System.out.println(checkNumber(newArr));
        }
        public static int indexOfSmallest(int[] numberArray) {
            for (int i = 0; i < numberArray.length; i++) {

            }
        }

    public static boolean checkNumber(int[] numberArray) {
        boolean isAlternateNumber=true ;
        int modulo;
        if (numberArray.length != 1) {
            for (int i=1;i<numberArray.length;i++){
                if (isEven(numberArray[i])==isEven(numberArray[i-1])){
                    isAlternateNumber=false;
                    break;
                }
            }
        }return isAlternateNumber;
    }
    public static boolean isEven(int number){
        boolean even=true;
        int modulo=number%2;
        if (modulo==1){
            even=false;
        }return even;
    }

    public static int[] intToArray(int number){
        int arrayLength=1;
        int modulo;
        int number2=number;
        while(number2>10){
            modulo=number2%10;
            number2=number2/10;
            arrayLength++;
        }
        int[] newArray=new int[arrayLength];
        for (int i=arrayLength;i>0;i--){
            modulo=number%10;
            number=number/10;
            newArray[i-1]=modulo;
        }
        return newArray;
    }
}
