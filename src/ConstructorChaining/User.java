package ConstructorChaining;

public class User {
    private String name;
    private int age;

//    way-1: name & age
    public User(String name, int age) {
        this.name=name;
        this.age=age;
    }

    //way-2: name
    public User(String name) {
        this(name,18);
    }

    //way-3: blank
    public User(){
        this("Unk",18);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
