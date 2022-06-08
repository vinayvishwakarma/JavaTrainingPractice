public class ThreadTest {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Chalk ch1 = new Chalk("Blue");
        Chalk ch2 = new Chalk("---------Green");
        Chalk ch3 = new Chalk("Yellow*********");
        Chalk ch4 = new Chalk("======Orange======");

        Thread t1 = new Thread(ch1);
        Thread t2 = new Thread(ch2);
        Thread t3 = new Thread(ch3);
        Thread t4 = new Thread(ch4);

        t1.start();
        
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);

        t3.start();
        t4.start();

        

        // Car car = new Car();
        // Train train = new Train();
        // Ship ship = new Ship();
        // Airplane airplance = new Airplane();

        // car.start();
        // train.start();
        // ship.start();
        // airplance.start();

    }
}

class Car extends Thread {

    public void run() {

        for (int i = 0; i < 1650; i++) {
            System.out.println("------CAR CAR------ " + i);
        }
    }
}

class Train extends Thread {

    public void run() {

        for (int i = 0; i < 1600; i++) {
            System.out.println("****TRAIN*****" + i);
        }
    }
}

class Ship extends Thread {

    public void run() {

        for (int i = 0; i < 2500; i++) {
            System.out.println("========SHIP========" + i);
        }
    }
}

class Airplane extends Thread {

    public void run() {

        for (int i = 0; i < 1500; i++) {
            System.out.println("///////Airplace/////////// " + i);
        }
    }

}

class Stone {

}

class Chalk extends Stone implements Runnable {
    String color;

    public Chalk(String color) {
        this.color = color;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(color);

        }
    }

}