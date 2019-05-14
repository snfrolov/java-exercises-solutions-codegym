package JavaSyntax.task.task03.task0303;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(70, 1));
        System.out.println(convertEurToUsd(50, 5));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}