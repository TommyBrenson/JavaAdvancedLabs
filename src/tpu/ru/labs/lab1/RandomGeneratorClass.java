package tpu.ru.labs.lab1;
import java.lang.Math.*;
import java.nio.charset.Charset;
import java.util.Random;

public class RandomGeneratorClass {
    public static int getRandomNumber(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }

    public static String getRandomString (int length) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            alphabet = (Math.random() > 0.8) ? alphabet : alphabet.toLowerCase();
            sb.append(alphabet.charAt(getRandomNumber(0, alphabet.length() - 1)));
        }

        return sb.toString().trim();
    }
}
