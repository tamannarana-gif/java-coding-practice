//iterative approch

//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if ( n==0 || n==1 ) {
//            System.out.print("Factorial of n is : " + 1 );
//            return;
//        }
//        int result = 1;
//        for ( int i = 2 ; i <= n ; i++ ) {
//            result *= i ;
//        }
//        System.out.print("Factorial of " + n + " is : " + result) ;
//    }
//}


//recursive approch

//import java.util.Scanner;
//
//public class Factorial {
//
//    static int Findfactorial(int n ){
//        if(n==0 || n==1) return 1;
//        return n*Findfactorial(n-1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if ( n==0 || n==1 ) {
//            System.out.print("Factorial of n is : " + 1 );
//            return;
//        }
//
//        System.out.print("Factorial of " + n + " is : " + Findfactorial( n )) ;
//    }
//}




//one line approch


//import java.util.Scanner;
//
//public class Main {
//
//    static int Findfactorial(int n ){
//        return (n==0 || n==1) ? 1 : n*Findfactorial(n-1) ;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if ( n==0 || n==1 ) {
//            System.out.print("Factorial of n is : " + 1 );
//            return;
//        }
//
//        System.out.print("Factorial of " + n + " is : " + Findfactorial( n )) ;
//    }
//}



//BigInteger


import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ( n==0 || n==1 ) {
            System.out.print("Factorial of n is : " + 1 );
            return;
        }
        BigInteger result = BigInteger.ONE ;
        for ( int i = 2 ; i <= n ; i++ ){
            result = result.multiply(BigInteger.valueOf(i)) ;
        }

        System.out.print("Factorial of " + n + " is : " + result) ;
    }
}





