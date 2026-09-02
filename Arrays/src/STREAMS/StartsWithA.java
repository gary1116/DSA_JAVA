package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StartsWithA {

    public static List<String> checkWhichStartsWithA(List<String> list){
        return list.stream().filter(word->word.toLowerCase().startsWith("a"))
                .toList();
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the len :-");
        int len=sc.nextInt();

        System.out.println("enter the words :-");


        List<String> list= IntStream.range(0,len)
                .mapToObj(i->sc.next())
                .collect(Collectors.toCollection(ArrayList::new));

        list=checkWhichStartsWithA(list);
        list.forEach(i->System.out.println(i));

    }
}
