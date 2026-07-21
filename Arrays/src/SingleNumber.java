/*

Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.


Example 1

Input : nums = [1, 2, 2, 4, 3, 1, 4]

Output : 3

Explanation : The integer 3 has appeared only once.

Example 2

Input : nums = [5]

Output : 5

Explanation : The integer 5 has appeared only once.

* */


import java.util.Scanner;

public class SingleNumber {

    public static int checkSingleNum(int []arr, int n){

        int [] numbers=new int[10];

        for(int i=0;i<n;i++){
        numbers[arr[i]]=numbers[arr[i]]+1;
        }

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1){return i;}
        }
        return -1;

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

        int single=checkSingleNum(arr,len);

        System.out.println("the number occuring only once is :-"+single);
    }
}
