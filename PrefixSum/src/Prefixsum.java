
//Given an array arr[], Find the prefix sum of the array. A prefix sum array is another array prefixSum[] of the same size, such that prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].
//
//Examples:
//
//Input: arr[] = [10, 20, 10, 5, 15]
//Output: [10, 30, 40, 45, 60]
//Explanation: For each index i, add all the elements from 0 to i:
//prefixSum[0] = 10,
//prefixSum[1] = 10 + 20 = 30,
//prefixSum[2] = 10 + 20 + 10 = 40 and so on.
//
//        Input: arr[] = [30, 10, 10, 5, 50]
//Output: [30, 40, 50, 55, 105]
//Explanation: For each index i, add all the elements from 0 to i:
//prefixSum[0] = 30,
//prefixSum[1] = 30 + 10 = 40,
//prefixSum[2] = 30 + 10+ 10 = 50 and so on.

import java.util.Scanner;

public class Prefixsum {

    public static int [] prefix(int [] arr){
        int [] nums= new int[arr.length];

        nums[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            nums[i]=nums[i-1]+arr[i];
        }

        return nums;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:- ");

        int len=sc.nextInt();

        int [] arr1=new int[len];
        System.out.println("Now Enter the numbers for array :- ");

        for(int i=0;i<len;i++){
            arr1[i]=sc.nextInt();
        }

        int[] arr2=prefix(arr1);

        for(int i=0;i<len;i++){
            System.out.println(arr2[i]);
        }

    }
}
