//iterative approach

/*import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        int prev2=1;
        int prev1=0;

        for(int i=0;i<n;i++){
            System.out.print(prev1+" ");
            int p3=prev1+prev2;
            prev1=prev2;
            prev2=p3;
        }
    }
}*/


//Recursion

import java.util.Scanner;

public class fibonacci {
    static int fib(int n){
        if(n<=1)return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        System.out.print("fibonacci series : ");
        for(int i=0;i<n;i++){
            System.out.print(fib(i) + " ");
            }
        }
    }
