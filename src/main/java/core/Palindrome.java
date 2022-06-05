package core;

public class Palindrome {
    
    boolean isPalindrome(String input){
        if(input==null||input.length()<2) return true;
        for(int i = 0; i<=input.length(); i++){
            if(input.charAt(i)<input.charAt(input.length()-1-i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        System.out.print(new Palindrome().isPalindrome("ABBA"));
    }
}