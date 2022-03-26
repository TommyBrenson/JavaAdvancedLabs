package tpu.ru.labs.lab4;
import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.*;
import java.util.stream.Stream;
public class Main {
    public static void main(String [] args) throws Exception {
        // String testString = "2+14+322*1/2+4/142"; // equals 177
        int [] results;

        try (Stream <String> stream = Files.lines(Paths.get("src\\tpu\\ru\\labs\\lab4\\input.txt"))) {
            results = stream.mapToInt(n -> {
                try {
                    int tmp = calcComplex(n);
                    System.out.println(n + " = " + tmp);
                    return tmp;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }).toArray();
            System.out.println(Arrays.toString(results));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int calcComplex(String expression) throws Exception {
        expression = expression.replaceAll("\\s+", "");

        Pattern pattern = Pattern.compile("[-]?(\\d+)([-+/*](\\d+))*");
        Matcher matcher = pattern.matcher(expression);

        if (!matcher.matches()) throw new Exception("The wrong algebraic expression.");

        pattern = Pattern.compile("(\\d+)[/*](\\d+)");
        matcher = pattern.matcher(expression);

        String tmp = "";
        int res = 0;

        while(matcher.find()) {
            res = calcPrimitive(matcher.group());
            tmp = matcher.replaceFirst("" + res);
            matcher = pattern.matcher(tmp);
            // System.out.println(tmp);
        }

        pattern = Pattern.compile("[-]?(\\d+)[-+](\\d+)");
        matcher = pattern.matcher(tmp);

        while(matcher.find()) {
            res = calcPrimitive(matcher.group());
            tmp = matcher.replaceFirst("" + res);
            matcher = pattern.matcher(tmp);
            // System.out.println(tmp);
        }
        return res;
    }
    public static int calcPrimitive(String expression) throws Exception {
        expression = expression.replaceAll("\\s+", "");

        Pattern patternP = Pattern.compile("[-]?(\\d+)[/*+-](\\d+)");
        Matcher matcherP = patternP.matcher(expression);

        boolean isFirstNegative = (expression.charAt(0) == '-');

        if (isFirstNegative) expression = expression.substring(1);

        if (!matcherP.matches()) throw new Exception("Cannot recognize arithmetic primitive");

        int [] nums = Arrays.stream(expression.split("[+/*-]")).mapToInt(Integer::parseInt).toArray();

        if (isFirstNegative) nums[0] = -1*nums[0];

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
