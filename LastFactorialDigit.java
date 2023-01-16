import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int testCases = inputValue.nextInt();

        for(int i =0; i < testCases; i++)
        {
            int  factorialDigit = inputValue.nextInt();

            int factorialValue = 1;
            for(int j=2; j<=factorialDigit; j++)
            {
                factorialValue = factorialValue*j;
            }
            System.out.println(factorialValue%10);
        }
    }
}
