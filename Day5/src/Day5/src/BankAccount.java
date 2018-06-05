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
    int depositAmount;
    int totalAmount;
    Scanner in=new Scanner(System.in);
    
    
    
   
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
    void setDeposit() {
        System.out.println("Enter deposit amount : ");
        depositAmount = in.nextInt();
    }
    
    int getDeposit() {
        return depositAmount;
    }
    int getTotalAmount()
    {
        totalAmount=(balance+depositAmount);
       return  totalAmount;
    }
    /*public void deposit()
    {
        
        System.out.println("total balance:"+(balance+depositAmount));
    }*/
   
}