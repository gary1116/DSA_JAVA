package Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class InsertionSort {
    public static int [] insertionSort(int [] arr){


        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }



        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers you want to Sort:-");
        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        insertionSort(arr);
        Arrays.stream(arr)
                .forEach(i->System.out.print(i+" "));

    }
}
