public class JuiceExample {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

    }
}

interface Machine {
    void maintainance();
}

class JuiceMachine implements Machine {

    @Override
    public void maintainance() {
        System.out.println("Maintenance Done...");
    }

    public Jucie makeJuice(Fruit fruit, Sugar sugar,  int quantity){

        return new Jucie();
    }

}

enum JuiceType {

    MANGO,
    ORNAGE,
    BANANA,
    APPLE,
    GRAPES
}

class Jucie {

    String quality;
    int quantity;
    JuiceType juiceType;

}