package algorithm;

public class Fibonacci {

    // memorization
    private int[] memo = new int[100];

    public int get(int n) {
        if (n >= 100) {
            throw new IllegalStateException();
        }

        memo[0] = 1;
        memo[1] = 1;

        if (n < 2) {
            return memo[n];
        }

        if (memo[n] > 0) {
            // 이미 계산된 케이스라면 저장되어 있는 값 반환
            return memo[n];
        }

        memo[n] = get(n - 1) + get(n - 2);
        return memo[n];
    }
}
