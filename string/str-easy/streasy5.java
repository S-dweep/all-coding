// isomorphic strings
// Time complexity: O(n)
// Space complexity: O(1)

import java.util.*;
class streasy5 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int str_s[]=new int[128];
        int str_t[]=new int[128];
        for(int i=0;i<s.length();i++){
            if(str_s[s.charAt(i)]!=str_t[t.charAt(i)]) return false;
            str_s[s.charAt(i)]=i+1;
            str_t[t.charAt(i)]=i+1;
        } return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(isIsomorphic(s,t));
        sc.close();
    }   
}