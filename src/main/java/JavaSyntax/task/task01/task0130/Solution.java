package JavaSyntax.task.task01.task0130;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        return (celsius * 9) / 5.0 + 32;
    }
}