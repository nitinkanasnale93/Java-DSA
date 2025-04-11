package Day1_Arrays;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 9, 5, 1};
        int key = 5;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }
    }
}
