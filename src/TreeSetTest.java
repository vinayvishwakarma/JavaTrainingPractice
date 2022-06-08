import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Chemical c1 = new Chemical(10, 10, "H");
        Chemical c2 = new Chemical(2, 20, "M");
        Chemical c3 = new Chemical(43, 30, "N");
        Chemical c4 = new Chemical(5, 30, "N");
        Chemical c5 = new Chemical(12, 30, "N");
        Chemical c6 = new Chemical(-1, 60, "Y");

        TreeSet<Chemical> chemicalTreeSet = new TreeSet<Chemical>();

        HashSet<Chemical> chemicalHashSet = new HashSet<Chemical>();

        chemicalTreeSet.add(c1);
        chemicalTreeSet.add(c2);
        chemicalTreeSet.add(c3);
        chemicalTreeSet.add(c4);
        chemicalTreeSet.add(c5);
        chemicalTreeSet.add(c6);


        
        chemicalTreeSet.ceiling(new Chemical(4, 40, "Z"));

        chemicalHashSet.add(c1);
        chemicalHashSet.add(c2);
        chemicalHashSet.add(c3);
        chemicalHashSet.add(c4);
        chemicalHashSet.add(c5);
        chemicalHashSet.add(c6);

        for (Chemical chemical : chemicalTreeSet) {
            System.out.println(chemical);
        }

        for (Chemical chemical : chemicalHashSet) {
            System.out.println(chemical);
        }

        // System.out.println(chemicalTreeSet);


        // is this in binary TreeSet


    }
}

class Chemical implements Comparable<Chemical> {

    int atomicNumber;
    int atomicMass;
    String atomicFormula;

    public Chemical(int atomicNumber, int atomicMass, String atomicFormula) {
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.atomicFormula = atomicFormula;
    }

    @Override
    public int compareTo(Chemical c) {

        return Integer.compare(atomicNumber, c.atomicNumber);
    }

    @Override
    public String toString() {
        return "Chemical [atomicFormula=" + atomicFormula + ", atomicMass=" + atomicMass + ", atomicNumber="
                + atomicNumber + "]";
    }

}