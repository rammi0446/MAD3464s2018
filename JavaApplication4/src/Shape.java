/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
abstract class Shape {
    int x;
    int y;
    int z=0;
    Shape(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println("this is to display shape");
    }
    abstract void draw();
    
    
}
