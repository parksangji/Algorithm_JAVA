package array;

import java.util.Scanner;

public class bronze_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int answer = 0;

        int[] inputs = new int[size];

        for (int i = 0; i < size; i++) {
            inputs[i] = sc.nextInt();
        }
        int compare = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (inputs[i] == compare) {
                answer ++ ;
            }
        }
        System.out.println(answer);
    }
}
