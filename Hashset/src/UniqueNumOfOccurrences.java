
/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumOfOccurrences {

    public static boolean unique(int[] arr){

        HashMap<Integer,Integer> frequency=new HashMap<>();
        HashSet<Integer> set= new HashSet<>();
        for(int x:arr){
            frequency.put(x, frequency.getOrDefault(x,0)+1);
        }

        for(int x:frequency.values()){
            set.add(x);
        }
        return frequency.size()==set.size();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:- ");

        int len=sc.nextInt();

        int [] num=new int[len];
        System.out.println("Now enter the numbers:- ");

        for(int i=0;i<len;i++){
            num[i]=sc.nextInt();
        }

        boolean result = unique(num);
        System.out.println("is the occurrences unique?:- "+ result);
    }
}
