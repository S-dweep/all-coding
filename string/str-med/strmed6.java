// longest palindrome substring (without dp)
// Time complexity: O(n^2)
// Space complexity: O(1)

import java.util.*;
class strmed6 {
    public static String longestPalindrome(String s) {
        int start=0;
        int maxlen=1;
        int n=s.length();
        int left=-1, right=-1;
        for(int i=1;i<n;i++){
            // even palindrome
            left=i-1;
            right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if((right-left+1)>maxlen){
                    maxlen=right-left+1;
                    start=left;
                }
                left--;
                right++;
            }
            // odd palindrome
            left=i-1;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if((right-left+1)>maxlen){
                    maxlen=right-left+1;
                    start=left;
                }
                left--;
                right++;
            }
        } return s.substring(start,start+maxlen);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(longestPalindrome(s));       
        sc.close();
    }   
}