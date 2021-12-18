public class Exercise3 {
    public static void main(String[] args) {
        int number=12348765;
        int[] newArray=factorization(number);
        for (int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }

    }
    public static int[] factorization(int number){
        int[] newArray=new int[lengthOffArray(number)];
        int modulo;
        int counter=0;
        while (number!=1){
            for (int i=2;i>0;i++){
                modulo=number%i;
                if (modulo==0){
                    newArray[counter]=i;
                    number=number/i;
                    counter++;
                    break;
                }
            }
        }return newArray;
    }
    public static int lengthOffArray(int number){
        int counter=0;
        int modulo;
        while (number!=1){
            for (int i=2;i>0;i++){
                modulo=number%i;
                if (modulo==0){
                    number=number/i;
                    counter++;
                    break;
                }
            }
        }return counter;
    }
}
