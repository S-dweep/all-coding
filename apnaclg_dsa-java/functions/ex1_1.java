import java.util.*;
class ex1_1{
    public static void avg(int n1, int n2, int n3){
        System.out.println("avg: "+(n1+n2+n3)/3);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        avg(num1,num2,num3);
    }
}