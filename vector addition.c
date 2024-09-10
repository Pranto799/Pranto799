#include<stdio.h>
void my_fun(float v1[],float v2[],float r[],int length);
int main(){
    float V1[100]={3,5,6};
    float V2[100]={6,7,8};
    float result[100];
    my_fun(V1,V2,result,3);
    for(int i=0;i<3;i++){
        printf("result[%d]=%f\n",i,result[i]);
    }
    return 0;
}
void my_fun(float v1[],float v2[],float r[],int length){

    for(int i=0;i<length;i++){
        r[i]=v1[i]+v2[i];
    }

}
