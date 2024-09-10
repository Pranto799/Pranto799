#include<stdio.h>
int main(){
    int n=5;
    //upper half
    for(int i=1;i<=n;i++){
        //first part
        for(int j=1;j<=i;j++){
            printf("*");
        }
        //space
        int space=2*(n-i);
        for(int j=1;j<=space;j++){
            printf(" ");
        }
        //2nd part
        for(int j=1;j<=i;j++){
        printf("*");
    }
    printf("\n");
    }

    //lower half
     for(int i=n;i>=1;i--){
        //first part
        for(int j=1;j<=i;j++){
            printf("*");
        }
        //space
        int space=2*(n-i);
        for(int j=1;j<=space;j++){
            printf(" ");
        }
        //2nd part
        for(int j=1;j<=i;j++){
        printf("*");
    }
    printf("\n");
    }

    return 0;
}
