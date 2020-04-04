public class Circle {
    private double radius;
    private String color;
    private double area = Math.PI * (radius * radius);
    String[] colors = {"pink", "red", "blue", "green", "yellow"};

    public Circle() {
        this.radius = Math.random() * 100;
        this.color = colors[(int) (Math.random() * 4)];
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
