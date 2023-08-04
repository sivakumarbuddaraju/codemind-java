import java.util.Scanner;
public class area
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     double  pi=3.14,r,a;
     r=sc.nextDouble();
     a=pi*r*r;
     System.out.format("%.2f",a);
 }
}