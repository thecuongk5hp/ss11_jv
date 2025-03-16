package bt10;

class Developer extends Employee{


    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.printf("Lập trình viên " + getName() + "(Lương: %f)", getSalary() + "đang viết code cho hệ thống mới");
    }

    @Override
    public void takeVacation() {
        System.out.printf("Lập trình viên " + getName() + "(Lương: %f)", getSalary() + "đang đi nghỉ phép ở Bali");
    }
}
