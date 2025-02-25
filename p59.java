import java.util.Scanner;

public class p59 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String inp=scan.nextLine();
        int c=0,s=0;
        for(int i=0;i<inp.length();i++)
        {
            if(Character.isUpperCase(inp.charAt(i)))
            {
                c++;
            }
            else
            s++;
        }
        if(c>s)
        {
            System.out.println(inp.toUpperCase());
        }
        else
        System.out.println(inp.toLowerCase());
    }
}
