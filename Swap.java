import java.util.*;
public class Swap {
    public static void main(String args[]) {
      //Scanner sc=new Scanner(System.in); 
      int a=10,b=20,c=30;
      System.out.println("swap using third/temp variable : ");
      swaptemp(a,b);
      System.out.println("swap without using third/temp variable : ");
      swap(a,b);
      System.out.println("swap 3 nos without using third/temp variable : ");
      swapThree(a,b,c);
      
    }
    static void swaptemp(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b); //20 10
    }
    static void swap(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b); //20 10
    }
    static void swapThree(int a,int b,int c){
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println(a+" "+b+" "+c);  //30 10 20
    }
}
