package bt04;

public class Main {
    public static void main(String[] args) {
        Electronic[] devices = new Electronic[2];
        devices[0] = new TV();
        devices[1] = new Radio();

        System.out.println("Bật tất cả thiết bị");
        for (Electronic device : devices) {
            device.turnOn();
        }

        System.out.println("\n Tắt tất cả thiết bị");
        for (Electronic device : devices) {
            device.turnOff();
        }
    }
}
