package com.karabocodes;

import java.util.Scanner;

public class Main {

    EmployeeService service = new EmployeeService();
    static boolean ordering = true;

    public static void menu(){
        System.out.println("************Welcome Tp Employee Management System Portal************"
        + "\n1. Add Employee "
        + "\n2. View Employee "
        + "\n3. Update Employee "
        + "\n4. Delete Employee "
        + "\n5. View all Employee "
        + "\n6. Exit ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        do {
            menu();
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add Employee");
                    service.addEmployee();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmployee();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmployee();
                    break;
                case 5:
                    System.out.println("view all Employees ");
                    service.viewAllEmployees();
                    break;
                case 6:
                    System.out.println("Thank you for using our system");
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice");
            }
        } while (ordering);
        menu();
    }
}