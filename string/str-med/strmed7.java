// sum of beauty of all substrings
// Time complexity: O(n^2)
// Space complexity: O(1)

import java.util.*;
class strmed7 {
    public static int getMinCount(int arr[]) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(arr[i]!=0) mini=Math.min(mini,arr[i]);
        } return mini;
    }
    public static int getMaxCount(int arr[]) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            maxi=Math.max(maxi,arr[i]);
        } return maxi;
    }
    public static int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                sum+=(getMaxCount(freq)-getMinCount(freq));
            }
        } return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(beautySum(s));       
        sc.close();
    }   
}