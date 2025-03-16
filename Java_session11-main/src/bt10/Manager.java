package bt10;

class Manager extends Employee implements AttendMeeting  {


    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.printf("Quản lý " + getName() + "(Lương: %f)", getSalary() + "Đang giám sát dự án");
    }

    @Override
    public void takeVacation() {
        System.out.printf("Quản lý " + getName() + "(Lương: %f)", getSalary() + "đang đi nghỉ phép tại Pháp");
    }

    @Override
    public void attendMeeting() {
        System.out.printf("Quản lý " + getName() + "(Lương: %f)", getSalary() + "đang tham gia cuộc họp");
    }
}
