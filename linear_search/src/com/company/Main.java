package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("no of element");
        int length = input.nextInt();
        insert(length, a);
        display(length, a);
        search(length,a);

    }
    public static void insert(int length,int [] a) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            a[i] = input.nextInt();
        }
    }
    public static void search(int length,int [] a){
        int element;
        System.out.println("enter element to be searched");
        Scanner input = new Scanner(System.in);
        element=input.nextInt();
        for(int i=0;i<length;i++){
            if(a[i]==element){
                System.out.println("element found at position"+(i+1));
            }
        }
    }

    public static void display(int length,int [] a) {
        for (int i = 0; i < length; i++) {
            System.out.println(a[i]);
        }
    }
}

