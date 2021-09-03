import java.util.*;
public class StrLen_Without_InBuiltFuntion {
    public static void main(String args[]) {
      String name="Computer";
      int len=0;
      for(char c:name.toCharArray()){
          len++;
      }
      System.out.println(len);
    }
}
