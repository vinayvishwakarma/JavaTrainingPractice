import java.util.ArrayList;

public class SwapTest3 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        AnyPair<Float> any = new AnyPair<Float>(10f, 20f);
        System.out.println(any);
        any.Swap();
        System.out.println(any);

        AnyPair<Double> anyd = new AnyPair<Double>(10.5, 20.54);
        System.out.println(anyd);
        anyd.Swap();
        System.out.println(anyd);

        AnyPair<String> anys = new AnyPair<String>("Ramesh", "Mahesh");
        System.out.println(anys);
        anys.Swap();
        System.out.println(anys);

        AnyPair<Egg> egg = new AnyPair<Egg>(new Egg("Hen", "White", 100), new
        Egg("Ostrich", "grey", 10000));

        System.out.println(egg);
        egg.Swap();
        System.out.println(egg);

    }

}

class AnyPair<T> {
    T x;
    T y;

    public AnyPair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void Swap() {
        T temp = x;
        x = y;
        y = temp;
    }

    @Override
    public String toString() {
        return "AnyPair [x=" + x + ", y=" + y + "]";
    }

}