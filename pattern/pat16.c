#include<stdio.h>
void printp(int n)
{
    for(int i=0;i<n;i++)
    {
        char ch = 'A' + i;
        for(char j=0;j<=i;j++)
        {
            printf("%c ",ch);
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