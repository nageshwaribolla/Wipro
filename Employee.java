public class Employee {
    int id;
    String name;
    int salary;
    void setId(int no){
        id=no;
    } 
    void setName(String n){
        name=n;
    }
    void setSalary(int n){
        salary=n;
    }
    void getEmployeeDetails(){
        System.out.println(name+" salary is "+salary);
    }
    

    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setId(527);
        emp1.setName("Nagi");
        emp1.setSalary(1000);
        emp1.getEmployeeDetails();
    }
}