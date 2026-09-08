package STREAMS;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindSum {

    public static int findTotal(int[] arr){
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int n = sc.nextInt();
        int [] arr= IntStream.range(0,n)
                .map(i->sc.nextInt())
                .toArray();

        int sum= findTotal(arr);

        System.out.println("the sum of array is :- "+sum);


    }
}
