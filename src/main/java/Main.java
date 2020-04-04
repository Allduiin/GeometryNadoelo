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
        for (int i = 0; i < circles.length; i++) {
            circles[i]= new Circle();
        }
        for (int i = 0; i < triangles.length; i++) {
            triangles[i]= new Triangle();
        }
        for (int i = 0; i < trapezes.length; i++) {
            trapezes[i]= new Trapeze();
        }
        System.out.println(Arrays.toString(squares) + Arrays.toString(circles) + Arrays.toString(triangles) + Arrays.toString(trapezes));
    }
}
