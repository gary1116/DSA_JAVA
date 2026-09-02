package Medium;

import java.util.Scanner;
import java.util.stream.IntStream;


/*
below problem can also be considered as max sub array

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.




* */
public class KadaneAlgo {

    public static long maxSubArray(int[] arr){
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers:-");

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        long max=maxSubArray(arr);

        System.out.println("The majority element is :- "+max);

    }
}
