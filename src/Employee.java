public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private int age;
    private String email;

    public Employee(String name, double salary, String position, String department, int age, String email) {
        this.setName(name);
        this.setSalary(salary);
        this.setPosition(position);
        this.setDepartment(department);
        this.setAge(age);
        this.setEmail(email);
    }
    public Employee(String name, double salary, String position, String department, int age) {
        this.setName(name);
        this.setSalary(salary);
        this.setPosition(position);
        this.setDepartment(department);
        this.setAge(age);
    }
    public Employee(String name, double salary, String position, String department) {
        this.setName(name);
        this.setSalary(salary);
        this.setPosition(position);
        this.setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        String printStr = this.getName() + ", "+this.getDepartment()+", "+this.getPosition();
        if(this.email != null){
            printStr+= " ,"+this.getEmail();
        }
        return printStr;
    }
}
