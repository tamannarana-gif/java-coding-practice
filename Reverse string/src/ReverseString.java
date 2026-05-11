import java.util.*;   //import this for using list

public class ReverseString {
    public static void main(String[] args){
        String str="annamaT";

//        approach : 1 { loop : manual, provide complete control over the reversal process }

        /* String reversed="";
        for(int i=0;i<str.length();i++){
            reversed= str.charAt(i) + reversed;
        }
        System.out.println("reversed String : " + reversed);*/



//        approach : 2 { using StringBuilder.reversal() : quick(reverse content in place than manual looping), efficient, not thread safe }

        /*StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("reversed String : " +sb);*/



//        appraoch : 3 {using character array : working with individual character and manual control}
//        arr length=arr.length
//        string length=str.length();
//        println() → new line
//        print() → same line

        /*char[] arr = str.toCharArray();
        for(int i=arr.length-1 ; i>=0 ; i-- ){
            System.out.print("reversed String : " +arr[i]);
        }*/



//        approach : 4 {using collection.reversal() : used when dealing with list and java collection }

        /*List<Character> list = new ArrayList<>();
        for(char c : str.toCharArray() ){
            list.add(c);
        }
        Collections.reverse(list);
        ListIterator it = list.listIterator();    //  listIterator has a cursor that sits between elements,not on an element,starting position is before first elements

        while(it.hasNext()){
            System.out.print("reversed String : " + it.next());  //it.next -> return the next element, move the cursor forward internally, dont need to to move it manually in java, in c++ it behaves like pointer ,in java it are save object
        }*/



//        approach : 5 {using StringBuffer.reverse() : similar to StringBuilder but thread-safe, synchronized, good choice for multithreding environment}

        /*StringBuffer sbf =new StringBuffer(str);
        sbf.reverse();
        System.out.print("reversed String : " +sbf);*/



//        approach : 6 { using a stack : when using stack in the algorithm}

       /* Stack<Character>st = new Stack<>();
        for(char c : str.toCharArray()){
            st.push(c);
        }
        String reversed="";
        while(!st.isEmpty()){
            reversed+=st.pop();
        }
        System.out.print("reversed String : " +reversed);*/



//        approach : 7 {using getBytes() : works at the byte level and  usefull for encoding or low level string manipulation }


    }
}
