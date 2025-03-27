// check if two strings are anagrams of each other
// Time complexity: O(n)
// Space complexity: O(1) (only 256 characters in the ASCII set)

import java.util.*;
class streasy7 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int n=s.length();
        int freq[]=new int[256];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            freq[t.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(freq[i]!=0) return false;
        } return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(isAnagram(s,t));
        sc.close();
    }   
}