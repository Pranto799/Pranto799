#include<stdio.h>
#include<string.h>
#include<ctype.h>
int my_fun(char str[]);

int main(){
    char str1[]="He is a good boy!";

    int ans1= my_fun(str1);
    printf("The answer is: %d\n",ans1);
    return 0;
}
int my_fun(char str[]){

 int count=0;
    for(int i=0;i<strlen(str);i++){
        switch (toupper(str[i])){
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            count++;

        }

    }
    return count;

}
