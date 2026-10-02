package Association;

import Association.com.Account;
import Association.com.Employee;

public class Main {
    public static void main(String[] args) {

//        Account account = new Account("1212", "ABC123","XYZBank");
//        System.out.println(account);
//
//        Employee employee = new Employee(11, "raju", account);
//        System.out.println(employee);

        Employee employee = new Employee(11, "raju","1212", "ABC123","XYZBank");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAccount());
    }
}
