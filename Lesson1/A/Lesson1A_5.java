package Lesson1.A;

public class Lesson1A_5 {
    public static void main(String[] args) {
        int res = 0;
        for (String s : args) {
            res += Integer.parseInt(s);
        }
        System.out.println(res);

        res = 1;
        for (String arg : args) {
            res *= Integer.parseInt(arg);
        }
        System.out.println(res);
    }
}
