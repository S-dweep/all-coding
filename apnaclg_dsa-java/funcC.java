import java.util.*;
public class funcC {
    public static int pro(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("product: "+pro(a,b));
    }
}
