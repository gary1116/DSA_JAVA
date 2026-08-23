package EASY;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicate {

    public static HashSet<Integer> duplicateRemoval(int arr[]){

        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        HashSet<Integer> set= duplicateRemoval(arr);

       set.stream()
               .forEach(i->System.out.print(i+ " "));
    }
}
