package core;

public class Palindrome2 {
    
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++; continue;}
            
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;continue;}
            
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;}
            
            i++;
            j--;    
        }
        
        return true;
    }
    
    public static void main(String[] args){
        System.out.print(new Palindrome2().isPalindrome("ABBA"));
    }
}