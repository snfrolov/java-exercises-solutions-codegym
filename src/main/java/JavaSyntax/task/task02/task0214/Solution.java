package JavaSyntax.task.task02.task0214;

public class Solution {
    public static int min(int a, int b) {
        int value = 0;
        if (a <= b) {
            value = a;
        } else value = b;
        return value;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}