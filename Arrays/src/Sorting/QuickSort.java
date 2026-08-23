package Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class QuickSort {

   public static void quickSort(int arr[],int low, int high){
       if(low<=high){
           int partition=partitionIndex(arr, low,high);
           quickSort(arr,low,partition-1);
           quickSort(arr,partition+1,high);
       }
   }
   public static int partitionIndex(int arr[],int low,int high){
       int pivot =arr[high];
       int i=low-1;

       for(int j=low;j<high;j++){
           if(arr[j]<=pivot){
               i++;
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
       }
       int temp=arr[i+1];
       arr[i+1]=arr[high];
       arr[high]=temp;
       return i+1;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array:- ");
        int len =sc.nextInt();

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        quickSort(arr,0,len-1);

        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
    }
}
