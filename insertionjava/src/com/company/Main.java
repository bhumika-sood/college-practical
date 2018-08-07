package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("no of element");
        int length = input.nextInt();
        insert(length, a);
        sort(length,a);
        display(length, a);
    }

    public static void insert(int length,int [] a) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            a[i] = input.nextInt();
        }
    }
    public static void sort(int length,int [] a){
        int key,temp;
        for(int j=0;j<=length;j++){
            key=j;
            while (key>=0 && a[key]>a[key+1] && key<(length-1)){
            temp=a[key+1];
            a[key+1]=a[key];
            a[key]=temp;
            key=key-1;
            }

        }
    }

   public static void display(int length,int [] a){
        for(int i=0; i<length; i++){
            System.out.println(a[i]);
        }
    }

}
