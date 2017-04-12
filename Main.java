//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String a1="." ;String b1="#";
        for (int i = 1; i <n ; i++) {
            a1=a1+".";b1=b1+"#";
        }
        System.out.println(a1+b1+a1);

        for (int j=0;j<n/2;j++) {
            String a2= "";String b2 = "#";String c2="";
            for (int i = 1; i <n-1; i++) {

                a2=a2+".";b2=b2+".";
                if(i==j*2+1)c2=c2+"##";
                if (i==n)b2=b2+"#";
                if (i==n-(2+2*j))a2=a2+"##";
                c2=c2+".";
        }
            b2=b2+"#";
            System.out.println(a2+b2+c2);
        }
        for (int j = 0; j <n/2 ; j++) {
            String a2= "";String b2 = "#";String c2="";
            for (int i = 1; i <n-1 ; i++) {
                c2=c2+".";
                if(i==j*2+1)c2=c2+"##";
                if (i==n)b2=b2+"#";
                if (i==n-(2+2*j))a2=a2+"##";
             a2=a2+".";
             b2=b2+".";

            }
            b2=b2+"#";
            System.out.println(c2+b2+a2);

        }System.out.println(a1+b1+a1);

    }// coment



}
