import java.util.*;
public class AlternativePrime {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Alternative primes upto "+n+" are:");
      printResult(n);
      
    }
    static int checkPrime(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){flag=1;break;}
        }
        if(flag==0){return 1;}
        else{return 0;}
    }
    static void printResult(int n){
        int temp=2;
        for(int i=2;i<n-1;i++){
            if(checkPrime(i)==1){
                if(temp%2==0){
                    System.out.println(i);
                }
            }
        }
        temp++;
    }
}
