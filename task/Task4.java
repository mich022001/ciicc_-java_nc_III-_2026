import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    String isPalindrome = "The input string is a palindrome";
    String notPalindrome = "The input string is not palindrome";

    System.out.print("Enter a word: ");
    String input = new Scanner(System.in).nextLine();
    boolean result = palindromeChecker(input);
    String output = result ? isPalindrome : notPalindrome;
    System.out.println(output);
  }

  static boolean palindromeChecker(String input) {
    StringBuilder sb = new StringBuilder(input);
    return sb.reverse().toString().equals(input);
  }
}
