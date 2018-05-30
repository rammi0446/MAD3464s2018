/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day2 {
    public static void main(String args[])
    {
        int i=1;
   while(i<6)
   {
       System.out.println("i is :"+i);
       i++;
   }
   System.out.println("loop ended");
   i=6;
   do{
       System.out.println("i :"+i);
       i++;
       
   }
   while(i<6);
   i=1;
   for(;i<6;i++)
   {
       if(i==3)
       {
           continue;
       }
       
       System.out.println("i is:"+i);
   }
     
   int numbers[]=new int[5];
   
   for(int j=10,k=0;k<numbers.length;k++, j+=10)
   {
       numbers[k]=j;
      
      System.out.println("number [" + k + "] = "+numbers[k]);
   }
   /*for(int no:numbers)
   {
       System.out.println("no :"+no);
   }*/
   i=10;
   int ar1[][]=new int[4][3];
   for(int row=0;row<4;row++)
   {
       for(int col=0;col<3;col++)
       {
           ar1[row][col]=i++;
           System.out.print(ar1[row][col]+ " ");
           
           
       }
       System.out.println();
   }
   
   
   for(int row=0;row<=5;row++)
   {
       for(int col=0;col<row;col++)
       {
           System.out.print("*");
       }
       System.out.println("");
   }
   
   for(int row=0;row<=5;row++)
   {
       for(int space=5;space>row;space--)
       {
           System.out.print(" ");
       }
       for(int col=0;col<row;col++)
       {
           
           System.out.print("* ");
           
       }
       
          System.out.println("");
   }
   
   
   for(int row=5;row>=1;row--)
   {
       for(int space=5;space>row;space--)
       {
           System.out.print(" ");
       }
       for(int col=0;col<row;col++)
       {
           System.out.print("* ");
       }
       System.out.println("");
   }
   
   
   
   
   
   
}}

