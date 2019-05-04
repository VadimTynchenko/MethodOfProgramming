package Lesson1.B;

public class Lesson1B_2 {
    public static void main(String[] args) {
        Input in = new Input();
        in.input();

        int min = in.x[0];
        int max = in.x[0];
        for (int i = 0; i < in.x.length - 1; i++) {
            if (in.x[i + 1] > max) max = in.x[i + 1];
            if (in.x[i + 1] < min) min = in.x[i + 1];
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
