package org.example.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public static void main(String[] args) {
        String input = "12,34.56;67-";
        calculate(input);
    }

    public static double calculate(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Empty input string.");
        }
        String digit = String.valueOf(input.charAt(input.length() - 1));
        List<Double> doublesList = new ArrayList<>();
        Pattern pat = Pattern.compile("\\d+");
        Matcher matcher = pat.matcher(input);

        while (matcher.find()) {
            double num = Double.parseDouble(matcher.group());
            doublesList.add(num);
        }

        if (digit.equals("+") || doublesList.size() == 1) {
            return doublesList.stream().mapToDouble(Double::doubleValue).sum();
        } else if (digit.equals("-")) {
            double firstElement = doublesList.get(0);
            return (firstElement - doublesList.stream().skip(1).mapToDouble(Double::doubleValue).sum());
        } else {
            throw new IllegalArgumentException("You did somthing wrong");
        }
    }

}
