#include<stdio.h>
char* longestCommonPrefix(char** strs, int strsSize) {
    if(strsSize==0) return "";
    if(strsSize==1) return strs[0];
    char *prefix=strs[0];
    int i;
    for(i=0;strs[0][i]!='\0';i++);
    for(int j=1;j<strsSize;j++){
        int k=0;
        while(k<i && strs[j][k]==prefix[k]){
            k++;
        }
        i=k;
        if(k==0) return "";
    }
    prefix[i]='\0';
    return prefix;
}
int main(){
    int n;
    scanf("%d",&n);
    char strs[n][1000];
    for(int i=0;i<n;i++){
        scanf("%s",strs[i]);
    }
    char *strsPtrs[n];
    for(int i=0;i<n;i++){
        strsPtrs[i]=strs[i];
    }
    char *res=longestCommonPrefix(strsPtrs,n);
    printf("%s",res);
    return 0;
}