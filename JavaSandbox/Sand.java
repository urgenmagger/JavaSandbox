/*
 * out
x-x-x
-x-x-
x-x-x
-x-x-
*/
public class Sand {
  public static void main (String[] args) {
    StringBuilder sb = new StringBuilder(); 
    String newLine = System.getProperty("line.separator");
    for (int i = 0; i <= 3; i++){
      for (int j = 0; j <= 4; j++){
        if (i % 2 != 0 && j % 2 != 0) {
           sb.append("x");
        } else if (i % 2 != 0 && j % 2 == 0) {
           sb.append("-");
        } else if (i % 2 == 0 && j % 2 != 0) {
           sb.append("-");
        } else if (i % 2 == 0 && j % 2 == 0) {
           sb.append("x");
        }
      }
           sb.append(newLine);
    }
    System.out.println(sb.toString());
  }
}
