import java.util.*;
class ex1_9{
    public static int gcd(int n1, int n2){
        while(n1!=n2){
            if(n1>n2) n1=n1-n2;
            else n2=n2-n1;
        } return n2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("gcd: "+gcd(num1,num2));
    }
}