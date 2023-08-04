import java.util.Scanner;
public class conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c,f;
        c=sc.nextInt();
        f=32+(c*1.8);
        System.out.format("%.2f",f);
    }
}