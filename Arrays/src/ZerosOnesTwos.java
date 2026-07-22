
/*

Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.



The sorting must be done in-place, without making a copy of the original array.


Example 1

Input: nums = [1, 0, 2, 1, 0]

Output: [0, 0, 1, 1, 2]

Explanation:

The nums array in sorted order has 2 zeroes, 2 ones and 1 two

Example 2

Input: nums = [0, 0, 1, 1, 1]

Output: [0, 0, 1, 1, 1]

Explanation:

The nums array in sorted order has 2 zeroes, 3 ones and zero twos


 */


import java.util.Scanner;

public class ZerosOnesTwos {

    private static int[] zeroOneTwoSort(int[] arr){

        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            } else if (arr[i]==1) {
                count1++;

            }else{
                count2++;
            }
        }

        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i]=1;
        }
        for(int i=count0+count1;i<arr.length;i++){
            arr[i]=2;
        }

        return arr;
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

        int [] sorted= zeroOneTwoSort(arr);

        for(int i=0;i<len;i++){
            System.out.print(sorted[i]+" ");
        }
    }
}
