package core;
public class Prime{
    
    boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int i = 2; i<num; i++){
            if (num%i==0) return false;
        }
        return true;
    }
    
    // static void Prime(int max){
    //     for (int i = 0; i<=max; i++){
    //         if(new Prime().isPrime(i)){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }
    
    public static void main(String[] args){
        for(int i = 0; i<=100; i++){
            if(new Prime().isPrime(i)){
                System.out.print(i+" ");
            }
        }
        // OR
        // Prime(29);
    }
}