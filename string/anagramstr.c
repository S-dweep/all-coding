#include<stdio.h>
#include<stdbool.h>
bool isAnagram(char* s, char* t){
    int count[256]={0};
    for(int i=0;s[i]!='\0';i++){
        count[(int)s[i]]++;
    }
    for(int i=0;t[i]!='\0';i++){
        count[(int)t[i]]--;
    }
    for(int i=0;i<256;i++){
        if(count[i]!=0){
            return false;
        }
    }
    return true;
}
int main(){
    char s[1000],t[1000];
    scanf("%s",s);
    scanf("%s",t);
    if(isAnagram(s, t)){
        printf("true");
    } else{
        printf("false");
    }
    return 0;
}