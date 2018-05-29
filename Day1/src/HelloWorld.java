/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class HelloWorld {
    
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
ch++;
System.out.println("ch :"+ch);
++ch;
System.out.println("ch :"+ch);

ch='a';
char anotherch=ch++;
System.out.println("ch:"+ch);
System.out.println("another ch:"+anotherch);
ch='c';
char anotherch1=--ch;
System.out.println("ch:"+ch);
System.out.println("another ch:"+anotherch1);
String name="rk";
System.out.println("name is:"+name);
boolean flag=false;
System.out.println("flag:" +flag);
if(!flag)
{
    System.out.println("name :"+name);
    
}
else
{
    System.out.println("name is missing");
    
}
char vowel='a';
switch(vowel)
{
    case 'a':
       System.out.println("given character is vowel");
    break;
       case 'e':
       System.out.println("given character is vowel");
        break;
    case 'i':
        System.out.println("given character is vowel");
         break;
    case 'o':
        System.out.println("given character is vowel");
         break;
    case 'u':
        System.out.println("given character is vowel");
         break;
    default:
        System.out.println("given character is not vowel");
         break;       
}
switch(10+20)
{
    case 10:
         System.out.println("not matched");
    break;
    case 30:
         System.out.println("matched");
    break;
    default:
         System.out.println("can't determined");
         break;
}


}
}
