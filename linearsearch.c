#include<stdio.h>
int i,element,length,a[20];
void insert();
void search();
void display();
void main(){
insert();
display();
search();
}


void insert(){
printf(" no of elements");
scanf("%d",&length);
for(i=0;i<length;i++){
scanf("%d",&a[i]);
}}

void search(){
int in;
printf("enter element to be searched");
scanf("%d",&element);
for(i=0;i<length;i++){
if (a[i]==element) {
printf("element found at %d",i+1);
}
else if(i==(length-1))
printf("element not found");
}
}


void display(){
printf("the array is");
for(i=0;i<length;i++){
printf("%d",a[i]);
}
}


