import java.util.Scanner;

public class ColdPuterScience
{
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        
        int integerCount = inputValue.nextInt();
        
        int count = 0;
        for(int i = 0; i < integerCount; i++)
        {
            int temperatureValues = inputValue.nextInt();
            if(temperatureValues < 0)
            {
                count++;
            }
        }

        System.out.println(count);


    }
}