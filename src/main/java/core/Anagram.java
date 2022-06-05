package core;

public class Anagram {
    boolean isAnagram(String one, String two) {
        if (one.replaceAll("\\s", "").length() != two.replaceAll("\\s", "").length()) {
            return false;
        }
        int value = 0;
        for (int i = 0; i < one.length(); i++) {
            value += Math.pow(one.replaceAll("\\s", "").toLowerCase().charAt(i), 2);
            value -= Math.pow(two.replaceAll("\\s", "").toLowerCase().charAt(i), 2);
        }
        return value == 0;
    }
    
    public static void main(String[] args) {
    	String one = "Windows";
    	String two = "Dowswin";
    	System.out.print(new Anagram().isAnagram(one, two));
    }
}