import java.util.*;
class funchw2{
    public static void isPrime(int n){
        if(n%2==0) System.out.println("even");
        else System.out.println("odd");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPrime(n);
    }
}