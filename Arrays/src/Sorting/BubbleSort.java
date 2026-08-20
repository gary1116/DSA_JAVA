package Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BubbleSort {

    public static int [] bubbleSort(int [] arr){


       for(int i=arr.length-1;i>=0;i--){

           for(int j=1;j<arr.length;j++){
               if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }
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

        bubbleSort(arr);

        Arrays.stream(arr)
                .forEach(i->System.out.print(i+" "));

    }
}
