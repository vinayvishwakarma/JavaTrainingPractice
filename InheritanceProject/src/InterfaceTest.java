
public class InterfaceTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int N = 32;
        int max = 0;

        String b = Integer.toBinaryString(N);
      
        for (int i = 0; i < b.length(); i++) {

            char c = b.charAt(i);

            if (c == '1') {
                int ln = 0;

                for (int j = i + 1; j < b.length(); j++) {

                    if (b.substring(j).indexOf("1") == -1) {
                        ln = 0;
                        break;
                    }
                    if (b.charAt(j) == '1') {
                        i = j - 1;
                        break;
                    }

                    ln++;

                }

                if (max < ln)
                    max = ln;

            }
        }

        System.out.println(max);
    }
}
