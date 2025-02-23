#include<stdio.h>
void printp(int n)
{
    for(int i=0;i<2*n-1;i++)
    {
        for(int j=0;j<2*n-1;j++)
        {
            int top = i;
            int left = j;
            int right = 2*n-2-j;
            int bottom = 2*n-2-i;
            printf(n-min(min(top,bottom),min(left,right)));
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