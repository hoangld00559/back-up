/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;
    
    //constructor

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }
    
    public void add(Employee e){
        subordinates.add(e);
    }
    
    public void remove(Employee e){
        subordinates.remove(e);
    }
    
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    
    @Override
    public String toString(){
        return ("Employee :[ Name: " + name + ", dept: " + dept + ", salary: " + salary + " ]");
    }
}
