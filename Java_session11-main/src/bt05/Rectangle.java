package bt05;

class Rectangle implements Colorable {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.color = "Không màu";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Hình chữ nhật đã được tô màu: " + color);
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
