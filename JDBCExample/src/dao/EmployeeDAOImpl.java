package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exceptions.EmployeeNotFoundException;


/*
 * Employee DAO Class
 */
public class EmployeeDAOImpl implements EmployeeDAO {
    Connection conn;

    /**
     * Employee DAO Constructor which register the oracle JDBC Driver.
     * @throws SQLException
     */
    public EmployeeDAOImpl() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        System.out.println("Driver Loaded");
        this.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sysgitc");

    }

    /**
     * close the DB Connection and release the resource
     * @throws SQLException
     */
    public void closeResources() throws SQLException {

        conn.close();
        System.out.println("Connection is closed");
    }

  /**
   * 
   * save the employee in database
   */
    @Override
    public void createEmployee(Employee empObj) throws EmployeeNotFoundException, SQLException {

        PreparedStatement pst = conn.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?)");

        pst.setInt(1, empObj.getEmpno());
        pst.setString(2, empObj.getEname());
        pst.setString(3, empObj.getJob());
        pst.setInt(4, empObj.getMgr());
        pst.setDate(5, empObj.getHiredate());
        pst.setDouble(6, empObj.getSal());
        pst.setDouble(7, empObj.getComm());
        pst.setInt(8, empObj.getComm());

        int rowsInserted = pst.executeUpdate();
        pst.close();
        System.out.println("Statement executed : rows created : " + rowsInserted);

    }

    
    /** 
     * @param empNumber
     * @return Employee
     * @throws SQLException
     */
    @Override
    public Employee readEmployee(int empNumber) throws SQLException {

        Statement stmt = conn.createStatement();

        String sql = "select * from emp where empno = " + empNumber;

        ResultSet rs = stmt.executeQuery(sql);
        Employee emp = null;
        if (rs.next()) {

            emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
                    rs.getInt(6),
                    rs.getInt(7), rs.getInt(8));

        } else
            throw new EmployeeNotFoundException();

        rs.close();
        stmt.close();

        return emp;

    }

    
    /** 
     * @return List<Employee>
     * @throws SQLException
     */
    @Override
    public List<Employee> readAllEmployee() throws SQLException {

        List<Employee> empList = new ArrayList<Employee>();

        Statement stmt = conn.createStatement();

        String sql = "select * from emp";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            empList.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
                    rs.getInt(6),
                    rs.getInt(7), rs.getInt(8)));

        }
        rs.close();
        stmt.close();

        return empList;
    }

    
    /** 
     * @param empNumber
     * @throws SQLException
     */
    @Override
    public void deleteEmployee(int empNumber) throws SQLException {

        String sql = "delete from emp  WHERE empno = ?";
        PreparedStatement pst = conn.prepareStatement(sql);

        readEmployee(empNumber);

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

    
    /** 
     * @param empObj
     * @throws SQLException
     */
    @Override
    public void updateEmployee(Employee empObj) throws SQLException {

        String sql = "UPDATE emp SET ename=? WHERE empno = ?";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setInt(2, empObj.getEmpno());
        pst.setString(1, empObj.getEname());
        
        int rowsInserted = pst.executeUpdate();
        pst.close();
        System.out.println("Statement executed : rows updated : " + rowsInserted);
    }

}
