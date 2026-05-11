import java.util.Locale;
import java.util.Scanner;


//approach 1 : brute force

/*public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String reversed="";
        for(int i=0;i<str.length();i++){
            reversed = str.charAt(i) + reversed;
        }
        System.out.println("Enter a reversed  : "+ reversed);
        if(str.equals(reversed)){
            System.out.println("Given string is Palindrome : "+ reversed);
        }
        else{
            System.out.println("Given string is not Palindrome : "+ reversed);
        }

    }
}*/



//two pointer approach

/*
public class Palindrome {
    public static boolean checkPalindrome(String s){
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str= sc.nextLine();
        if(checkPalindrome(str)){
            System.out.println("Palindrome : " );
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
*/



// recursion

public class Palindrome {

    public static boolean checkPalindrome(int i, int j, String str){
        if(i>=j)return true;
        if(str.charAt(i)!=str.charAt(j))return false;
        return checkPalindrome(i+1,j-1,str);
    }

    public static void main(String[] args){

        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        if(checkPalindrome(0, str.length() - 1, str)) {
            System.out.println("Given string is Palindrome");
        }
        else {
            System.out.println("Given string is not Palindrome");
        }
    }

}

