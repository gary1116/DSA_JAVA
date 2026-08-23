package EASY;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Largest {

    public static int checkLargest(int []arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int checkSecondLargest(int arr[]){
       int largest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;
       for(int num:arr){
           if(num>largest){
               secondLargest=largest;
               largest=num;

           }else if(num>secondLargest && num!=largest){
               secondLargest=num;
           }
       }
       return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int largest=checkLargest(arr);
        int secondLargest=checkSecondLargest(arr);
        System.out.println("the largest element is "+largest);
        System.out.println("The second largest element is:- "+secondLargest);

    }

}
