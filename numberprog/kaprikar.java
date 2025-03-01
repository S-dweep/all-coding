import java.util.*;
class kaprikar{
    public static boolean isKaprikar(int n){
        int digit=0, d=1, temp;
        int sq=n*n;
        temp=sq;
        while(temp>0){
            digit++;
            temp/=10;
        }
        temp=sq;
        for(int i=1;i<digit;i++){
            d*=10;
            int p1=temp/d;
            int p2=temp%d;
            if(p1>0 && p2>0 && (p1+p2)==n) return true;
        } return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isKaprikar(n)) System.out.println("kaprikar");
        else System.out.println("not kaprikar");
    }
}