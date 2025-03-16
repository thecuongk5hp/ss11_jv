package bt08;

class GasCar extends Car implements Refuelable {
    public GasCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return System.out.printf("Xe chạy xăng %s (Năm SX: %d, Giá: $%.1f) đã khởi động với tiếng động cơ",
                model, year, price).toString();
    }

    @Override
    public String stop() {
        return System.out.printf("Xe chạy xăng %s (Năm SX: %d, Giá: $%.1f) đã dừng và động cơ tắt",
                model, year, price).toString();
    }

    @Override
    public String refuel() {
        return System.out.printf("Xe chạy xăng %s (Năm SX: %d, Giá: $%.1f) đang được đổ xăng",
                model, year, price).toString();
    }
}
