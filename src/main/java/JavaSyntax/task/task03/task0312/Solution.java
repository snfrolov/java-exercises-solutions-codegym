package JavaSyntax.task.task03.task0312;

public class Solution {
    public static int convertToSeconds(int hour) {
        return hour * 60 * 60;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));
    }
}