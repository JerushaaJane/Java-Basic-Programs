import java.util.*;
public class ASCIIValueOfString {
    public static void main(String args[]) {
      String name="Computer";
      for(int i=0;i<name.length();i++){
          System.out.println((int)(name.charAt(i)));
      }
    }
}
