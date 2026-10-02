package NonPrimitiveArray;

public class Main {
    public static void main(String[] args) {
        Employee arr[]=new Employee[5];
        arr[0]=new Employee(11, 18, 'm');
        arr[1]=new Employee(12, 19, 'f');
        arr[2]=new Employee(13, 20, 'm');
        arr[3]=new Employee(14, 21, 'f');
        arr[4]=new Employee(15, 22, 'm');

        for(Employee emp : arr) {
            System.out.println(emp);
        }
    }
}
