public class Armstrong {
    public static void main(String args[]) {
      int n=1634;
      int sum=0,r,temp;
      temp=n;
      while(n>0){
          r=n%10;
          sum=sum+(r*r*r*r);
          n=n/10;
      }
      if(temp==sum){System.out.println("Armstrong");}
      else{System.out.println("Non Armstrong");}
    }
}
