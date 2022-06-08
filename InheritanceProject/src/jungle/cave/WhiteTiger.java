package jungle.cave;

public class WhiteTiger extends Tiger{

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Tiger t = new Tiger();

        System.out.println(t.defaultA);
        // System.out.println(t.privateA);
        System.out.println(t.protectedA);
        System.out.println(t.publicA);
    }
   
    
}
