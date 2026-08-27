package EASY;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LongestSubArray {

    public static int findSubArray(int arr[],int k){
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;

            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                if(sum==k){
                    int length=j-i+1;
                    maxLength=Math.max(length,maxLength);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        System.out.println("Enter the value you wanted to find in the longest subArray:-");
        int k=sc.nextInt();

        int subArrayLength=findSubArray(arr,k);

        System.out.println("the longest sub array with value "+k+" is "+subArrayLength);
    }

}
