import java.util.*;
class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}