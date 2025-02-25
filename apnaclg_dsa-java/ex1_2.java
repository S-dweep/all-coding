import java.util.*;
class ex1_2{
    public static void oddsum(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        } System.out.println("sum = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oddsum(n);
    }
}