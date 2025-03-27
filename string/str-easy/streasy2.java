// reverse words in a string
// Time complexity: O(n)
// Space complexity: O(n)

import java.util.*;
class streasy2 {
    public static String reverseWords(String s) {
        int n=s.length();
        StringBuilder res=new StringBuilder();
        StringBuilder temp=new StringBuilder(s);
        temp.reverse();
        for(int i=0;i<n;i++){
            StringBuilder word=new StringBuilder();
            while(i<n && temp.charAt(i)!=' '){
                word.append(temp.charAt(i));
                i++;
            }
            word.reverse();
            if(word.length()>0) res.append(" "+word); 
        } return res.substring(1).toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverseWords(s));
        sc.close();
    }   
}