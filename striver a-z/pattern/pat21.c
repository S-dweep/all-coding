#include<stdio.h>
void printp(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==0||i==n-1||j==0||j==n-1)
            printf("*");
            else
            printf(" ");
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