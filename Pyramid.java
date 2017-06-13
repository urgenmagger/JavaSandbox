//out
//-^^^^-
//^^^^^^
//^^^^^^
public class Pyramid {
  public static void main (String[] args) {
    StringBuilder sb = new StringBuilder(); 
   // String newLine = System.getProperty("line.separator");
    int h = 3;
    int w = (h + h) - 1;
    for (int i = 1; i <= h; i++){
      for (int j = 1; j <= w; j++){
          if (j >= h - i && j <= h + i) {
             sb.append("^");
          } else {
             sb.append("-");
          }
          if (j == h) {
             sb.append("^");
          }
      }
             sb.append(System.getProperty("line.separator"));
    }
    System.out.println(sb.toString());
  }
}
