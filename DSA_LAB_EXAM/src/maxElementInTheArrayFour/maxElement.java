package maxElementInTheArrayFour;

public class maxElement {

    public static int findMaxElement(int[] array) {
        int max = 0;
        for (int i=0; i<=array.length - 1; i++) {
            for (int j=0; j<array.length -1; j++){
                if (array[j] < array[j+1]) {
                    max = array[j+1];
                }
            }
        }
        return max;
    }
}
