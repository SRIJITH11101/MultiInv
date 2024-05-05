import java.util.*;
public class FermatInv 
{
public static void main(String[]args)
{
int a=0,b=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
a=sc.nextInt();
double ans=0.0;
System.out.println("Enter the prime value");
b=sc.nextInt();
ans= Math.pow(a,b-2)%b;
System.out.println("Answer : "+ans);
}
}