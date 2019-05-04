package Lesson1.A;

import java.util.Scanner;

public class Lesson1A_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int res = 0;
        int[] nums = new int[count];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int num : nums) {
            res += num;
        }

        System.out.println(res);
    }
}
