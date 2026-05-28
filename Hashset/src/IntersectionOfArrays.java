/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

* */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfArrays {

    public static ArrayList<Integer> intersect(int[] arr1,int [] arr2){
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> resultSet=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if (set.contains(arr2[i])){
                resultSet.add(arr2[i]);
            }
        }

        ArrayList<Integer> list= new ArrayList<>(resultSet);
        return list;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array1:- ");

        int len=sc.nextInt();

        int [] arr1=new int[len];
        System.out.println("Now Enter the numbers for array1 :- ");

        for(int i=0;i<len;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the length of array2:- ");

        int len2=sc.nextInt();

        int [] arr2=new int[len];
        System.out.println("Now Enter the numbers for array2 :- ");

        for(int i=0;i<len2;i++){
            arr2[i]=sc.nextInt();
        }

        ArrayList<Integer> result =  new ArrayList<>();

            result =intersect(arr1,arr2);

        System.out.println("The repeated values from both arrays are:- ");
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
