import java.util.*;
public class VowelOrConsonant {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in); 
      char x=sc.next().charAt(0);
      switch(x){
          case 'a':System.out.println("Vowel");break;
          case 'e':System.out.println("Vowel");break;
          case 'i':System.out.println("Vowel");break;
          case 'o':System.out.println("Vowel");break;
          case 'u':System.out.println("Vowel");break;
          case 'A':System.out.println("Vowel");break;
          case 'E':System.out.println("Vowel");break;
          case 'I':System.out.println("Vowel");break;
          case 'O':System.out.println("Vowel");break;
          case 'U':System.out.println("Vowel");break;
          default:System.out.println("Consonant");break;
                
      }
    }
}
