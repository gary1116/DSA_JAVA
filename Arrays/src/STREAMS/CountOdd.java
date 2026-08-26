package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOdd {
    public static int countOdd(List<Integer>list){
        return (int) list.stream().filter(i->i%2!=0)
                .count();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the value:-");
        List<Integer> list = IntStream.range(0, len)
                .map(i -> sc.nextInt())
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        int min = countOdd(list);
        System.out.println("The minimum number from array is:- " + min);
    }
}
