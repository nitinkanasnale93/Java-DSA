package Day1_Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        
    
    int[] arr = {93, 53, 26, 31, 54};
    System.out.println("Original array:");
    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
    }

    System.out.println("Reversed Array:");
    for(int i = arr.length - 1; i >= 0; i-- ) {
    System.out.println(arr[i] + " ");
    }

}

    
}
