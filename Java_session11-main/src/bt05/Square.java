package bt05;

class Square implements Colorable {
    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
        this.color = "Màu sắc";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Hình vuông, có màu: " + color);
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }
}
