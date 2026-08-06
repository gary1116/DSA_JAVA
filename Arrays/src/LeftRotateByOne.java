import java.util.Scanner;

public class LeftRotateByOne {

    public static int [] rotateOne(int [] arr){
        int temp=arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];

        }
        arr[arr.length-1]=temp;

        return arr;
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
        int [] arr2 = rotateOne(arr);

        System.out.print("Array after rotating it by 1 place: ");
        for (int x = 0; x < arr2.length; x++) {
            System.out.print(arr2[x] + " ");
        }
    }
}
