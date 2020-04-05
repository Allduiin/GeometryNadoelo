public class Trapeze {
    private double base1;
    private double base2;
    private double side1;
    private double side2;
    private String color;
    private double median;
    private double h;
    private double s;
    String[] colors = {"pink", "red", "blue", "green", "yellow"};

    public Trapeze() {
        base1 = Math.random() * 100;
        base2 = base1 + Math.random() * 100;
        side1 = Math.random() * 100;
        side2 = Math.abs((base2 - base1) - side1) + Math.random() * (side1 + base2 - base1 - Math.abs((base2 - base1) - side1));
        color = colors[(int)(Math.random() * 4)];
        double pSides = (side1 + side2 + (base2 - base1))/2;
        median = (base1 + base2) / 2;
        h = Math.sqrt(pSides * (pSides - side1) * (pSides - side2) * (pSides - (base2 - base1))) * 2 / (base2 - base1);
        s = h * median / 2;
    }

    public Trapeze(double base1, double base2, double side1, double side2, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    public double getBase2() {
        return base2;
    }

    public double getBase1() {
        return base1;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getArea() {
        return s;
    }

    @Override
    public String toString() {
        return "Trapeze: " +
                "base1=" + base1 +
                ", base2=" + base2 +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", color= " + color +
                ", median=" + median +
                ", h=" + h +
                ", s=" + s;
    }
}
