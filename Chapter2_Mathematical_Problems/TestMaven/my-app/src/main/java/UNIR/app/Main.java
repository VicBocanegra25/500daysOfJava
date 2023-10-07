import Statistics.CalcSumAndCountAllNumbersDivBy_2_Or_7;
import Statistics.Result;

public class Main {
    public static void main(String[] args) {
        // Using the class CalcSumAndCountAllNumbersDivBy_2_Or_7 to find the sum, and the count of numbers divisible by 2 or by 7 from 1 to 15
        CalcSumAndCountAllNumbersDivBy_2_Or_7 statistics = new CalcSumAndCountAllNumbersDivBy_2_Or_7();
        statistics.calcSumAndCountAllNumbersDivBy_2_Or_7(15);

        // This time we use our class Result to store a tuple of the sum, and the length of the list
        Result result = new Result(0, 0);
        result = statistics.calcSumAndCountAllNumbersDivBy_2_Or_7_Tuple(15);

        // Printing the sum, and the length of the list
        System.out.println("Length: " + result.getLength() + " Sum: " + result.getSum());
    }
}