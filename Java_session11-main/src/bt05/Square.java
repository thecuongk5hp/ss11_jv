package bt05;

class Square implements Colorable {
    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
        this.color = "Không màu"; // Mặc định
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Hình vuông đã được tô màu: " + color);
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }
}
