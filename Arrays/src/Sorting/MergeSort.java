package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MergeSort {

    public static void mergeSort(int [] arr, int low, int high){

        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merged(arr,low,mid,high);
    }

    public static void merged(int []arr,int low,int mid,int high){
        List<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left <=mid && right<=high){

            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;

            }else{
                list.add(arr[right++]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while (right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            arr[i] = list.get(i - low);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers you want to Sort:-");

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr)
                .forEach(i-> System.out.print(i+" "));

    }
}
