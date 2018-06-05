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
public class Person {
    String name;
    int age;
    Scanner in=new Scanner(System.in);
    void setName()
    {
        System.out.println("enter name");
        name=in.nextLine();
    }
    String getName()
    {
        return name;
    }
}
