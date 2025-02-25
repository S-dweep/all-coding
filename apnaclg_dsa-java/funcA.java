import java.util.*;
class funcA{
    public static void printName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        funcA.printName(name);
    }
}