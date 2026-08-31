package EASY;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoSum {

    public static boolean twoSum(int []arr, int sum){
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;i++){
               if(arr[i]+arr[j]==sum){
                   return true;
               }
           }
       }
       return false;
    }

    public static int[] getTwoValueSum(int arr[],int sum){
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array;- ");

        int len=sc.nextInt();
        System.out.println("Now enter the values:-");
        int[] arr = IntStream.range(0, len)
                .map(i -> sc.nextInt())
                .toArray();

        System.out.println("Enter the sum you want from 2 values");
        int sum=sc.nextInt();

            boolean value=twoSum(arr,sum);
            int values[]=getTwoValueSum(arr,sum);


        System.out.println("are we able to find sum from 2 values of arrays?"+value);
        System.out.println("teh values are:- ");
        Arrays.stream(values).forEach(i->System.out.println(i));
    }
}
