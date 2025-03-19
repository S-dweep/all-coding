#include<stdio.h>
#include<stdbool.h>
bool rotateString(char* s, char* goal) {
    int i,j;
    bool res;
    for(i=0;s[i]!='\0';i++);
    for(j=0;goal[j]!='\0';j++);
    if(i!=j){
        res=false;
    } else{ int count=0;
        for(int k=0;s[k]!='\0';k++){
                if(s[k]!=goal[k])
                count++;
            }
            if(count==0)
            res=true;
            else
            res=false;
        int c=j-1;
        while(res==false && c>0){
            for(int p=0;p<j-1;p++){
                goal[p]=goal[p]^goal[p+1];
                goal[p+1]=goal[p]^goal[p+1];
                goal[p]=goal[p]^goal[p+1];
            }
            printf("%s \n",goal);
            count=0;
            for(int k=0;s[k]!='\0';k++){
                if(s[k]!=goal[k])
                count++;
            }
            if(count==0)
            res=true;
            else
            res=false;
            c--;
        }
    }
    return res;
}
int main(){
    char s[1000],goal[1000];
    scanf("%s",s);
    scanf("%s",goal);
    rotateString(s, goal);
    bool res=rotateString(s, goal);
    if(res)
    printf("true");
    else
    printf("false");
}