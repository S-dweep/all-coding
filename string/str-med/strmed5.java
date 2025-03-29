// count substrings with k distinct characters
// Time complexity: O(n)
// Space complexity: O(n)

import java.util.*;
class strmed5 {
    public static int atMost(String s, int k) {
        int j=0;
        int count=0;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
            while(m.size()>k){
                char ch1=s.charAt(j);
                m.put(ch1,m.getOrDefault(ch1,0)-1);
                if(m.get(ch1)==0) m.remove(ch1);
                j++;
            }
            count+=i-j+1;
        } return count;
    }
    public static int countSubstr(String s, int k) {
        // your code here
        return atMost(s,k)-atMost(s,k-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(countSubstr(s,k));        
        sc.close();
    }   
}