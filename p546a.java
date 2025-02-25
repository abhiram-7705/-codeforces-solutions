import java.util.Scanner;
public class p546a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] n=new int[3];
        for(int i=0;i<3;i++)
        {
            n[i]=scan.nextInt();
        }
        int res=(n[0]*n[2]*(n[2]+1)/2)-n[1];
        if(res<=0)
        System.out.println(0);
        else
        System.out.println(res);
    }
}
