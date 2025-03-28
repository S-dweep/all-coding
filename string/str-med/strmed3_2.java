// int to roman
// Time Complexity: O(1)
// Space Complexity: O(1)

import java.util.*;
class strmed3_2 {
    public static String intToRoman(int num) {
        int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sym[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                res.append(sym[i]);
                num-=value[i];
            }
        } return res.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(intToRoman(num));        
        sc.close();
    }   
}