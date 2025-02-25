import java.util.*;
class ex1_4{
    public static float circum(int r){
        return (float)(2*3.14*r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        System.out.println("circumference: "+circum(radius));
    }
}