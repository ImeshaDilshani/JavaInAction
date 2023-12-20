package org.example;

class servent {
    String name;
    int age;
    public servent(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void print(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Employee extends servent {

    String Designation;
    float salary;
    public Employee(String name, int age,String Designation, int salary) {
        super(name,age);
        this.Designation = Designation;
        this.salary = salary;
    }
    public void print(){
        super.print();
        System.out.println("Designation : " + Designation);
        System.out.println("Salary : " + salary);
    }
}
public class MethodOverriding {
    public static void main (String[] arg){
        Employee employee = new Employee("Imesha",23,"Manager",50000);
        employee.print();

    }
}
