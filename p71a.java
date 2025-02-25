import java.util.Scanner;

public class p71a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            String s=sc.next();
            if(s.length()>10)
            System.out.println(s.charAt(0) + "" + (s.length() - 2) + s.charAt(s.length() - 1));
            else
            System.out.println(s);
        }
    }
}
