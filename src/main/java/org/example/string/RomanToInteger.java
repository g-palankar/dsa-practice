package org.example.string;

import java.util.Map;

public class RomanToInteger {
    public static int convertRomanStringToInteger(String s) {
        final Map<String, Integer> specials = Map.of(
                "IV", 4,
                "IX", 9,
                "XL", 40,
                "XC", 90,
                "CD", 400,
                "CM", 900
        );

        final Map<String, Integer> values = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );
        int currentIndex = 0;
        int result = 0;
        while (currentIndex < s.length()) {
            final String subString = s.substring(currentIndex, currentIndex + 2);
            if (specials.containsKey(subString)) {
                result += specials.get(subString);
                currentIndex += 2;
                continue;
            }
            String characterAt = s.substring(currentIndex, currentIndex + 1);
            int value = values.get(characterAt);
            result += value;
            currentIndex++;
        }
        return result;
    }

    public static void main(String[] args) {
        final int result = convertRomanStringToInteger("II");
        System.out.println(result);
    }

}
