import java.util.*;
class ex1_10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1=0, t2=1;
        System.out.print(t1+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.print(t2+" ");
                int t3=t1+t2;
                t1=t2;
                t2=t3;
            }
        }
    }
}