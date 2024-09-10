#include<stdio.h>
int myarr(int arr[],int length,int find_num);
int main(){
    int arr1[100]={3,2,5,6,7,3,6,2,6,3,6,7,8,5,2,6,6};
    int arr2[100]={3,4,5,6,7,8,9,10,1,5,4,4,4,4,5,6,6,6,7,5,8};
    int count1 = myarr(arr1,17,7);
    int count2 = myarr(arr2,21,8);
    printf("The first answer is: %d\n",count1);
    printf("The second asnwer is: %d\n",count2);

    return 0;
}
int myarr(int arr[],int length,int find_num){
    int count = 0;
    for(int i=0;i<length;i++){
        if(find_num==arr[i]){
            count++;
        }
    }


return count ;
}
