import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number= scanner.nextInt();
        System.out.println(checkNumber(intToArray(number)));
        int[] newArray={14,25,36,13,12};
        System.out.println(indexOfSmallest(newArray));
        }

        public static int indexOfSmallest(int[] numberArray) {
        int[] arrayOffSums=new int[numberArray.length];
        int sum=0;
            for (int i = 0; i < numberArray.length; i++) {
                sum=0;
                int[] newArray = intToArray(numberArray[i]);
                boolean check=checkNumber(newArray);
                if (check){
                    for (int j=0;j<newArray.length;j++){
                        sum+=newArray[j];
                    }
                }arrayOffSums[i]=sum;
            }int indexOffSmallest=0;
            if (arrayOffSums[indexOffSmallest]==0){
                indexOffSmallest++;
            }
            for (int i=0;i<arrayOffSums.length;i++){
                if (arrayOffSums[indexOffSmallest]>arrayOffSums[i]){
                    if (arrayOffSums[i]!=0) {
                        indexOffSmallest = i;
                    }
                }
            }return indexOffSmallest;
        }

    public static boolean checkNumber(int[] numberArray) {
        boolean isAlternateNumber=true ;
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
