package bt05;

class Circle implements Colorable {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Không màu"; // Mặc định
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Hình tròn đã được tô màu: " + color);
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
}
