package bt03;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 120);
        Vehicle bike = new Bike("Honda", 60);

        System.out.println("Xe hơi");
        car.start();
        car.displayInfo();

        System.out.println("\n Xe máy");
        bike.start();
        bike.displayInfo();
    }
}
