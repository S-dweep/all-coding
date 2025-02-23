#include<stdio.h>
void printp(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            printf(" ");
        }
        for(int j=0;j<2*i+1;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    for(int i=1;i<n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            printf(" ");
        }
        for(int j=1;j<=2*n-(2*i+1);j++)
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