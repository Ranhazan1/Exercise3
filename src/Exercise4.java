public class Exercise4 {
    public static void main(String[] args) {
        int[] arrayOffNumbers={4,5,7,6,8,9};
        boolean full=isFullArray(arrayOffNumbers);
        System.out.println(full);
    }
    public static int lowestIndex(int[] arrayOffNumbers){
        int lowestIndex=0;
        for (int i=1;i< arrayOffNumbers.length;i++){
            if (arrayOffNumbers[lowestIndex]>arrayOffNumbers[i]){
                lowestIndex=i;
            }
        }return lowestIndex;
    }
    public static boolean isFullArray(int[] arrayOffNumbers){
        int lowestIndex=lowestIndex(arrayOffNumbers);
        boolean fullArray=false;
        int nextIndex=arrayOffNumbers[lowestIndex]+1;
        for (int i=0;i<arrayOffNumbers.length;i++){
            if (arrayOffNumbers[i]==nextIndex){
                fullArray=true;
                nextIndex++;
            }
        }return fullArray;
    }
    public static boolean sortedFullArray(int[] arrayOffNumbers){
        boolean fullArray=true;
        int lowestValue=arrayOffNumbers[lowestIndex(arrayOffNumbers)];
        for (int i=0;i<arrayOffNumbers.length;i++){
            if (arrayOffNumbers[i]!=lowestValue){
                fullArray=false;
            }else {
                lowestValue++;
            }
        }return fullArray;
    }
    }
