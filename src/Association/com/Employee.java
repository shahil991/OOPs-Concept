package Association.com;

public class Employee {
    private int id;
    private String name;
    private Account account;

    public Employee(int id, String name, String an, String ifsc, String bankName) {
        this.id = id;
        this.name = name;
        this.account = new Account(an,ifsc,bankName);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}

