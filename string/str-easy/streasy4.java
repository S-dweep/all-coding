// longest common prefix
// Time complexity: O(n)
// Space complexity: O(1)

import java.util.*;
class streasy4 {
    public static String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0) return "";
        StringBuilder res=new StringBuilder();
        Arrays.sort(strs);
        int m=strs[0].length();
        for(int i=0;i<m;i++){
            if(strs[0].charAt(i)!=strs[n-1].charAt(i)) break;
            res.append(strs[0].charAt(i));
        } return res.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++) s[i]=sc.next();
        System.out.println(longestCommonPrefix(s));
        sc.close();
    }   
}