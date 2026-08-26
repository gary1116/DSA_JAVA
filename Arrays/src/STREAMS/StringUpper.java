package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringUpper {
    public static List<String> toUpperWord(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the value:-");
        List<String> list= IntStream.range(0,len)
                .mapToObj(i->sc.next())
                .collect(Collectors.toCollection(ArrayList::new));
        List<String>temp=toUpperWord(list);
        System.out.println("show me the unique values:- ");
        temp.forEach(i->System.out.print(i+ " "));
    }
}
