package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GreaterTen {

    public static List<Integer> greaterThanten(List<Integer> list){
        List<Integer> temp=list.stream()
                .filter(i->i>10)
                .toList();
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
        List<Integer>temp=greaterThanten(list);
        System.out.println("show me the even values:- ");
        temp.forEach(i->System.out.print(i+ " "));
    }
}
