public class question5 {

    //Write a method named find that takes in a single dimensional array of ints and another int that is a
    //key. The method should return the index of where the key appears in the array. If key is not found, the
    //methods returns -1
    public static void main(String[] args) {

    }

    public static int find(int key, int[] arr) {
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                index = i;
            }
        }

        return index;
    }
}
