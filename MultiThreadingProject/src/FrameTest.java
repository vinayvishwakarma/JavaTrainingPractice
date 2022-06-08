import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Myframe f1 = new Myframe(400, 200, 100, 100, "Train");
        Myframe f2 = new Myframe(400, 200, 510, 100, "CAR");
        Myframe f3 = new Myframe(400, 200, 1030, 100, "Bus");


        // f1.run();
        // f2.run();
        // f3.run();
        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);
        Thread t3 = new Thread(f3);
        t1.start();
        t2.start();
        t3.start();

    }

}

class Myframe extends JFrame implements Runnable {
    JTextField ta = new JTextField(20);
    String title;

    Myframe(int w, int h, int x, int y, String title) {
        super(title);
        this.title = title;
        super.setSize(w, h);
        super.setLocation(x, y);
        super.setVisible(true);
        super.setLayout(new FlowLayout());
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.add(ta);

    }

    @Override
    public void run() {

        for (int i = 0; i <= 1000000; i++) {
            ta.setText("" + i);

        }

    }

}