import java.util.*;
class binarysub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long bin1=sc.nextInt();
        long bin2=sc.nextInt();
        int i=0, borrow=0;
        int diff[]=new int[100];
        while(bin1!=0 || bin2!=0){
            int b1=(int)bin1%10;
            int b2=(int)bin2%10;
            int sub=b1-b2-borrow;
            if(sub==0){
                diff[i++]=0;
                borrow=0;
            } else if(sub==1){
                diff[i++]=1;
                borrow=0;
            } else if(sub==-1){
                diff[i++]=1;
                borrow=1;
            } else if(sub==-2){
                diff[i++]=0;
                borrow=1;
            }
            bin1/=10;
            bin2/=10;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(diff[j]);
        }
        sc.close();
    }
}