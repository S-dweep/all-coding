#include<stdio.h>
void printp(int n)
{
    int start = 1;
    for(int i=0;i<n;i++)
    {
        if(i%2==0) start = 1;
        else start = 0;
        for(int j=0;j<=i;j++)
        {
            printf("%d ",start);
            start = 1 - start;
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