import java.util.Arrays;

public class Fib {
    public static void main(String[] args) {
        int n = 7;
        int[] resultfor = calculateFibonacciNumberByFor(n);
        int[] resultwhile = calculateFibonacciNumberByWhile(n);
        int[] resultdowhile = calculateFibonacciNumberByDoWhile(n);
        System.out.println(Arrays.toString(resultfor));
        System.out.println(Arrays.toString(resultwhile));
        System.out.println(Arrays.toString(resultdowhile));
    }

    public static int[] calculateFibonacciNumberByFor(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static int[] calculateFibonacciNumberByWhile(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int i = 2;
        while (i <= n) {
            arr[i] = arr[i - 1] + arr[i - 2];
            i++;
        }
        return arr;
    }

    public static int[] calculateFibonacciNumberByDoWhile(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int i = 2;
        do {
            arr[i] = arr[i - 1] + arr[i - 2];
            i++;
        } while (i <= n);
        return arr;
    }
}
