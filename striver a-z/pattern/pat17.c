#include<stdio.h>
void printp(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            printf(" ");
        }
        char ch='A';
        for(int j=0;j<2*i+1;j++)
        {
            printf("%c",ch);
            if(j<((2*i+1)/2))
            ch++;
            else
            ch--;
        }
        printf("\n");
    }
}
int main()
{
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++)
    {
        int n;
        scanf("%d",&n);
        printp(n);
    }
}