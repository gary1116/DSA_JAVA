/*
Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.

For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.

For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.

Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.



Example 1:

Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
Example 2:

Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3
* */

import java.util.HashSet;
import java.util.Scanner;

public class UniqueEmail {

    public static int uniqueMail(String[] arr){
        HashSet<String> set= new HashSet<>();

        for(int i=0;i<arr.length;i++){

            String[] temp= arr[i].split("@");

            String name=temp[0];
            String domain=temp[1];

            int plusIndex=name.indexOf("+");

            if(plusIndex==-1){
                name=name.replaceAll(".","");
            }else{
                name=name.substring(0,plusIndex);
                name=name.replaceAll(".","");
            }

            String email=name+"@"+domain;
            set.add(email);

        }

        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Email id:- ");

        int len=sc.nextInt();

        String [] emails =new String[len];
        System.out.println("Now enter the emailid:- ");

        for(int i=0;i<len;i++){
            emails[i]=sc.next();
        }

        int result = uniqueMail(emails);
        System.out.println("the unique set of emails where email will be received is:- "+ result);
    }
}
