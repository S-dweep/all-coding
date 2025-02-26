import java.util.*;
class ex1_3{
    public static int greater(int n1, int n2){
        if(n1>n2) return n1;
        else return n2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("greater: "+greater(num1,num2));
    }
}