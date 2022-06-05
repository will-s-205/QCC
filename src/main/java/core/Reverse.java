package core;

public class Reverse{
    
    String reverseEachWord(String input){
        if(input==null||input.length()<2) return "";
        StringBuilder result = new StringBuilder();
        String arrOfStr[] = input.split(" ");
        for(int i = 0; i<arrOfStr.length; i++){
            result.append(" ");
            String word= arrOfStr[i];
            for(int j = word.length()-1; j>=0; j--){
                result.append(word.charAt(j));
            }
        }
        result.deleteCharAt(0);
        return result.toString();
    }
    
    String reverseWordsOrder(String input){
        if(input==null||input.length()<2) return"";
        StringBuilder result = new StringBuilder();
        String arrOfStr[]=input.split(" ");
        for(int i = arrOfStr.length-1; i>=0; i--){
            result.append(arrOfStr[i]+" ");
        }
        return result.toString();
    }
    
    String reverseString(String input){
        StringBuilder result = new StringBuilder();
        for(int i=input.length()-1; i>=0; i--){
            result.append(input.charAt(i));
        }
        return result.toString();
    }
    
    public static void main(String[] args){
        String input = "ABC xyz 123";
        System.out.println(input);
        System.out.println();
        System.out.println(new Reverse().reverseEachWord(input));
        System.out.println(new Reverse().reverseWordsOrder(input));
        System.out.println(new Reverse().reverseString(input));
    }
}