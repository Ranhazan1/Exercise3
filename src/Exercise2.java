import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int[] arr1= {12,45,8,24,15,85};
        int[] arr2={21,54,63,36,18,10,51};
        System.out.println(indexOffSmallest(arr1,arr2));
    }
    public static int indexOffSmallest(int[] arr1,int[] arr2){
        int index;
        int[] counter=new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (checkSum(arr1[i])==checkSum(arr2[j])){
                    counter[i]++;
                }
            }
        }index=0;
        for (int i=1;i<counter.length;i++){
            if (index<counter[i]){
                index=i;
            }
        }return index;
    }

    public static int checkSum(int number){
        int[] newArray=intToArray(number);
        int sum=0;
        for (int i=0;i<newArray.length;i++){
            sum=sum+newArray[i];
        }return sum;
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
