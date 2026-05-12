

//iterative approach

//import java.util.Scanner;
//class CheckPrimeNumber {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Given Number : ");
//        int n=sc.nextInt();
//        if(n<=1){
//            System.out.print(n + " is not Prime number ");
//            return;
//        }
//        for ( int i = 2 ; i < n ; i++ ){
//            if ( n % i ==0 ) {
//                System.out.print(n + " is not Prime number ");
//                return;
//            }
//        }
//        System.out.print(n + " is a Prime number ");
//        return;
//    }
//}



//recursive



import java.util.*;
import java.math.*;

class CheckPrimeTest {
    static boolean isPrime(long n) {
        BigInteger b = new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number : ");
        long n = sc.nextLong();
        if (n <= 1) {
            System.out.println(n + " is not Prime Number");
            return;
        }
        if (isPrime(n)) {
            System.out.println(n + " is Prime Number");
        } else {
            System.out.println(n + " is not Prime Number");
        }
    }
}