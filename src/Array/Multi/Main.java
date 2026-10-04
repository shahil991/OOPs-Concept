package Array.Multi;

public class Main {
    public static void main(String[] args) {
        Employee err[] = new Employee[5];

        err[0]=new Employee(11,"raju1");
        err[1]=new Employee(12,"raju2");
        err[2]=new Employee(13,"raju3");
        err[3]=new Employee(14,"raju4");
        err[4]=new Employee(15,"raju5");

        for(Employee emp : err) {
            System.out.println(emp);
        }
    }
}
