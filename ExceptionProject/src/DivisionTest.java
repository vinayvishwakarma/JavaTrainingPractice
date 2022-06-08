import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("----begin main------");

        try {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Input numerator: ");
            int x = scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Input denominator: ");

            int y = scanner2.nextInt();
            int z = x / y;

            System.out.println("x is " + x);

            System.out.println("y is " + y);

            System.out.println("z is " + z);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        System.out.println("----end main------");

    }

}
