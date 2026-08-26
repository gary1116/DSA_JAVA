package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountMax {

    public static int countMax(List<Integer> list){
        return list.stream().max(Integer::compare).get();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        List<Integer> list= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        int max=countMax(list);
        System.out.println("The maximum number from array is:- "+max);

    }
}
