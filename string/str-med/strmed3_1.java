// roman to int
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
class strmed3_1 {
    public static int romanToInt(String s) {
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int res=m.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(m.get(s.charAt(i))<m.get(s.charAt(i+1))) res-=m.get(s.charAt(i));
            else res+=m.get(s.charAt(i));
        } return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(romanToInt(s));
        sc.close();
    }   
}