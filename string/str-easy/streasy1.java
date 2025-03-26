// remove outermost paranthesis
// Time complexity: O(n)
// Space complexity: O(n)

import java.util.*;
class streasy1 {
    public static String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')') count--;
            if(count!=0) res.append(s.charAt(i));
            if(s.charAt(i)=='(') count++;
        } return res.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeOuterParentheses(s));
        sc.close();
    }   
}