#include<stdio.h>
void printp(int n)
{
    for(int i=0;i<n;i++)
    {
        for(char j=0;j<n-i;j++)
        {
            printf("*");
        }
        for(char j=0;j<2*i;j++)
        {
            printf(" ");
        }
        for(char j=0;j<n-i;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    for(int i=0;i<n;i++)
    {
        for(char j=0;j<=i;j++)
        {
            printf("*");
        }
        for(char j=0;j<2*(n-i-1);j++)
        {
            printf(" ");
        }
        for(char j=0;j<=i;j++)
        {
            printf("*");
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