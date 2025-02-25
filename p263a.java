import java.util.Scanner;

public class p263a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[5][5];
        int f1=0,f2=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=scan.nextInt();
                if(arr[i][j]==1)
                {
                    f1=i;
                    f2=j;
                }
            }
        }
        int c=0;
        while(f1!=2||f2!=2)
        {
            if(f1<2)
            {
                f1+=1;
                c++;
            }
            else if(f1>2)
            {
                f1-=1;
                c++;
            }
            if(f2<2)
            {
                f2+=1;
                c++;
            }
            else if(f2>2)
            {
                f2-=1;
                c++;
            }
        }
        System.out.println(c);
    }
}
