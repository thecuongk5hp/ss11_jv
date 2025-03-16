package bt06;

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Kèn!");
    }

    @Override
    public void move() {
        System.out.println("Voi đang đi bộ.");
    }
}