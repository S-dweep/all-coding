#include<stdio.h>
#include<stdlib.h>
char* reverseWords(char* s) {
    char* rev=(char*)malloc(1000000*sizeof(char));
    int i,j,k;
    for(i=0;s[i]!='\0';i++);
    int count=i-1,p=0;
    for(j=i-1;j>=0;j--)
    {    
        if(s[j]==' ' && s[j+1]!=' ')
        {
            for(k=j+1;k<=count;k++)
            {
                rev[p]=s[k];   
                p++;
            }
            rev[p]=' ';
            p++;
        }
        if(s[j+1]==' ') 
        {
            count=j;
        }
    }
    for(k=0;k<=count;k++)
    {
        if(s[k]!=' ')
        {
            rev[p]=s[k];
            p++;
        }
    }      
    rev[p]='\0';
    for(i=0;rev[i]!='\0';i++);
    if(rev[i-1]==' '){
        rev[i-1]='\0';
    }
    if(rev[0]==' '){
        for(j=0;j<i-1;j++)
        {
            rev[j]=rev[j+1];
        }
        rev[j++]='\0';
    }
    return rev;
}
int main()
{
    char *s=(char*)malloc(1000000*sizeof(char));
    printf("Enter string: ");
    scanf("%[^\n]%*c",s);
    char *rev=reverseWords(s);
    printf("%s",rev);
    free(s);
    free(rev);
    return 0;
}