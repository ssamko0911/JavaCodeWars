package task110;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Animal voice";
    }
}
