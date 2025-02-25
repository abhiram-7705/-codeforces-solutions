import java.util.*;

public class p1999d {
    static long[] v = new long[200001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        preprocess();
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(v[r] - v[l - 1] + (v[l] - v[l - 1]));
        }
    }

    static void preprocess() {
        for (int i = 1; i <= 200000; i++) {
            int count = 0, x = i;
            while (x > 0) {
                x /= 3;
                count++;
            }
            v[i] = v[i - 1] + count;
        }
    }
}
