package array;

import java.util.Scanner;

public class bronze_5597 {
    public static void main(String[] args) {
        boolean[] students = new boolean[31];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 28; i++) {
            students[sc.nextInt()] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!students[i]) {
                System.out.println(i);
            }
        }
    }
}
