
/*

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:

Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueChar {

    public static int uniqueLetter(String word){
        int[] frequency=new int[26];

        //counting occurrences
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);

            frequency[ch-'a']++;
        }

        for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if(frequency[ch-'a']==1){
            return i;
        }
      }
        return -1;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word which you want to find the unique character from:- ");

        String word =sc.next();
        int result = uniqueLetter(word);
        System.out.println("the unique set of letters in the word :- "+ word+" is:- "+result);
    }
}
