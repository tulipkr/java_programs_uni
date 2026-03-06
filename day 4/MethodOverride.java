class Employee{
    void calcSalary(){
        System.out.println("Salary of Employee calculated");
    }
}

class Manager extends Employee{
    void calcSalary(){
        System.out.println("Salary of Manager calculated");
    }
}

class Developer extends Employee{
    void calcSalary(){
        System.out.println("Salary of Developer calculated");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Employee obj1= new Employee();
        Employee obj2=new Manager();
        Employee obj3= new Developer();
        obj1.calcSalary();
        obj2.calcSalary();
        obj3.calcSalary();
    }
}
