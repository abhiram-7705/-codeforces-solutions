import java.util.Scanner;

public class p1999e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ts = sc.nextInt(); 
        sc.nextLine(); 

        for (int x = 0; x < ts; x++) {
            String s = sc.nextLine();
            String t = sc.nextLine();

            StringBuilder res = new StringBuilder();
            int i, j = 0;

            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '?') {
                    if (j < t.length()) {
                        res.append(t.charAt(j));
                        j++;
                    } else {
                        res.append('a'); 
                    }
                } else if (j < t.length() && s.charAt(i) == t.charAt(j)) {
                    res.append(t.charAt(j));
                    j++;
                } else {
                    res.append(s.charAt(i));
                }
            }

            if (j == t.length()) {
                System.out.println("YES");
                System.out.println(res);
            } else {
                System.out.println("NO");
            }
        }

        sc.close();

    }
}
