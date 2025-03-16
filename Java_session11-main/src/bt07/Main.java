package bt07;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Nguyen Van A", 20, 4);
        System.out.println("Part-time Employee: " + partTimeEmp.getName());
        System.out.println("Salary: $" + partTimeEmp.calculateSalary());

        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Tran Thi B", 25);
        System.out.println("\nFull-time Employee: " + fullTimeEmp.getName());
        System.out.println("Salary: $" + fullTimeEmp.calculateSalary());
    }
}
