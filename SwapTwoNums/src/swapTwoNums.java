//Approach 1: Using a Temporary Variable

/*import java.util.Scanner;
public class swapTwoNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First number : ");
        int num1 = sc.nextInt();
        System.out.print("Second number : ");
        int num2 = sc.nextInt();
        //System.out.println();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1 after swapping : "+num1);
        System.out.print("num2 after swapping : "+num2);
    }
}*/

//Approach 2: Using Arithmetic (Sum and Difference)

import java.util.Scanner;
public class swapTwoNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First number : ");
        int num1 = sc.nextInt();
        System.out.print("Second number : ");
        int num2 = sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 after swapping : "+num1);
        System.out.print("num2 after swapping : "+num2);
    }
}

//Approach 3: Using Bitwise XOR Operator