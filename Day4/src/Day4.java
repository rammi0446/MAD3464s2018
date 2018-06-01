/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day4 
{
   public static void main(String args[])
   {
       Person p=new Person();
       System.out.println(p.toString());
       
       Person a=new Person("Alay","USA","1234756",'M',23);
       System.out.println(a.toString());
       
       Person a2=new Person(a);
       System.out.println(a2.toString());
       Employee emp1=new Employee();
       emp1.name="Sagar";
       emp1.address="IND";
       emp1.phoneNo="2222";
       emp1.gender='f';
       emp1.empId="F101";
       emp1.dept=20;
       emp1.joiningDate="01 june 2018";
       System.out.println(emp1.toString());
       
       Employee emp2=new Employee("Shivam","Gujarat","9888",23,'M',"P123",30,"13 May 2017");
       System.out.println(emp2.toString());
       
       
   }
}
