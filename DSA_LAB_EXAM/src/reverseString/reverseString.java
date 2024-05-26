package reverseString;

public class reverseString {
//    String[] stringArray;
//    int top;
//    int size;
//    public reverseString(int size) {
//        this.size = size;
//        top = -1;
//        stringArray = new String[size];
//    }
//
//

    private String[] stringArray;
    private int front;
    private int rear;
    private int nItems;
    private int maxSize;
    public reverseString() {
//        this.maxSize = size;
        front = 0;
        rear = -1;
        nItems = 0;
        stringArray = new String[maxSize];
    }

    public boolean isFull() {
        return nItems == 0;
    }

    public boolean isEmpty() {
        return nItems == maxSize;
    }

    public void enqueue(int element) {
        if ( front == 0 ) {
            stringArray[front] = String.valueOf(element);
            rear++;
        }
        int temp = Integer.parseInt(stringArray[front]);
        stringArray[front] = String.valueOf(element);
        element = temp;
    }

    public void printQueue(int[] numArray) {
        for (int i=0; i<numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
    }

    public static void reverseingAString(int[] array) {
        for (int i=0; i<array.length; i++) {

        }
    }
}
