package tpu.ru.labs.lab4;
import java.io.File;
import java.util.Arrays;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String [] args) throws Exception {
        String testString = "2+14+322*1/2+4/142"; // equals 177
//        String regExp = "(-?)((\\d+)(\\s)*[+/*-](\\s)*)*(\\d+)";
//        Pattern pattern = Pattern.compile(regExp);
        Pattern pattern = Pattern.compile("(\\d+)[/*](\\d+)");
        Matcher matcher = pattern.matcher(testString);
    }

    public static int calcPrimitive(String expression) throws Exception {
        expression = expression.replaceAll("\\s+", "");
        Pattern patternP = Pattern.compile("(\\d+)[/*+-](\\d+)");
        Matcher matcherP = patternP.matcher(expression);

        if (!matcherP.matches()) throw new Exception("Cannot recognize arithmetic primitive");

        int [] nums = Arrays.stream(expression.split("[+/*-]")).mapToInt(Integer::parseInt).toArray();
        switch (expression.replaceAll("\\d+", "")) {
            case "+":
                return nums[0] + nums[1];
            case "/":
                return nums[0] / nums[1];
            case "*":
                return nums[0] * nums[1];
            case "-":
                return nums[0] - nums[1];
        }
        return -1;
    }

}
