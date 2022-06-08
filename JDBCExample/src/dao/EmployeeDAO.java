package dao;
import java.sql.SQLException;
import java.util.List;

import exceptions.EmployeeNotFoundException;


public interface EmployeeDAO {

    void createEmployee(Employee empObj) throws EmployeeNotFoundException, SQLException;

    Employee readEmployee(int empNumber) throws SQLException;

    List<Employee> readAllEmployee() throws SQLException;

    void deleteEmployee(int empNumber) throws SQLException;

    void updateEmployee(Employee empObj) throws SQLException;

}
