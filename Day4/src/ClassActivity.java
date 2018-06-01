/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class ClassActivity {
    public static void main(String args[])
    {
        
       //first default constructor
        BankAccount account1=new BankAccount();
       System.out.println(account1.toString());
       //second parameter constructor
       BankAccount account2=new BankAccount(9856425,8000,"sagar","icici",101);
       System.out.println(account2.toString());
       //third way
       BankAccount account3=new BankAccount();
       account3.acNo=7878787;
       account3.balance=4400;
       account3.ownerName="Apache";
       account3.name="TD";
       account3.id=202;
        System.out.println(account3.toString());
        //fourth getter setter
        
        BankAccount account4 = new BankAccount();
        account4.setOwnerName();
        System.out.println("name of the owner is " +account4.getOwnerName());
        account4.setName();
        System.out.println("Name is: " + account4.getName());
        account4.setAcNo();
        System.out.println("account number is : " + account4.getAcNo());
        account4.setBalance();
        System.out.println("balance available is : " + account4.getBalance());
        account4.setId();
        System.out.println("Id is : " + account4.getId());
        
        
       
    }
}
