package bt05;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Square square = new Square(3.0);

        circle.setColor("Xanh");
        rectangle.setColor("Đỏ");
        square.setColor("Vàng");

        System.out.println("\n=== Kiểm tra màu sắc ===");
        System.out.println("Màu của hình tròn: " + circle.getColor());
        System.out.println("Màu của hình chữ nhật: " + rectangle.getColor());
        System.out.println("Màu của hình vuông: " + square.getColor());
    }
}
