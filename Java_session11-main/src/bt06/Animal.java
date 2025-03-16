package bt06;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sound();
    public abstract void move();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}