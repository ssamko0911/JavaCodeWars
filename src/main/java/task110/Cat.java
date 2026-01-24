package task110;

//https://www.codewars.com/kata/55a14aa4817efe41c20000bc/train/java

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return String.format("%s meows.", this.getName());
    }
}
