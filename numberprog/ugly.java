import java.util.*;
class ugly{
    public static boolean isUgly(int n){
        if(n<=0) return false;
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isUgly(n)) System.out.println("ugly");
        else System.out.println("not ugly");
    }
}