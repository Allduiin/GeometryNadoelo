import java.util.Arrays;

public class Square {
    private double side;
    private String color;
    private double area;
    String[] colors = {"pink", "red", "blue", "green", "yellow"};

    public Square() {
        side = Math.random() * 100;
        color = colors[(int)(Math.random() * 4)];
        area =  side * side;
    }

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return area;
    }

    @Override
    public String toString() {
        return "Square: " +
                "side=" + side +
                ", color='" + color + '\'' +
                ", area=" + area +
                ", colors=" + Arrays.toString(colors) +
                '\n';
    }
}
