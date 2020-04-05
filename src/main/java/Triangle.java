public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private double area;
    private String color;
    String[] colors = {"pink", "red", "blue", "green", "yellow"};


    public Triangle() {
        side1 = Math.random() * 100;
        side2 = Math.random() * 100;
        side3 = Math.abs(side1 - side2) + Math.random() * (side1 + side2 - Math.abs(side1 - side2));
        color = colors[(int)(Math.random() * 4)];
        double p = (side1 + side2 + side3) / 2;
        area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return area;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color= " + color +
                ", area=" + area;
    }
}
