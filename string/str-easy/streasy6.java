// check if one string is rotation of another string
// Time complexity: O(n)
// Space complexity: O(1)

import java.util.*;
class streasy6 {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String temp=s+s;
        if(temp.contains(goal)) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(rotateString(s,t));
        sc.close();
    }   
}