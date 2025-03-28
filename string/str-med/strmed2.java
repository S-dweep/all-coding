// maximum depth of nested parentheses
// Time complexity: O(n)
// Space complexity: O(1)

import java.util.*;
class strmed2 {
    public static int maxDepth(String s) {
        int count=0, maxdepth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                maxdepth=Math.max(maxdepth,count);
            }
            if(s.charAt(i)==')') count--;
        } return maxdepth;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(maxDepth(s));
        sc.close();
    }   
}