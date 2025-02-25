import java.util.Scanner;
public class p281a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1));
    }
}
