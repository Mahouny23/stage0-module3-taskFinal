package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        while (number != 0)
        {
            int reminder = number % 10;
            number = number / 10;
            sum = sum + reminder;
        }
        System.out.println(sum);
    }
}
