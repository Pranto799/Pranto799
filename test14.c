#include<stdio.h>
int main(){
    int n=5;
    //upper half
    for(int i=1;i<=n;i++){
            //space
            for(int j=n;j>=i;j--){
                printf(" ");
            }
            for(int j=1;j<=i;j++){
                printf("*");
            }
            for(int j=2;j<=i;j++){
                printf("*");
            }
    printf("\n");
    }
    //lower half
     for(int i=n-1;i>=1;i--){
            //space
            for(int j=1;j<=n-i+1;j++){
                printf(" ");
            }
            for(int j=1;j<=i;j++){
                printf("*");
            }
            for(int j=2;j<=i;j++){
                printf("*");
            }
        printf("\n");
    }


    return 0;
}
