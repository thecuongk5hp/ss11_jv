package bt06;

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Gầm!");
    }

    @Override
    public void move() {
        System.out.println("Sư tử đang chạy.");
    }
}