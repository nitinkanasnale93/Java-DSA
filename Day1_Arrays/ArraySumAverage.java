package Day1_Arrays;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] arr = {12, 25, 33, 47, 19};
        int sum = 0;
        for( int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    
    }
    
}
