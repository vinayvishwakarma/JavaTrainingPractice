public class GenericTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {


        Egg errArray[] = new Egg[12];

        for (int i = 0; i < errArray.length; i++) {
            

            errArray[i] = new Egg("Egg"+((int)Math.random()*10), "color"+((int)Math.random()*10), ((int)Math.random()*100));
        }


        for (Egg egg : errArray) {
            System.out.println(egg);
        }

    }

}

class Egg {
    String name;
    String color;
    int price;

    public Egg(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Egg [color=" + color + ", name=" + name + ", price=" + price + "]";
    }

}
