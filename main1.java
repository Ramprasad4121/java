import java.util.*;

public class main1 {
    // find product of two numbers
    public static int productOfTwoNums(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {

        System.out.print("Enter num1 value:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter num2 value:");
        int num2 = sc.nextInt();
        int product = productOfTwoNums(num1, num2);
        System.out.println("Product of 2 nums: " + product);

    }
}