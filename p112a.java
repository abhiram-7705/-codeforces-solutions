import java.util.Scanner;
public class p112a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next().toLowerCase();
        String b=scan.next().toLowerCase();
        if(a.equals(b))
        System.out.println("0");
        else
        {
            for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>b.charAt(i))
            {
                System.out.println("1");
                break;
            }
            else if(a.charAt(i)<b.charAt(i))
            {
                System.out.println("-1");
                break;
            }
        }
        }
    }
}
