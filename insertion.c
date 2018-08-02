#include<stdio.h>
int i,temp,key,length,a[20];
void main(){
int b=10;
printf("%d",b);


printf(" no of elements");
scanf("%d",&length);
for(i=0;i<length;i++){
scanf("%d",&a[i]);
}
for(i=0;i<length;i++){
key=i;
while(a[key]>a[key+1] && key>=0 && key<4){
temp=a[key+1];
a[key+1]=a[key];
a[key]=temp;
key=key-1;
}
}

printf("the sorted array is");
for(i=0;i<length;i++){
printf("%d",a[i]);
}
}


