#include<stdio.h>
void printp(int n)
{
    int spaces = 2*n-2;
    for(int i=1;i<=2*n-1;i++)
    {
        int stars = i;
        if(i>n) stars=2*n-i;
        for(char j=1;j<=stars;j++)
        {
            printf("*");
        }
        for(char j=1;j<=spaces;j++)
        {
            printf(" ");
        }
        for(char j=1;j<=stars;j++)
        {
            printf("*");
        }
        if(i<n) spaces-=2;
        else spaces+=2;
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