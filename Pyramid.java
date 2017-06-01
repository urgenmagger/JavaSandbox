//out if 2 - 
//-^-
//^^^

public class Pyramid {
  public static void main (String[] args) {
    StringBuilder sb = new StringBuilder(); 
   // String newLine = System.getProperty("line.separator");
    int h = 2;
    int w = (h + h) - 1;
    for (int i = 1; i <= h; i++){
      for (int j = 1; j <= w; j++){
        //draw the left
          if ((j + i) <= h && j < h) {
             sb.append("-");
          } else if ((j + i) > h && j < h) {
             sb.append("^");
          }
          //draw the right
          if ((j - i) >= h && j > h) {
             sb.append("-");
          } else if ((j - i) < h && j > h) {
             sb.append("^");
          }
          //draw the center
           if (j == h) {
             sb.append("^");
          }
      }
          // sb.append(newLine);
             sb.append(System.getProperty("line.separator"));
    }
    System.out.println(sb.toString());
  }
}
