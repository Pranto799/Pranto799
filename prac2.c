#include<stdio.h>
int main(){
    int length;
    int fibn=0;
    int term1=0;
    int term2=1;

    do{
        printf("Enter length: ");
        scanf("%d",&length);
        if(length<3) printf("Error: length must be greater than 3\n");
    }while(length<3);

    printf("%d , %d , ",term1,term2);
    for(int i=2;i<length;i++){
       fibn = term1+ term2;
       printf("%d , ",fibn);
       term1 = term2;
       term2=fibn;
    }

    return 0;
}
