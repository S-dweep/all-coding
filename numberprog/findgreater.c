// Find the next greater number with the same set of digits
// Time complexity: O(n)
// Space complexity: O(n)
// n is the number of digits in the number
// Input: 1234
// Output: 1243
#include<stdio.h>
void swap(int *digits, int i, int index){
    int temp=digits[i];
    digits[i]=digits[index];
    digits[index]=temp;
}
void reverse(int *digits, int start, int end){
    while(start<end){
        swap(digits,start,end);
        start++;
        end--;
    }
}
int main(){
    int num, num1, d=0, index=-1, result=0;
    printf("Enter a number: ");
    scanf("%d", &num);
    num1=num;
    int digits[100];
    while(num1!=0){
        digits[d++]=num1%10;
        num1/=10;
    }
    for(int i=0;i<d-1;i++){
        if(digits[i]>digits[i+1]){
            index=i+1;
            break;
        }
    }
    for(int i=0;i<index;i++){
        if(digits[i]>digits[index]){
            swap(digits,i,index);
            break;
        }
    }
    reverse(digits,0,index-1);
    reverse(digits,0,d-1);
    for(int i=0;i<d;i++){
        result=(result*10)+digits[i];
    }
    if(index==-1){
        printf("No greater number possible\n");       
    }
    else{
        printf("The next greater number is: %d\n", result);
    }
    return 0;
}