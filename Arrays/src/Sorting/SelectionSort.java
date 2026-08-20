package Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SelectionSort {

    public static int [] selectionSort(int [] arr){


        for(int i=0;i<arr.length;i++){

            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the numbers you want to Sort:-");
        int [] arr = IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        selectionSort(arr);

        Arrays.stream(arr)
                .forEach(i->System.out.print(i+" "));

    }
}
