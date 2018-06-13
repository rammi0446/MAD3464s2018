/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Generics {
    public static <E> void printArray(E[] inputArray)
    {
        for(E element:inputArray)
        {
            System.out.printf("%s ,", element);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Box<Integer> integerBox=new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("integer value : %d\n ", integerBox.get());
        
        Box<String> stringBox=new Box<String>();
        stringBox.set(new String("Hello World"));
        System.out.printf("string value : %s\n\n",stringBox.get());
        
        Integer[] intArr={1,2,3,4,5};
        System.out.println("array integerArray contains:");
        printArray(intArr);
        
        Double[] doubleArray={1.1,2.2,3.3,4.4};
        System.out.println("array doubleArray contains:");
        printArray(doubleArray);
        
        Character[] charArray={'h','e','l','o'};
        System.out.println("\n array charArray contains:");
        printArray(charArray);
    }
    
    
}
class Box<T>
        
{
    
    private T t;
    public void set(T t)
    {
        this.t=t;
    }
    public T get()
    {
        return t;
    }
}