package Day1_Arrays;

public class Binary {

    public static int binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (arr[mid] == target) {
                return mid; // element found
            }

            if (arr[mid] < target) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        return -1; // element not found
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 70;

        int result = binarysearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
