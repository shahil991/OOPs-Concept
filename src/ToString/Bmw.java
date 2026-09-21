package ToString;

public class Bmw {

    private int id;
    private String name;

    public Bmw(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
