import java.util.HashMap;

public class FibonacciDP {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n == 0) return 0;
        if (n == 1) return 1;
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}