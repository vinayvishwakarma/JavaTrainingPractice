import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class App {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Egg e1, e2, e3;
        e1=e2=e3=null;

        try {
            e1 = new Egg("Henen", 1);
            e2 = new Egg("ostrich", 2);
            e3 = new Egg("Birdy", 3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        System.out.println("-----------ArrayList Example---------");

        ArrayList<Egg> eggList = new ArrayList<Egg>();
        eggList.add(e1);
        eggList.add(e2);
        eggList.add(e3);

        for (Egg egg : eggList) {
            System.out.println(egg);
        }

        System.out.println("-----------LinkedList Example---------");

        LinkedList<Egg> eggLinkedList = new LinkedList<Egg>();
        eggLinkedList.add(e1);
        eggLinkedList.add(e2);
        eggLinkedList.add(e3);

        for (Egg egg : eggLinkedList) {
            System.out.println(egg);
        }

        System.out.println("-----------Treeset Example---------");

        TreeSet<Egg> eggTreeSet = new TreeSet<Egg>();

        eggTreeSet.add(e1);
        eggTreeSet.add(e2);
        eggTreeSet.add(e3);

        for (Egg egg : eggTreeSet) {
            System.out.println(egg);
        }

        System.out.println("-----------Hashset Example---------");

        HashSet<Egg> eggHashSet = new HashSet<Egg>();

        eggHashSet.add(e1);
        eggHashSet.add(e2);
        eggHashSet.add(e3);

        for (Egg egg : eggHashSet) {
            System.out.println(egg);
        }

    }
}
