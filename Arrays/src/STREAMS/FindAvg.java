package STREAMS;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindAvg {

    public static int findingAvg(int []arr){
        return (int) Arrays.stream(arr).average().orElse(0.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("mention the length of array");
        int len= sc.nextInt();

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

       int avg= findingAvg(arr);
       System.out.println(avg);
    }
}
