package bt10;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 8000);
        Developer developer = new Developer("Bob", 5000);

        manager.work();
        manager.attendMeeting();
        manager.takeVacation();

        developer.work();
        developer.takeVacation();
    }
}
