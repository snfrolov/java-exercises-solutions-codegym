package JavaSyntax.task.task01.task0129;

public class Solution {
    public static void main(String[] args) {
        printCircleCircumference(5);
    }

    public static void printCircleCircumference(int radius) {
        double pi = 3.14;
        double C = 2 * pi * radius;
        System.out.println(C);
    }
}