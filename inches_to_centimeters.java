import java.util.Scanner;
public class inches
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n,m;
        n=sc.nextInt();
        m=2.54*n;
        System.out.format("%.2f",m);
    }
}