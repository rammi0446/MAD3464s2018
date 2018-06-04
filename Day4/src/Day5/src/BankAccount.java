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
public class BankAccount extends Bank {
    int acNo;
    int balance;
    String ownerName;
    Scanner in=new Scanner(System.in);
    
    BankAccount()
    {
        super();
        this.acNo=123456789;
        this.balance=3000;
        this.ownerName="raman";
    }
    
    BankAccount(int acNo,int balance,String ownerName,String name,int id)
    {
        super(name,id);
        this.acNo=acNo;
        this.balance=balance;
        this.ownerName=ownerName;
        
    }
    @Override
    public String toString()
    {
        
     String data="acNo :" +this.acNo+ "\n" +"balance :"+ this.balance+ "\n" + "Owner Name :" +this.ownerName+ "\n" +this.name+ "\n" +this.id;
     return data;
    }
    
    
    void setAcNo() {
        System.out.println("Enter ac no :" );
        acNo = in.nextInt(); 
        
    }
    int getAcNo() {
        return acNo;
    }
    
    void setBalance() {
        System.out.println("Enter balance :");
        balance = in.nextInt();  
    }
    int getBalance() { 
        return balance;   
    }
    
    void setOwnerName()
    {
        System.out.println("Enter owner name : ");
        ownerName = in.nextLine();
    }
            
    String getOwnerName() {
        return ownerName;
    }
    
    
    
}