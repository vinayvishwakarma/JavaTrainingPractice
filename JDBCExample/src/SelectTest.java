import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SelectTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Trying to connect the DB");

        try {

            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            System.out.println("Driver Loaded");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sysgitc");
            System.out.println("Connected to DB");

            Statement stmt = conn.createStatement();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Start Date: ");
            String strdate = scanner.next();

            System.out.println("End Date: ");
            String enddate = scanner.next();

            String sql = "select * from dept";
            sql = "select * from customer";
            sql = "select * from emp where hiredate BETWEEN '" + strdate + "' AND '" + enddate + "'";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        // system
        // sysgitc
    }
}
