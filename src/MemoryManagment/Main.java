package MemoryManagment;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();  // class loading then Object Creation
        employee.x();
    }
}

// Main Class Loading
// Main method run-JVM
// Activation Record of Main-Stack
// Employee Class Loading
// Employee Class Object-Heap
// Activation Record of x-Stack
// Activation Record of x-Remove
// Activation Record of main-remove
// Garbage Collector

