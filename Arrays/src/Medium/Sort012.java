package Medium;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Sort012 {

//    public static int[] sorting012(int arr[]){
//        return Arrays.stream(arr).sorted().toArray();
//    }

    public static int[] sorting012(int arr[]){
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        for(int i=zero;i<zero+one;i++){
            arr[i]=1;
        }
        for(int i=zero+one;i<arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers you want to Sort:-");

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        arr=sorting012(arr);

        Arrays.stream(arr)
                .forEach(i->System.out.print(i+" "));

    }
}
