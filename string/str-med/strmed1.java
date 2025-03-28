// sort characters by frequency
// Time Complexity: O(nlogn)
// Space Complexity: O(n)

import java.util.*;
class strmed1 {
    public static String frequencySort(String s) {
        StringBuilder res=new StringBuilder();
        Map<Character, Integer> m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        List<Character> ls=new ArrayList<>(m.keySet());
        ls.sort((ob1,ob2)->m.get(ob2)-m.get(ob1));
        for(char ch:ls){
            for(int i=0;i<m.get(ch);i++){
                res.append(ch);
            }
        } return res.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(frequencySort(s));
        sc.close();
    }   
}