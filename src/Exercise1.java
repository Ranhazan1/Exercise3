public class Exercise1 {
    public static void main(String[] args) {

    }
    public static int[] intToArray(int number){
        int arrayLength=1;
        int modulo;
        int number2=number;
        while(number>10){
            modulo=number2%10;
            number2=-modulo;
            arrayLength++;
        }
        int[] newArray=new int[arrayLength];
        for (int i=arrayLength;i>0;i--){

        }
    }
}
