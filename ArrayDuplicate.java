
import java.util.Arrays;
public class ArrayDuplicate {
  public static void main (String[] args) {
  String[] s = {"Первый", "Второй", "Третий" , "Первый", "Четвертый", "Первый"};
    //System.out.println(Arrays.toString(s));
    for (int i = s.length -1; i >= 0; i--) {
      for (int j = 0; j < s.length -1; j++) {
        if (s[i] != s[j+1]) {
        String temp = s[j];
          s[j] = s[j+1];
          s[j+1] = temp;
        }
      }
    }


      System.out.println(Arrays.toString(Arrays.copyOf(s,3)));
      System.out.println(Arrays.toString(s));
 } 

} 
