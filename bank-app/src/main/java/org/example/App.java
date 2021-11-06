package org.example;


import org.example.bank.Employee;
import org.example.customer.Customer;
import org.example.dao.user.UserDao;
import org.example.dao.user.UserDaoFactory;
import org.example.dao.user.UserDaoImpl;
import org.example.shared.User;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        boolean login = true;

        while (login){
            System.out.println("*********************************");
            System.out.println("Select from option below");
            System.out.println("*********************************");
            System.out.println("Press 1: Log in / register as a Employee");
            System.out.println("Press 2: Log in / register as a Customer");
            System.out.println("Press 3: Exit");
            int option = sc.nextInt();
            sc.nextLine();


//        try {
//
//
//            Scanner sc = new Scanner(System.in);
//            boolean loginMenu = true;
//            while (loginMenu) {
//
//                System.out.println("*********************************");
//                System.out.println("Select from option below");
//                System.out.println("*********************************");
//                System.out.println("Press 1: Log in / register as a Employee");
//                System.out.println("Press 2: Log in / register as a Customer");
//                System.out.println("Press 3: Exit");
//
//                int loginOption = sc.nextInt();
//                sc.nextLine();
//
//                switch (loginOption) {
//                    case 1:
//                        // read from console
//                        System.out.print("Enter your name: ");
//                        String name = sc.nextLine();
//                        System.out.print("Enter your password: ");
//                        String password = sc.nextLine();
//                        Employee e = new Employee(name, password);
//                        if(! e.login()) {
//                            break;
//                        }
//                        boolean employeeMenu = true;
//                        while (employeeMenu) {
//                            System.out.println("*********************************");
//                            System.out.println("Select from option below");
//                            System.out.println("*********************************");
//                            System.out.println("Press 1: View accounts");
//                            System.out.println("Press 2: Approve account");
//                            System.out.println("Press 3: Exit");
//
//                            int employeeOption = sc.nextInt();
//                            sc.nextLine();
//
//                            switch (employeeOption) {
//                                case 1:
//                                    e.viewAccounts();
//                                    break;
//                                case 2:
//                                    int accId = sc.nextInt();
//                                    sc.nextLine();
//                                    e.approveAccount(accId);
//
//                                    break;
//                                default:
//                                    employeeMenu = false;
//                            }
//                        }
//                        break;
//                    case 2:
//                        Customer c = new Customer("customer", "123");
//                        System.out.println("case2 employee");
//                        if(! c.login()) {
//                            break;
//                        }
//                        boolean customerMenu = true;
//                        while (customerMenu) {
//                            System.out.println("*********************************");
//                            System.out.println("Select from option below");
//                            System.out.println("*********************************");
//                            System.out.println("Press 1: Apply for account");
//                            System.out.println("Press 2: Deposit");
//                            System.out.println("Press 3: Exit");
//
//                            int customerOption = sc.nextInt();
//                            sc.nextLine();
//
//                            switch (customerOption) {
//                                case 1:
//                                    int balance = sc.nextInt();
//                                    sc.nextLine();
//                                    c.applyForAccount(balance);
//                                    break;
//                                case 2:
//                                    int amount = sc.nextInt();
//                                    sc.nextLine();
//                                    c.deposit(amount);
//                                    break;
//                                case 3:
//                                    System.out.println("Exit");
//                                    customerMenu = false;
//                               break;
//                            }
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Good bye!");
//                        loginMenu = false;
//                        break;
//                    default:
//                        loginMenu = false;
//                }

        //          }

//            UserDao dao = UserDaoFactory.getUserDao();
//
//            int choice = 1;//sc.nextInt();
//            //sc.nextLine();
//            String username = "test2";//sc.nextLine();
//            String password = "test23";//sc.nextLine();
//            switch (choice) {
//                case 1:
//                    Customer c = new Customer("three", "four");
//                    System.out.println(c);
//                    c.login();
//                    c.applyForAccount(20);
//
//                    Employee e = new Employee("ainura", "123");
//                    System.out.println(e);
//                    e.approveAccount(c.getId());
//                    c.deposit(10);
//                    c.withdraw(8);
//                    c.viewTransactions();
//
//
//                    User u = dao.login(username, password);
//                    Customer c = new Customer(u.getId(), u.getUsername(), u.getPassword());
//                    c.applyForAccount(20);
//                    System.out.println(c);
//                    Employee e = new Employee(u.getId(), u.getUsername(), u.getPassword());
//                    System.out.println("enter acc id");
//                    int accId = sc.nextInt();
//                    sc.nextLine();
//                    e.approveAccount(accId);
//                    c.deposit(20);
//                    c.withdraw(10);
//                    c.viewTransactions();
//
        //   }

//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getErrorCode());
       }
    }
}
