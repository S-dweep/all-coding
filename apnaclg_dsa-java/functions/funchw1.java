import java.util.*;
class funchw1{
    public static void isPrime(int n){
        int i;
        for(i=2;i<=n/2;i++){
            if(n%i==0) break;
        }
        if(n!=1 && i>n/2) System.out.println("prime");
        else System.out.println("not prime");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPrime(n);
    }
}