package listaExercicios03;

import java.util.Scanner;

//ESTUDAR ISSO MELHOR!!
public class xmasTree {
 public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);

     // System.out.print("Enter the xmas tree size: ");
     while(sc.hasNext()){
         System.out.println();
         // System.out.print("Enter the tree size: ");
         int n = sc.nextInt();

         for (int i = 1; i <= n; i+=2){
             //Spaces
             for(int j = 0; j < (n-i) / 2; j++){
             System.out.print(" ");
             }

             //* 
         for(int l = 0; l < i; l++){
             System.out.print("*");
             }
         System.out.println();
         }

         for(int j = 0; j < (n-1) / 2; j++){
             System.out.print(" ");
         }
         System.out.println("*");

         for(int j = 0; j < (n-3) / 2; j++){
             System.out.print(" ");
         }
         System.out.println("***");
         System.out.println();
         
         
     }

     sc.close();
 }
}

