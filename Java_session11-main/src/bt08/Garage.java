package bt08;

class Garage {
    private Car[] cars;
    private int count;

    public Garage(int capacity) {
        cars = new Car[capacity];
        count = 0;
    }

    public void addCar(Car car) {
        if (count < cars.length) {
            cars[count] = car;
            count++;
        } else {
            System.out.println("Garage đã đầy!");
        }
    }

    public void startAllCars() {
        for (int i = 0; i < count; i++) {
            System.out.println(cars[i].start());
        }
    }

    public void stopAllCars() {
        for (int i = 0; i < count; i++) {
            System.out.println(cars[i].stop());
        }
    }

    public void refuelAllCars() {
        for (int i = 0; i < count; i++) {
            if (cars[i] instanceof Refuelable) {
                System.out.println(((Refuelable)cars[i]).refuel());
            }
        }
    }
}