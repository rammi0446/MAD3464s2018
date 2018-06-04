/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
import java.util.Scanner;
//public class Person{
public class Person {
    String name;
    String address;
    String phoneNo;
    int age;
    char gender;
    Scanner in=new Scanner(System.in);
    //default constructor
    Person()
    {
        this.name="Unknown";
        this.address="Unknown";
       this.phoneNo="Unknown";
        this.age=1;
        this.gender='U';
    }
    //parameter constructor
    Person(String name,String address,String phoneNo,char gender,int age)
    {
        this.name=name;
        this.address=address;
        this.phoneNo=phoneNo;
        this.age=age;
        this.gender=gender;
    }
    //copy constructor
    Person(Person anotherPerson)
    {
        this.name=anotherPerson.name;
        this.address=anotherPerson.address;
        this.age=anotherPerson.age;
        this.gender=anotherPerson.gender;
        this.phoneNo=anotherPerson.phoneNo;
    }
    @Override
    public String toString()
    {
        
     String data="name :" +this.name+ "\n" +"address :"+ this.address+ "\n" + "age :" +this.age+ "\n" + "gender:" +this.gender+ "\n" + "phoneNo :" +this.phoneNo;
     return data;
    }
}
