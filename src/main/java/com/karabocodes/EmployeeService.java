package com.karabocodes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(1, "karabo", 27, "Software Guru", "IT", 27000);
    Employee emp2 = new Employee(2, "thabo", 27, "Software Guru", "Developer", 27000);


    Scanner scan = new Scanner(System.in);

    int id;
    boolean found = false;
    String name;
    int age;
    String designation;
    String department;
    double salary;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
    }

    public void viewAllEmployees(){
        for (Employee employee:empset){
            System.out.println(employee);
        }
    }

    public void viewEmployee(){
        System.out.println("Enter Id: ");
        id = scan.nextInt();
        for(Employee employee:empset){
            if(employee.getId()==id){
                System.out.println(employee);
                found = true;
            }
        }
        if (!found){
            System.out.println("Employee with this id is not found");
        }
    }

    public void deleteEmployee (){
        System.out.println("Enter ID:");
        id = scan.nextInt();

        Iterator<Employee> iterator = empset.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                System.out.println("Employee " + employee + " has been taken off the system");
                found = true;
                return; // Exit the loop after removal
            }
        }

        if (!found){
            System.out.println("Employee with this id is not found");
        }
    }


    public void updateEmployee(){
        System.out.println("Enter Id: ");
        id = scan.nextInt();
        boolean found = false;
        for (Employee employee : empset){
            if (employee.getId() == id){
                System.out.println("Enter name: ");
                name = scan.next();
                System.out.println("Enter salary: ");
                salary = scan.nextDouble();
                employee.setSalary(salary);
                employee.setName(name);
                System.out.println("Updated Details of employee are: ");
                System.out.println(employee);
                found = true;
            }
        }
        if (!found){
            System.out.println("Employee with this id is not found");
        } else {
            System.out.println("Employee details updated successfully !!");
        }
    }

    public void addEmployee() {
        System.out.println("Enter ID:");
        int id = scan.nextInt();
        scan.nextLine(); // Consume newline character

        System.out.println("Enter Name:");
        String name = scan.nextLine();

        System.out.println("Enter Age:");
        int age = scan.nextInt();
        scan.nextLine(); // Consume newline character

        System.out.println("Enter Designation:");
        String designation = scan.nextLine();

        System.out.println("Enter Department:");
        String department = scan.nextLine();

        System.out.println("Enter Salary:");
        double salary = scan.nextDouble();

        Employee newEmployee = new Employee(id, name, age, designation, department, salary);

        empset.add(newEmployee);

        System.out.println("Employee added successfully!");
    }


}
