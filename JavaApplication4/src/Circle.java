/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Circle extends Shape{
Circle(int x,int y)
{
    super(x,y);
}
    @Override
    void draw() {
       // super.x=10;
       // super.y=20;
     //System.out.println("x: "+super.x);
     //System.out.println("x: "+super.y);
     System.out.println("drawing circle"+"x: "+super.x+" and y: "+super.y);
    }
    
    
}
