

/*

Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.



Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in any order.


Example 1

Input: nums = [1, 6, 2, 10, 3], target = 7

Output: [0, 1]

Explanation:

nums[0] + nums[1] = 1 + 6 = 7

Example 2

Input: nums = [1, 3, 5, -7, 6, -3], target = 0

Output: [1, 5]

Explanation:

nums[1] + nums[5] = 3 + (-3) = 0

*/

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    private static int [] twoSum(int arr[],int target){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int findNum=target-arr[i];
            if(map.containsKey(findNum)){
                return new int[]{map.get(findNum),i};
            }
            map.put(arr[i],i);
        }

        return new int[]{-1,-1};



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
        System.out.println("Now Enter the target:- ");
        int target= sc.nextInt();

        int [] sorted= twoSum(arr,target);

        for(int i=0;i<sorted.length;i++){
            System.out.print(sorted[i]+" ");
        }
    }
}
