import java.util.Scanner;
public class Main {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner ak= new Scanner(System.in );

        // Get values from user.
        System.out.print(" Enter base number = " );
        int base = ak.nextInt();

        System.out.print(" Enter exponent number = " );
        int exponent = ak.nextInt();

        int result = power(base, exponent); // Method is called and assinged to result.
        System.out.println("Result is = " + result);
    }


}