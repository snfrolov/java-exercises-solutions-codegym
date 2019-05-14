package JavaSyntax.task.task02.task0216;

public class Solution {
    public static int min(int a, int b, int c) {
        int value = 0;
        if (a <= b && a <= c) {
            value = a;
        } else if (b <= a && b <= c) {
            value = b;
        } else if (c <= a && c <= b) {
            value = c;
        }
        return value;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}