import java.util.Scanner;

//Input: n = 3
//Output: 10
//Explanation:
//Sum of first natural number: 1
//Sum of first and second natural number: 1 + 2 = 3
//Sum of first, second and third natural number = 1 + 2 + 3 = 6
//Sum of sum of first three natural number = 1 + 3 + 6 = 10
//
//Input: n = 2
//Output: 4
public class SumOfNnumbers {

    static int sumOfN(int n) {

        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                int currentsum=0;
                for(int j=0;j<=i;j++){
                    currentsum+=j;
                }
                sum+=currentsum;
            }
        } else {
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();

        int sum = sumOfN(n);
        System.out.print("the Sum is:- " + sum);

    }
}
