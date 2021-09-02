public class StringPalindrome {
    public static void main(String args[]) {
      String name="pop";
      String rev="";
      for(int i=name.length()-1;i>=0;i--){
          rev+=name.charAt(i);
      }
      if(name.equals(rev)){System.out.println("String Palindrome");}
      else{System.out.println("Non String Palindrome");}
    }
}
