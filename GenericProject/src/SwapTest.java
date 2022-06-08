public class SwapTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        print(x, y);
        System.out.println("Swapping.........");
        swap(x, y);
        print(x, y);
        System.out.println("Swapped.........");

    }

    
    /** 
     * @param x
     * @param y
     */
    public static void print(int x, int y) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    
    /** 
     * @param x
     * @param y
     */
    public static void swap(int x, int y) {

        int temp = x;
        x = y;
        y = temp;
    }
}
