import java.util.Scanner;

public class p791a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=0;
        while(a<=b)
        {
            c+=1;
            a*=3;
            b*=2;
        }
        System.out.println(c);
    }
}
