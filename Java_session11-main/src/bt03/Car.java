package bt03;

class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Xe hơi: " + name + ", Tốc độ: " + speed + " km/h");
    }
}
