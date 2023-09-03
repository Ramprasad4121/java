import java.util.*;

public class Main {

  public static int productOfTwoNums(int num1, int num2) {
    int product = num1 * num2;
    return product;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter num2: ");
    int num2 = sc.nextInt();
    int product = productOfTwoNums(num1, num2);
    System.out.println("product of two nums is: " + product);

  }
}