import java.util.*;
class ex1_5{
    public static void vote(int age){
        if(age>18) System.out.println("eligible to vote");
        else System.out.println("ineligible to vote");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        vote(age);
    }
}