package bt05;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        Square square = new Square(5.0);

        circle.setColor("Trấng");
        rectangle.setColor("Đỏ");
        square.setColor("Đen");

        System.out.println("\n========== Kiểm tra màu sắc ===========");
        System.out.println("Màu của hình tròn: " + circle.getColor());
        System.out.println("Màu của hình chữ nhật: " + rectangle.getColor());
        System.out.println("Màu của hình vuông: " + square.getColor());
    }
}
