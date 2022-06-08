import customexceptions.InvalidHenNameException;

public class Egg implements Comparable<Egg> {

    String name;
    int price;

    public Egg(String name, int price) throws InvalidHenNameException {

        if (name.length() < 5) {
            throw new InvalidHenNameException();

        }

        this.name = name;
        this.price = price;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Egg [name=" + name + ", price=" + price + "]";
    }

    
    /** 
     * @param egg
     * @return int
     */
    @Override
    public int compareTo(Egg egg) {
        // TODO Auto-generated method stub

        if (this.name.equals(egg.name))
            return 0;
        return 1;
    }

}
