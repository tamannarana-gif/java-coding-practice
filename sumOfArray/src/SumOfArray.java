//for loop
/*
public class SumOfArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("sum of array : "+sum);
    }
}
*/



//recursion
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static int findSum(int[] arr,int i){
        if(i==0)return arr[0];
        return arr[i]+findSum(arr,i-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=findSum(arr,n-1);
        System.out.println("sum of array : "+sum);

        int afterAdding=Arrays.stream(arr).sum();    //inbuild function.     approch : 3
        System.out.print(afterAdding+" is sum");
    }

}


//