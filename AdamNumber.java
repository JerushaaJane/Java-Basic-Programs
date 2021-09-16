//Adam numbers are 0, 1, 2, 3, 11, 12, 13, 21, 22, 31, 101, 102, 103, 111

public class AdamNumber {
    public static void main(String[] args) {
        int n=;
        printResult(n);
      
    }
    static void printResult(int n){
        int a=FindSquare(n); //n=12,a=144
        int b=FindSquare(ReverseNumber(n)); //441
        if(a==ReverseNumber(b)){
            System.out.println("Adam Number");
        }
        else{
          System.out.println(" Non Adam Number");  
        }
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
