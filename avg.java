
//q1) take 3 numbers from the user and calculate avg of that 3 numbers.

import java.util.*;

public class avg {

    public static int avgOfThreeNums(int num1, int num2, int num3) {
        int avg = (num1 + num2 + num3) / 3;
        return avg;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number:");
        int num3 = sc.nextInt();
        int avg = avgOfThreeNums(num1, num2, num3);
        System.out.print("Avg of given numbers is:" + avg);

    }

}
