import java.util.Scanner;
public class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=(a+b)*0.5;
        System.out.format("%.4f",c);
    }
}