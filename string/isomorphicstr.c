#include<stdio.h>
#include<stdbool.h>
bool isIsomorphic(char *s, char *t){
    int stot[256]={0};
    int ttos[256]={0};
    int i;
    for(i=0;s[i]!='\0';i++){
        char s_ch=s[i];
        char t_ch=t[i];
        if(stot[(int)s_ch]==0 && ttos[(int)t_ch]==0){
            stot[(int)s_ch]=t_ch;
            ttos[(int)t_ch]=s_ch;
        }
        else if(stot[(int)s_ch]!=t_ch || ttos[(int)t_ch]!=s_ch){
            return false;
        }
    } return true;
}
int main(){
    char s[1000],t[1000];
    scanf("%s",s);
    scanf("%s",t);
    if(isIsomorphic(s, t))
    printf("true");
    else
    printf("false");
    return 0;
}