import java.util.*;
class ex1_7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        int pos=0, neg=0, z=0;
        do { 
            System.out.println("enter number: ");
            int n=sc.nextInt();
            if(n>0) pos++;
            else if(n<0) neg++;
            else z++;
            System.out.println("enter 1 to continue or 0 to end");
            input=sc.nextInt();
        } while (input==1);
        System.out.println("positives: "+pos+" negatives: "+neg+" zeroes: "+z);
    }
}
