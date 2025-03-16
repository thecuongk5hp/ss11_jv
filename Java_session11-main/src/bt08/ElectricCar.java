package bt08;

class ElectricCar extends Car implements Refuelable {
    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return System.out.printf("Xe điện %s (Năm SX: %d, Giá: $%.1f) đã khởi động không tiếng ồn", model, year, price).toString();
    }

    @Override
    public String stop() {
        return System.out.printf("Xe điện %s (Năm SX: %d, Giá: $%.1f) đã dừng và ngắt kết nối động cơ",
                model, year, price).toString();
    }

    @Override
    public String refuel() {
        return System.out.printf("Xe điện %s (Năm SX: %d, Giá: $%.1f) đang sạc điện", model, year, price).toString();
    }
}