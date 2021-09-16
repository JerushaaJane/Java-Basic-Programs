//Adam numbers are 0, 1, 2, 3, 11, 12, 13, 21, 22, 31, 101, 102, 103, 111

public class PrimeAdamNumber {
    public static void main(String[] args) {
        int n=2;
        printResult(n);
      
    }
    static void printResult(int n){
        int count=0;
        System.out.println("Prime adam nos are: ");
        for(int i=0;i<=100;i++){
           if(checkAdam(i)==1){
               if(checkPrime(i)==1){
                   System.out.println(i+" ");
                   count++;
               }
           }
           
        }
        if(count==0){System.out.println("no prime adam numbers");}
        else{System.out.println("The no of prime adam nos are: "+count);}
    }
    
    static int checkAdam(int n){
        int a=FindSquare(n); //n=12,a=144
        int b=FindSquare(ReverseNumber(n)); //441
        if(a==ReverseNumber(b)){
            return 1;
        }
        else{
          return 0;  
        }
    
        
    }
    static int checkPrime(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){flag=1;break;}
        }
        if(flag==0){return 1;}
        else{return 0;}
    }
    static int FindSquare(int n){
        return (n*n);
    }
    static int ReverseNumber(int n){
      int r,sum=0;
      while(n>0){
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
      }
      return sum;
    }
}
