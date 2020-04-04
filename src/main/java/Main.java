import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[1 +(int) (Math.random() * 10)];
        Circle[] circles = new Circle[1 +(int) (Math.random() * 10)];
        Triangle[] triangles = new Triangle[1 +(int) (Math.random() * 10)];
        Trapeze[] trapezes = new Trapeze[1 + (int) (Math.random() * 10)];
        for (int i = 0; i < squares.length; i++) {
            squares[i]= new Square();
        }
        for (Circle circle: circles) {
            circle = new Circle();
        }
        for (Triangle triangle:triangles) {
            triangle = new Triangle();
        }
        for (Trapeze trapeze : trapezes) {
            trapeze = new Trapeze();
        }
    }
}
