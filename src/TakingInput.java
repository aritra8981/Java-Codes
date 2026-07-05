import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of first Number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the value of second Number: ");
        int secondNumber = input.nextInt();
        int ans = firstNumber + secondNumber;
        System.out.println("The answer is: " + ans);

        System.out.println("Enter any big integer: ");
        BigInteger bg = input.nextBigInteger();
        System.out.println("The Big Integer is: " + bg);

        System.out.println("Enter the value for flag:");
        boolean flag = input.nextBoolean();
        System.out.println("Enter the value for ShortVal: ");
        short shortVal = input.nextShort();
        System.out.println("Enter the value for floatVal: ");
        float floatVal = input.nextFloat();
        System.out.println("Enter your name: ");
        String name = input.next();

        input.nextLine();
        System.out.println("Enter your current designation in one line: ");
        String oneLine = input.nextLine();

        System.out.println("Flag is : " + flag);
        System.out.println("ShortVal is : " + shortVal);
        System.out.println("FloatVal is : " + floatVal);
        System.out.println("Name: " + name);
        System.out.println("oneLine: " + oneLine);


        input.close();
    }
}
