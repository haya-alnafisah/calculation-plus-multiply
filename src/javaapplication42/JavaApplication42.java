/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x;
    int y;
    int z=0;
    int c=1;
    Scanner s=new Scanner(System.in);
    System.out.println("ادخل الرقم الاول المطلوب جمعه");
    x=s.nextInt();
    System.out.println("ادخل الرقم الثاني المطلوب ضربه");
    y=s.nextInt();
    for(int i=0;i<=x;i++){
        z=i+z;
    }
    System.out.println("ناتج الجمع التراكمي للعد الاول هو:"+z);
    for(int i=1;i<=y;i++){
        c=i*c;
    }
   System.out.println("ناتج الضرب التراكمي للعد الثاني هو"+c);
}
}

    
    

