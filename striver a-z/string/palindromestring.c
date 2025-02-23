#include<stdio.h>
int palindrome(char *s, int n, int p)
{
    if(p>=n/2) return 1;
    if(s[p]!=s[n-p-1])
    return 0;
    return palindrome(s,n,p+1);
}
int main()
{
    int i;
    char s[1000];
    gets(s);
    for(i=0;s[i]!='\0';i++);
    if(palindrome(s,i,0)==1)
    printf("palindrome");
    else
    printf("not palindrome");
    return 0;
}