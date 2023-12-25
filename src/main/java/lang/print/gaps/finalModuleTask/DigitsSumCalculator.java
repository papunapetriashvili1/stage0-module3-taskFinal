package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number/1000);

        int reversedNumber = digit4  + digit3 + digit2 + digit1;

        System.out.println(reversedNumber);
    }
}
