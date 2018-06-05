/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;
/**
 *
 * @author macstudent
 * \y78
 */
public class OverDraftAccount extends BankAccount{
    int overDraftLimit;
    int withDraw;
    
    void setOverdraftLimit()
    {
        System.out.println("Enter overdraft : ");
        overDraftLimit = in.nextInt();
    }
    int getOverdraftLimit() {
        return  overDraftLimit;
    }
    void setWithDraw()
    {
        System.out.println("Enter withdraw : ");
        withDraw = in.nextInt();
    }
    int getWithDraw() {
        return  withDraw;
    }
    @Override
    public String toString()
    {
        
     String data="overDraftLimit :" +this.overDraftLimit;
     return data;
    }
    
    public void withDraw()
    {
        System.out.println("total balance is :"+totalAmount);
        System.out.println("ramaining balance:"+((getTotalAmount()+overDraftLimit)-withDraw));
    }
    
}
