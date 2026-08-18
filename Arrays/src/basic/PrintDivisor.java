package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class PrintDivisor {
    public static ArrayList<Integer> divisor(int num){
        ArrayList<Integer> list= IntStream.rangeClosed(1,num)
                .filter(i->num%i==0)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        return list;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number you want to check:-");
        int num=sc.nextInt();

        ArrayList<Integer> value=divisor(num);
        value.forEach(i->System.out.println(i));
    }


}
