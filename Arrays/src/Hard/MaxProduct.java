package Hard;

import java.util.Scanner;

public class MaxProduct {

    public static int subArrayMaxProduct(int [] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=i;j<arr.length;j++){
                product *=arr[j];
                max=Math.max(product,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array:-");
        int len= sc.nextInt();
        System.out.println("enter the values of array:-");
        int [] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int result= subArrayMaxProduct(arr);
        System.out.println("the max product from sub array from given array is :- "+result);

    }
}
