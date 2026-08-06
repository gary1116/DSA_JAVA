import java.util.Scanner;

public class LeftRotateByD {

    public static int[] rotateD(int []arr,int d){

        int n=arr.length;
        d=d%n;
        int []temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int j=d;j<n;j++){
            arr[j-d]=arr[j];
        }
        for (int k=n-d;k<n;k++){
            arr[k]=temp[k-(n-d)];
        }

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
        System.out.println("Enter the D to how many times you want to rotate:- ");
        int d=sc.nextInt();
        int [] arr2 = rotateD(arr, d);

        System.out.print("Array after rotating it by"+d+" place: ");
        for (int x = 0; x < arr2.length; x++) {
            System.out.print(arr2[x] + " ");
        }
    }
}
