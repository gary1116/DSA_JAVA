import java.util.Scanner;

public class PalindromeString {

    private static boolean ifStringPalindrome(String str) {

        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String you want to check if it is a palindrome or not:- ");
        String str = sc.nextLine();

        boolean isPalindrome = ifStringPalindrome(str);
        System.out.print("is String "+str+" a palindrome?:- " + isPalindrome);

    }


}
