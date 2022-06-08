public class AbstractTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        GeomatricShape circle = new Circle(100);
        circle.draw();
        circle.calculateArea();
        circle.calculatePerimeter();
        
        System.out.println("----------------");
        circle = new Square(100);
        circle.draw();
        circle.calculateArea();
        circle.calculatePerimeter();
        
    }

}

abstract class GeomatricShape {

    abstract void draw();

    abstract void calculateArea();

    abstract void calculatePerimeter();
}

class Circle extends GeomatricShape {
    final double PI = 3.14;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }

    @Override
    void calculateArea() {
        System.out.println("calculate area");
        System.out.println("area is " + PI * radius * radius);

    }

    @Override
    void calculatePerimeter() {
        System.out.println("calculate perimeter");
        System.out.println("Perimeter is " + 2 * PI * radius);

    }

}

class Square extends GeomatricShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("draw square");
    }

    @Override
    void calculateArea() {
        System.out.println("calculate area");
        System.out.println("area is " +  side * side);

    }

    @Override
    void calculatePerimeter() {
        System.out.println("calculate perimeter");
        System.out.println("Perimeter is " + 4 * side);

    }

}