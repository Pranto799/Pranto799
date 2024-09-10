#include<stdio.h>
int myarr(int arr[],int length);

int main(){
    int arr1[50]={5,6,8,3,9,7};
    int arr2[100]={33,4,22,5,2,5,7,33,9};
    int min1= myarr(arr1,6);
    int min2= myarr(arr2,9);
    printf("%d\n",min1);
    printf("%d\n",min2);


    return 0;
}
int myarr(int arr[],int length){
    int min=arr[0];
    for(int i=1;i<length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
}
