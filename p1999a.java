import java.util.Scanner;
public class p1999a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			int s=0;
			while(num>0)
			{
				s+=(num%10);
				num=num/10;
			}
			System.out.println(s);
		}
		
	}

}
