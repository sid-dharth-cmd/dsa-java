class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void displayEmployeeInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
    void displayManagerDetails(){
        super.displayEmployeeInfo();
        System.out.println("Managing department: "+department);
    }
}
class Q9{
    public static void main(String[] args){
        Manager Mobj = new Manager("Deepak", 52000, "Electrical");
        Mobj.displayManagerDetails();
    }
}