#include<stdio.h>
#include<stdlib.h>
char* removeOuterParentheses(char* s) 
{
    char *result=(char*)malloc(10000000*sizeof(char));
    int c=0,k=0,i,j;
    for(i=0;s[i]!='\0';i++);
    for(j=0;j<=i;j++)
    {
        if(s[j]=='(')
        {
            if(c>0)
            {
                result[k]=s[j];
                k++;
            }
            c++;
        }
        else
        {
            c--;
            if(c>0)
            {
                result[k]=s[j];
                k++;
            }
        }
    }
    result[k]='\0';
    return result;
}
int main()
{
    char *s=(char*)malloc(10000000*sizeof(char));
    scanf("%s",s);
    char *result=removeOuterParentheses(s);
    printf("%s",result);
    free(result);
    return 0;
}