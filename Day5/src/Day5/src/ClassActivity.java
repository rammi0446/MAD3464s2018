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
public class ClassActivity {
    public static void main(String args[])
    {
      
        
      
        
        BankAccount account4 = new BankAccount();
        account4.setOwnerName();
        account4.setAcNo();
        account4.setBalance();
        System.out.println("balance available is : " + account4.getBalance());
        System.out.println("name of the owner is " +account4.getOwnerName());
        System.out.println("account number is : " + account4.getAcNo());
        
        Bank bank=new Bank();
        bank.setName();
        bank.setId();
        System.out.println("Name is: " + bank.getName());
        System.out.println("Id is : " + bank.getId());
        
       
        account4.setDeposit();
       System.out.println("total amount :"+ account4.getTotalAmount());
       
       OverDraftAccount overDraftAccount=new  OverDraftAccount();
       overDraftAccount.setOverdraftLimit();
      
       System.out.println("overdraftlimit: " + overDraftAccount.getOverdraftLimit());
       
       overDraftAccount.setWithDraw();
       overDraftAccount.withDraw();
    }
}