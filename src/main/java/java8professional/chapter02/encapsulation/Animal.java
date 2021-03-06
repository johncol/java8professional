package java8professional.chapter02.encapsulation;

public class Animal {

    private String name;
    private int age;
    private boolean example1;
    private Boolean example2;

    public Animal(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("You must provide a name for the animal");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than or equal to 0");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isExample1() {
        return example1;
    }

    public Boolean getExample2() {
        return example2;
    }
}
