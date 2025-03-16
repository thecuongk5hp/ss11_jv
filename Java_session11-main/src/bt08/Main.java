package bt08;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(2);

        Car tesla = new ElectricCar("Tesla Model 3", 2023, 50000);
        Car toyota = new GasCar("Toyota Camry", 2022, 35000);

        garage.addCar(tesla);
        garage.addCar(toyota);

        System.out.println(" Khởi động tất cả xe");
        garage.startAllCars();

        System.out.println("\n Nạp nhiên liệu cho tất cả xe ");
        garage.refuelAllCars();

        System.out.println("\n Dừng tất cả xe ");
        garage.stopAllCars();
    }
}
