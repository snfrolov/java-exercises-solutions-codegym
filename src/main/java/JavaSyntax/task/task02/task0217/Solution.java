package JavaSyntax.task.task02.task0217;

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int value = min(a,b);
        if (min(c,d) <= value) {
            value = min(c,d);
        }
        return value;
    }

    public static int min(int a, int b) {
        int value = 0;
        if (a < b) {
            value = a;
        } else value = b;
        return value;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}