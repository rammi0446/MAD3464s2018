/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Addition implements arithmetic,multiplication{

    @Override
    public void display() {
       // int n1=20;
        //int n2=50;
        System.out.println("addition :"+(n1+n2));
    }

    @Override
    public void multiplication() {
     System.out.println("multiplication :"+(n1*n2));
    }
    
}
