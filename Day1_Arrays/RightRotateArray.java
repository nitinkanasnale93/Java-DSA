package Day1_Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // Perform the right rotation
        int last = arr[arr.length - 1];  // Last element of the array
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  // Shift elements to the right
        }
        arr[0] = last;  // Place the last element at the first index
        
        // Print the rotated array
        System.out.println("After rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
