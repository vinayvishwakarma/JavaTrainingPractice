public class SwapTest1 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        IntegerPair ip = new IntegerPair(10, 20);
        ip.print();
        ip.swap();
        ip.print();

    }

}

class IntegerPair {

    public IntegerPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    public void print() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public void swap() {

        int temp = x;
        x = y;
        y = temp;
    }

}