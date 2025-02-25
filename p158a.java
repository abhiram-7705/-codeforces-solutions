import java.util.Scanner;

public class p158a {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        k=k-1;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=arr[k]&&arr[i]!=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
