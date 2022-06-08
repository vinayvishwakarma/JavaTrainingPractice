import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            al.add(i);
        }

        Iterator aliterator = al.iterator();

        while (aliterator.hasNext()) {
            System.out.println(aliterator.next());
        }

        ArrayList<Egg> arrayListEgg = new ArrayList<Egg>();

        arrayListEgg.add(new Egg("Eg1", "blue", 1));
        arrayListEgg.add(new Egg("Eg2", "green", 2));
        arrayListEgg.add(new Egg("Eg3", "yellow", 3));
        arrayListEgg.add(new Egg("Eg4", "orange", 4));

        for (Egg egg : arrayListEgg) {
            System.out.println(egg);
        }

    }

}
