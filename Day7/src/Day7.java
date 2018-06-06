/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day7 {
    public static void main(String args[])
    {
        String str1="Test String";
        String str2=new String("Java");
        System.out.println(str1);
        System.out.println(str2);
        
        String str3=str1+str2;
        System.out.println(str3);
        
        str3=str2.concat(str1);
        System.out.println(str3);
  
        str3=str2;
        str3="JAVA";
        System.out.println(str3);
        System.out.println(str2);
        if(str3.equalsIgnoreCase(str2))
        {
            System.out.println("equals");
        }
        else
        {
            System.out.println("not equals");
        }
       
        str2="Hello Java";
        System.out.println(str2.endsWith("Java"));
        
        str2="Hello Java";
        System.out.println(str2.endsWith(str3));
        
        str3=str2.substring(4);
        System.out.println("String 3 :"+str3);
        
        str3=str2.substring(4,8);
        System.out.println("String 3 :"+str3);
        
        str3=str2.substring(0,5);
        System.out.println("String 3 :"+str3);
        
        
        str2="Hello there";
        System.out.println(str2.replace('l', 'm'));
        str2="Test 2";
        str3="test 2";
        System.out.println("string 2"+str2);
        System.out.println("stirng 3"+str3);
        int cmp=str2.compareTo(str3);
        System.out.println("cmp :"+cmp);
        
        System.out.println("string 2 "+str2.toUpperCase());
        System.out.println("length of str2 :"+str2.length());
        int a1[]=new int[3];
        int len=a1.length;
        System.out.println(len);
        int p=str2.indexOf('b');
        str2="Hello Java";
                
        p=str2.indexOf('a',4);
        p=str2.lastIndexOf('a');
        System.out.println("p :"+p);
        str2="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<str2.length(); i++)
        {
            System.out.print((char)(str2.charAt(i)));
        }
        System.out.println(" ");
        str2="this is a test string";
        int wordcount=1;
        for(int i=str2.length()-1;i>=0;i--)
        {
            System.out.print(str2.charAt(i));
            if(Character.isWhitespace(str2.charAt(i)))
            {
                wordcount++;
            }
        }
        System.out.println(" ");
    System.out.println("total words :"+wordcount);
    
    StringBuffer str4=new StringBuffer("it feels like winter in summer");
    
    System.out.println();
    
    System.out.println("str4 :"+str4);
    str4.append("test");
    System.out.println("str4 :"+str4);
    str4.setCharAt(3, '@');
    System.out.println("str4 :"+str4);
    
    str4.insert(10, "@#$");
    System.out.println("str4 :"+str4);
    str4.reverse();
    System.out.println("str4 :"+str4);
    
    
    String[] words =  "This is test String".split(" ");

String rev = "";
for(int i = words.length - 1; i >= 0 ; i--)
{
   rev += words[i] + " ";
}
System.out.println(rev);
    }
}
