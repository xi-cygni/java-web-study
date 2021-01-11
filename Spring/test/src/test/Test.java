package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Test {

    public static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) return true;
        
        word = word.substring(1, word.length()-1);
        return isPalindrome(word);
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String result = isPalindrome(A) ? "Yes" : "No";
        System.out.println(result);
    }
}
