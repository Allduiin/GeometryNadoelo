public class Circle {
    private double radius;
    private String color;
    private double area;
    String[] colors = {"pink", "red", "blue", "green", "yellow"};

    public Circle() {
        radius = Math.random() * 100;
        color = colors[(int) (Math.random() * 4)];
        area = Math.PI * (radius * radius);
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
        return "Circle: " +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '\n';
    }
}
