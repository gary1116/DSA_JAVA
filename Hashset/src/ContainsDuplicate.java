/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true */


import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    private static boolean duplicate(int [] arr){
        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }

        return false;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers you want to check smallest and second smallest from:- ");

        int len=sc.nextInt();

        int [] num=new int[len];
        System.out.println("Now Enter the numbers:- ");

        for(int i=0;i<len;i++){
            num[i]=sc.nextInt();
        }

        boolean result = duplicate(num);
        System.out.println("does it have duplicate? "+ result);

    }
}
