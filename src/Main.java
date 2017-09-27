import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        int factorial = 0;
        int count = 0;

        System.out.println("Enter an integer");
        userNum = scnr.nextInt();

        count = userNum;

        while (count > 0) {

            factorial = count * (count - 1);
            count = count - 1;

        }

        System.out.println("The factorial of " + userNum + " is " + factorial + ".");

    }
}
