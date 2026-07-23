public class Task2 {

  public static void main(String[] args) {
    byte var1 = 1;
    short var2 = 3;
    int var3= 0;
    float var4 = 2.0f;
    boolean var5;
    char var6 = 'h';
    char var7 = 'W';
    char var8 = 114;
    char var9 = 68;
    String word1 = "" + var6 + var2 + var1 + var1 + var3;
    String word2 = " " + var7 + var3 + var8 + var1 + var9;
    String varWord =  word1.toUpperCase().concat(word2.toLowerCase());
    var5 = word1.contains("h") ? true : false;
    String finalOutput = varWord + " " + var4 + " " + var5;

    System.out.println(finalOutput);
  }
}
