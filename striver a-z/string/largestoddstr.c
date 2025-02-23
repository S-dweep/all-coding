#include<stdio.h>
#include<stdlib.h>
char *largeoddnum(char *num)
{
    int i,j;
    for(i=0;num[i]!='\0';i++);
    for(j=i-1;j>=0;j--)
    {
        if((num[j]-'0')%2==1)
        {
            num[j+1]='\0';
            return num;
        }
    }
    return "";
}
int main()
{
    char *num=(char*)malloc(10000*sizeof(char));
    scanf("%s",num);
    printf("%s",largeoddnum(num));
    return 0;
}