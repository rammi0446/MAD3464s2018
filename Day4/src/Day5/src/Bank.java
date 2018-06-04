/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;
/**
 *
 * @author macstudent
 */
import java.util.Scanner;
public class Bank {
    int id;
    String name;
    Scanner in=new Scanner(System.in);
    Bank()
    {
        this.id=1;
        this.name="Scotia";
    }
    
    Bank(String name,int id)
    {
        this.id=id;
        this.name=name;
    }
    void setId() {
        System.out.println("Enter bank id : ");
        id = in.nextInt();
    }
    
    int getId() {
        return id;
    }
    void setName() {
        System.out.println("Enter bank name ");
        name = in.nextLine();
    }
    
    String getName() {
        return name;
    }
    
    
    @Override
    public String toString()
    {
        
     String data="id :" +this.id+ "\n" +"name :"+ this.name;
     return data;
    }
    
}