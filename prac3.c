#include<stdio.h>
#include<string.h>
#include<ctype.h>
void my_function(char *str);
int main(){
    char str1[]="abcdeABCDE";
    my_function(str1);

    return 0;
}
void my_function(char *str){
     int length = strlen(str);
    for(int i=0;i<length;i++){
        if(isupper(str[i]))
        str[i]=tolower(str[i]);
        else if(islower(str[i]))
        str[i]=toupper(str[i]);
    }
    printf("%s\n",str);

}
