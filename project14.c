#include<stdio.h>
int main(){
    int n=5;
    //first half
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            printf(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            printf("*");
        }
        printf("\n");
    }

    //lower half
    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=n-i+1;j++){
            printf(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            printf("*");
        }
        printf("\n");
    }




    return 0;
}
