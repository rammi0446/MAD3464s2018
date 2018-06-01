/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Bank {
    int id;
    String name;
    
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
    public String toString()
    {
        
     String data="id :" +this.id+ "\n" +"name :"+ this.name;
     return data;
    }
}
