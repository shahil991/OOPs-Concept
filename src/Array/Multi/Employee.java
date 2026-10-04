package Array.Multi;

public class Employee {
    private int eid;
    private String ename;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}
