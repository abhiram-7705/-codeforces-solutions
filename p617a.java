import java.util.Scanner;
public class p617a {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int c=0,step=5;
        while(a>0)
        {
            if(a>=step)
            {
                c+=(a/step);
                a=a-step*(a/step);
            }
            step-=1;
        }
        System.out.println(c);
    }
}
