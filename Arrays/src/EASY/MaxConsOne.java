package EASY;


//Example 1:
//Input: prices = {1, 1, 0, 1, 1, 1}
//Output: 3
//Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
//
//Example 2:
//Input: prices = {1, 0, 1, 1, 0, 1}
//Output: 2
//Explanation: There are two consecutive 1's in the array.

import java.util.Scanner;
import java.util.stream.IntStream;

public class MaxConsOne {

    public static int checkConsecutiveOnes(int arr[]){
       int num=0;
       int count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==1){
               count++;
           }else{
               num=Math.max(num,count);
               count=0;
           }
       }
       num=Math.max(num,count);
       return num;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int num=checkConsecutiveOnes(arr);
        System.out.println("the maximum consecutive times 1 apppear is:- "+num);
    }
}
