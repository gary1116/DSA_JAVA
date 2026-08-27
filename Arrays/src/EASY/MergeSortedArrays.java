package EASY;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MergeSortedArrays {

    public static ArrayList<Integer> uniteSortedArrays(int [] arr1, int [] arr2){
        ArrayList<Integer> list=new ArrayList<>();

        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<=arr2[j]){
                list.add(arr1[i]);
                i++;
            }else{
                list.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            list.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            list.add(arr2[j]);
            j++;
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of first array:-");
        int len1=sc.nextInt();
        System.out.println("Enter the values of first array:-");
        int arr1[]= IntStream.range(0,len1)
                        .map(i->sc.nextInt())
                        .toArray();

        System.out.println("Enter the length of second array:-");
        int len2=sc.nextInt();
        System.out.println("Enter the values of second array:-");
        int arr2[]= IntStream.range(0,len2)
                .map(i->sc.nextInt())
                .toArray();
        ArrayList<Integer> list= uniteSortedArrays(arr1,arr2);
        System.out.println("The combined array is:-");
        list.forEach(i->System.out.print(i+" "));


    }
}
