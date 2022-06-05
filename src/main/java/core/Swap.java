package core;

public class Swap{
    
    public static void main(String[] args){
        int one = 1;
        int two = 2;
        String abc = "ABC";
        String xyz = "XYZ";
        
        // one^=two^(two=one);
        // OR
        int temp = one;
        one = two;
        two = temp;
        System.out.println("one="+one+" two="+two);
        xyz=abc+xyz;
        abc=xyz.substring(abc.length());
        xyz=xyz.substring(0, xyz.length()-abc.length());
        System.out.println("abc="+abc+" xyz="+xyz);
    }
}