public class PointTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(new Point3D(1, 2, 3));
        System.out.println(new Colored3DPoint(1, 2, 3, "white"));
        System.out.println(new ColoredPoint(1, 2, "red"));
        System.out.println(new Point2D(88, 99));

    }
}

class Point2D {

     int x;
     int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {

        return ""+this.x + this.y;
    }
}

class Point3D extends Point2D {

    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {

        return super.toString() + this.z;
    }

}

class ColoredPoint extends Point2D {

    String color;

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;

    }

    public String toString() {

        return super.toString() + this.color;
    }

}

class Colored3DPoint extends Point3D {

    String color;

    public Colored3DPoint(int x, int y, int z, String color) {

        super(x, y, z);
        this.color = color;

    }

    public String toString() {

        return super.toString() + this.color;
    }

}
