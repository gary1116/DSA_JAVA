import java.util.Scanner;

public class MaxSubArrayBelowZero {

    private static int maxSubArrayBelowZero(int []arr){
        // Handles an empty array
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int sum = arr[0];
        int maximum = arr[0];

        // Start from index 1 because arr[0] is already used
        for (int i = 1; i < arr.length; i++) {

            // Start a new subarray or continue the previous subarray
            sum = Math.max(arr[i], sum + arr[i]);

            // Store the best sum found so far
            maximum = Math.max(maximum, sum);
        }

        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:- ");

        int len=sc.nextInt();

        int [] arr=new int[len];
        System.out.println("Now Enter the numbers for array:- ");

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int maximum= maxSubArrayBelowZero(arr);

        System.out.print(" the maximum is :-"+maximum);
    }
}
