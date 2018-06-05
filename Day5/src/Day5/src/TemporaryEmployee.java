/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class TemporaryEmployee extends Employee{
    String designation;
    float hourlyRate;
    TemporaryEmployee()
    {
        this.designation="unsigned";
        this.hourlyRate=0.0f;
    }
    
    TemporaryEmployee(String name,String address,String phoneNo,int age,char gender,String empId,int dept,String joiningDate,String designation,float hourlyRate)
    {
        super(name,address,phoneNo,age,gender,empId,dept,joiningDate);
        this.designation=designation;
        this.hourlyRate=hourlyRate;
    }
    
    @Override
    public String toString()
    {
        super.toString();
        return (super.toString()+ "\n Designation :" +this.designation+ "\n HourlyRate :" +this.hourlyRate);                
    }
}
