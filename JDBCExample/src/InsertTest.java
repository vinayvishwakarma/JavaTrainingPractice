import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import exceptions.EmployeeNotFoundException;
import oracle.jdbc.pooling.Tuple;

public class InsertTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // 1. load the driver...
            System.out.println("Trying to load the driver...");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            System.out.println("Loaded the driver.....");

            System.out.println("Trying to connect to the DB...");
            conn = DriverManager.getConnection("jdbc:oracle:thin:"
                    + "@localhost:1521:xe",
                    "system", "sysgitc");
            System.out.println("connected to the db...." + conn);

            while (true) {

                System.out.println("select operation \n 1 select \n 2 insert \n 3 update\n 4 delete \n 5 exit system");
                Scanner scanner = new Scanner(System.in);
                int selected = scanner.nextInt();

                try {

                    switch (selected) {
                        case 1:
                            selectFucntion(conn, 0);
                            break;
                        case 2:
                            insertFucntion(conn);
                            break;
                        case 3:
                            updateFucntion(conn);
                            break;
                        case 4:
                            deleteFucntion(conn);
                            break;
                        default:
                            System.out.println("bye bye ......");
                            System.exit(0);

                    }
                } catch (EmployeeAlreadyExist | EmployeeNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {

            if (conn != null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

    }

    
    /** 
     * @param conn
     * @throws SQLException
     * @throws EmployeeAlreadyExist
     */
    public static void insertFucntion(Connection conn) throws SQLException, EmployeeAlreadyExist {

        System.out.println("Trying to create PreparedStatement...");
        PreparedStatement pst = conn.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?)");
        System.out.println("PreparedStatement created : " + pst);

        System.out.println("Trying to execute statement...");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        Scanner scan6 = new Scanner(System.in);
        Scanner scan7 = new Scanner(System.in);
        Scanner scan8 = new Scanner(System.in);

        System.out.println("Enter new emp number : ");
        int empNumber = scan1.nextInt();

        try {
            selectFucntion(conn, empNumber);
            throw new EmployeeAlreadyExist();

        } catch (EmployeeNotFoundException e) {
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("Enter new emp name   : ");
        String empName = scan1.next();

        System.out.println("Enter new emp job    : ");
        String empJob = scan1.next(); // new york

        System.out.println("datat");
        System.out.println(empNumber);
        System.out.println(empName);
        System.out.println(empJob);

        System.out.println("Enter new emp manager: ");
        int managerCode = scan4.nextInt();

        System.out.println("Enter new emp joining: ");
        String str = scan5.next();
        java.sql.Date doj = Date.valueOf(str);

        System.out.println("Enter new emp salary : ");
        double empSalary = scan6.nextDouble();

        System.out.println("Enter new emp comm   : ");
        double empComm = scan7.nextDouble();

        System.out.println("Enter new dept num   : ");
        int deptNumber = scan8.nextInt();

        pst.setInt(1, empNumber);
        pst.setString(2, empName);
        pst.setString(3, empJob);
        pst.setInt(4, managerCode);
        pst.setDate(5, doj);
        pst.setDouble(6, empSalary);
        pst.setDouble(7, empComm);
        pst.setInt(8, deptNumber);

        int rowsInserted = 0;
        try {
            rowsInserted = pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        pst.close();
        System.out.println("Statement executed : rows created : " + rowsInserted);
    }

    
    /** 
     * @param conn
     * @throws SQLException
     */
    public static void updateFucntion(Connection conn) throws SQLException {

        System.out.println("Trying to create PreparedStatement...");

        String sql = "UPDATE emp SET deptno=  ? WHERE empno = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        System.out.println("PreparedStatement created : " + pst);

        System.out.println("Trying to execute statement...");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter Existing emp number : ");
        int empNumber = scan1.nextInt();

        selectFucntion(conn, empNumber);

        System.out.println("Enter Emp Department No   : ");
        int dept = scan2.nextInt();

        pst.setInt(1, dept);
        pst.setInt(2, empNumber);

        int rowsInserted = 0;
        try {
            rowsInserted = pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        pst.close();
        System.out.println("Statement executed : rows updated : " + rowsInserted);
    }

    
    /** 
     * @param conn
     * @param empno
     * @return int
     * @throws SQLException
     */
    public static int selectFucntion(Connection conn, int empno) throws SQLException {
        int emp_id = 0;
        Statement stmt = conn.createStatement();

        if (empno == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Emp no :");
            empno = scanner.nextInt();
        }

        String sql = "select * from emp where empno = " + empno;

        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {

            System.out.println(
                    rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(8));
            emp_id = rs.getInt(1);
        } else
            throw new EmployeeNotFoundException();

        rs.close();
        stmt.close();

        return emp_id;
    }

    
    /** 
     * @param conn
     * @throws SQLException
     */
    public static void deleteFucntion(Connection conn) throws SQLException {

        System.out.println("Trying to create PreparedStatement...");

        String sql = "delete from emp  WHERE empno = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        System.out.println("PreparedStatement created : " + pst);

        System.out.println("Trying to execute statement...");
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter Existing emp number : ");
        int empNumber = scan1.nextInt();

        selectFucntion(conn, empNumber);

        pst.setInt(1, empNumber);

        int rowsInserted = 0;
        try {
            rowsInserted = pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        pst.close();
        System.out.println("Employee Deleted : " + rowsInserted);
    }

}