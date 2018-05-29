/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class HelloWorld1 {
    
public static void main(String args[])
{
    System.out.println("hello world");
   // System.in
  // System.err
  int number=10;
  float fnumber=10.2f;
  double dnumber=10.23455;
  short n1;
  long n2;
  number *=10;//number = number +10;
  
  System.out.println("number is = "+ number);
  number =20;
  System.out.println("number :"+(number+10) );
  System.out.println(10+number + "number :");
/*  number=number/0;
*/
char ch='a';
System.out.println("ch :"+ch);
System.out.println("ch :"+(char)(ch+1));
ch++;
System.out.println("ch :"+ch);

}
}
