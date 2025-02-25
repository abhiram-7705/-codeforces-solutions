import java.util.Scanner;

public class p977a {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i,r;
        for(i=0;i<k;i++)
        {
            if(n==0)
            {
                break;
            }
            r = n%10;
            if(r == 0)
            {
                n = n/10;
            }
            else
            {
                n = n-1;
            }
        }
        System.out.println(n);
    }
}
