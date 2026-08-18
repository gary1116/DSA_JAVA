package basic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChceckPrime {
    public static boolean primeNum(int num){

        if(num<0){
            return false;
        }

        ArrayList<Integer> list= IntStream.rangeClosed(1,num)
                .filter(i->num%i==0)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        // another way
//        long value= IntStream.rangeClosed(1,num)
//                .filter(i->num%i==0)
//                .count();
//        which we can eventually return
//                return value==2;

        if(list.size()==2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number you want to check:-");
        int num=sc.nextInt();

        boolean prime=primeNum(num);
        System.out.println("is it prime? :- "+prime);
    }
}
