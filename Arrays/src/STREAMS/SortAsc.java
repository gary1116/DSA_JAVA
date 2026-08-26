package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortAsc {

    public static List<Integer> sortAsc(List<Integer> list){
        List<Integer> temp= list.stream().sorted().toList();
        return temp;
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
        List<Integer>temp=sortAsc(list);
        System.out.println("show me the unique values:- ");
        temp.forEach(i->System.out.print(i+ " "));
    }
}
