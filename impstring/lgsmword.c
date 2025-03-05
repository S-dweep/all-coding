#include<stdio.h>
int main(){
    char str[100], largest[100], smallest[100], temp[100];
    scanf("%[^\n]s",str);
    int i=0, j=0, minlen=100, maxlen=0, len=0;
    int start=0, end=0;
    while(str[i]!='\0'){
        if(str[i]==' ' || str[i+1]=='\0'){
            if(str[i+1]=='\0') end=i+1;
            else end=i;
            len=end-start;
            for(j=0;j<len;j++){
                temp[j]=str[j+start];
            }
            temp[len]='\0';
            if(len<minlen){
                minlen=len;
                for(j=0;j<=len;j++){
                    smallest[j]=temp[j];
                }
            }
            if(len>maxlen){
                maxlen=len;
                for(j=0;j<=len;j++){
                    largest[j]=temp[j];
                }
            }
            start=i+1;
        }
        i++;
    }
    printf("smallest word: %s",smallest);
    printf("\nlargest word: %s",largest);
}