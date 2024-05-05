import java.util.*;
public class EulerInv {
  

    int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public int compeuler(int a){
        int c=0;
        for(int i=1;i<a;i++){
            if(gcd(a,i)==1){
                c++;
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the modulo number");
        int n=sc.nextInt();
        EulerInv e=new EulerInv();
        int ans = e.compeuler(n);
        Double inv = Math.pow(a, ans-1) % n;
        System.out.println("Inverse : "+inv);
    }
}
