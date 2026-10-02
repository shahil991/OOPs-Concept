package NonPrimitiveArray;

public class Employee {

    private int eid;
    private int eage;
    private char gender;
    public Employee(int eid, int eage, char gender) {
        super();
        this.eid = eid;
        this.eage = eage;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eage=" + eage +
                ", gender=" + gender +
                '}';
    }
}
