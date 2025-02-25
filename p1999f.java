import java.util.*;

public class p1999f {
    static final long MOD = (long) 1e9 + 7;
    static final int MAXN = 200005;
    static long[] fact = new long[MAXN];

    static long mult(long a, long b) {
        return (a * b) % MOD;
    }


    static long add(long a, long b) {
        return (a + b) % MOD;
    }

    static long power(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }


    static long divide(long a, long b) {
        return mult(a, power(b, MOD - 2, MOD));
    }


    static long nCr(long n, long r) {
        if (n < r) return 0;
        return divide(fact[(int) n], mult(fact[(int) r], fact[(int) (n - r)]));
    }


    static void precomputeFactorials() {
        fact[0] = 1;
        for (int i = 1; i < MAXN; i++) {
            fact[i] = mult(fact[i - 1], i);
        }
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        precomputeFactorials();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long one = 0, zero = 0;
            for (int i : arr) {
                if (i == 1) one++;
                else zero++;
            }

            long ans = 0;
            for (long ones = (k / 2) + 1; ones <= k && ones <= one; ones++) {
                long zeros = k - ones;
                if (zeros <= zero) {
                    long a = nCr(one, ones);
                    long b = nCr(zero, zeros);
                    ans = add(ans, mult(a, b));
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}