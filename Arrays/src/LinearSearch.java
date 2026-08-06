import java.util.Scanner;

public class LinearSearch {

    public static int searchIndex(int[] arr, int num){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                index=i;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:- ");
        int len=sc.nextInt();
        int [] arr=new int[len];
        System.out.println("Now Enter the numbers for array:- ");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search:- ");
        int num=sc.nextInt();
        int index = searchIndex(arr,num);

        System.out.print("the index is: "+index);

    }
}
