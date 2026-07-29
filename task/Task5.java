import java.util.Scanner;

public class Task5 {
  static final String EQUALS = "All numbers are equal";
  static final String HIGHEST = "The highest number value is: ";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter three integers separated by spaces: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    highestNumberChecker(num1, num2, num3);
    scanner.close();
  }

  static void highestNumberChecker(int num1, int num2, int num3) {
    if (num1 == num2 && num2 == num3) {
      System.out.println(EQUALS);
      return;
    }

    int highestNum = num1;

    if (num2 > highestNum) highestNum = num2;
    if (num3 > highestNum) highestNum = num3;

    System.out.println(HIGHEST + highestNum);
  }
}
