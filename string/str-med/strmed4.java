// string to integer (atoi)
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
class strmed4 {
    public static int myAtoi(String s) {
        if(s==null||s.length()==0) return 0;
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1;
        if(s.charAt(0)=='-') sign=-1;
        long res=0;
        int i=(s.charAt(0)=='+'||s.charAt(0)=='-')?1:0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)) res=(res*10)+(ch-'0');
            else break;
            if(sign==-1 && -1*res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign==1 && res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        } return (int)(res*sign);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(myAtoi(s));        
        sc.close();
    }   
}