#include<stdio.h>
void printp(int n)
{
    for(int i=0;i<n;i++)
    {
        for(char j='A'+n-1;j>='A'+n-i-1;j--)
        {
            printf("%c ",j);
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