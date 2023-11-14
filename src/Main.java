import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(1,2);
        shapes[2] = new Rectangle.Square(3.0);

        for (Shape shape:shapes) {
            System.out.println("Площадь: "+shape.area());

        }

    }


}