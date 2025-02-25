import java.util.Scanner;

public class p2010a {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
        int n=sc.nextInt();
        int c=0,s=0;
        for(int j=0;j<n;j++)
        {
            int b=sc.nextInt();
            if(c==0)
            {
                s+=b;
                c=1;
            }
            else
            {
                s-=b;
                c=0;
            }
        }
        System.out.println(s);
       } 
    }
}
