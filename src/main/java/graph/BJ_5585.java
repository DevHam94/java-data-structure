package graph;

import java.util.Scanner;

public class BJ_5585 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pay = scanner.nextInt();

        int[] money = {500, 100, 50, 10, 5, 1};

        int total = 1000 - pay;
        int result = 0;

        for (int m : money) {
            if (total < m) continue;

            result += total / m;
            total -= total % m;
        }
    }
}
