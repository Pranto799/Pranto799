#include<stdio.h>
int my_fun(int n);
int main(){
    int n;
    while(1){
        printf("Enter number: ");
        scanf("%d",&n);
        if(n==0){
            break;
        }
        if(1==my_fun(n)){
            printf("%d is a prime number\n\n",n);
        }
        else {
            printf("%d is not a prime number\n\n",n);
        }
    }

    return 0;
}
int my_fun(int n){

    if(n<2){
        return 0;
    }
   for(int i=2;i<n;i++){
    if(n%i==0){
        return 0;
    }
   }
   return 1;
}

