import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i = 0; i < numberOfEmployees; i++){
            String[] employeeRow = scanner.nextLine().split(", ");
            String name = employeeRow[0];
            double salary = Double.parseDouble(employeeRow[1]);
            String position = employeeRow[2];
            String department = employeeRow[3];
            Employee employee;
            if(employeeRow.length > 5) {
                int age = Integer.parseInt(employeeRow[4]);
                String email = employeeRow[5];
                employee = new Employee(name, salary, position, department, age, email);
            }
            else if(employeeRow.length>4) {
                int age = Integer.parseInt(employeeRow[4]);
                employee = new Employee(name,salary,position,department,age);
            }
            else{
                employee = new Employee(name,salary,position,department);
            }
            employees.add(employee);
        }

        List<Employee> biggestSalaryEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();

        for (Employee e : biggestSalaryEmployee)
        {
            System.out.println(e);
        }
    }
}