
//for loop

/*
import java.util.Locale;
import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Given string : ");
        String str=sc.nextLine();

        str=str.toLowerCase();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                count++;
            }
        }
       System.out.print("Total Number of vowel : "+count);
    }
}
*/






// recursion
import java.util.Scanner;

public class CountVowel {

    public static int isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
            return 1;
        }
        return 0;

    }
    public static int CountVowel(String str,int i){
        if(i==0)return isVowel(str.charAt(0));
        return isVowel(str.charAt(i))+CountVowel(str,i-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Given string : ");
        String str=sc.nextLine();

        str=str.toLowerCase();
        int n=str.length();
        int count=CountVowel(str,n-1);
        System.out.print("Total Number of vowel : "+count);
    }
}




//Array list and contains method