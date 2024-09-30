package org.example.string;

public class Palindrome {
    public static boolean isPalindrome(int x){
        String numberString = Integer.toString(x);
        final int iterationEndIndex = ((int) Math.floor(numberString.length() / 2)) - 1;
        final int endIndex = numberString.length() - 1;
        for (int index = 0; index <= iterationEndIndex; index++) {
            if(numberString.charAt(index) != numberString.charAt(endIndex - index)){ return false;}
        }
        return true;
    }
}
