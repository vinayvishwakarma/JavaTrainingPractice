import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.Employee;
import dao.EmployeeDAOImpl;
import exceptions.EmployeeNotFoundException;


/*
 * Main class for running application
 */
public class DAOTest {

    
    /** 
     * @param args
     * @throws SQLException
     * @throws EmployeeAlreadyExist
     */
    public static void main(String[] args) throws SQLException, EmployeeAlreadyExist {
        int empNumber = 1258;
        EmployeeDAOImpl empDao = null;

        try {
            empDao = new EmployeeDAOImpl();

            while (true) {

                System.out.println("select operation \n 1 select \n 2 insert \n 3 update\n 4 delete \n 5 exit system");
                Scanner scanner = new Scanner(System.in);
                int selected = scanner.nextInt();

                try {

                    switch (selected) {
                        case 1:
                            System.out.println(empDao.readEmployee(empNumber));

                            break;
                        case 2:
                            empDao.createEmployee(getEmployeeObject());
                            break;
                        case 3:
                            empDao.updateEmployee(getEmployeeObjectForUpdate(empDao));
                            break;
                        case 4:
                            empDao.deleteEmployee(empNumber);
                            break;
                        default:
                            System.out.println("bye bye ......");
                            System.exit(0);

                    }
                } catch (EmployeeNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            empDao.closeResources();
        }
    }

    
    /** 
     * @param empDao
     * @return Employee
     * @throws SQLException
     */
    private static Employee getEmployeeObjectForUpdate(EmployeeDAOImpl empDao) throws SQLException {
        System.out.println("Trying to execute statement...");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
       

        System.out.println("Enter emp number : ");
        int empno = scan1.nextInt();


        Employee emp = empDao.readEmployee(empno);



        System.out.println("Enter new emp name to update  : ");
        String ename = scan1.next();

        emp.setEname(ename);


        

        return emp;
    }

    /**
     * Take the inputs from user and return the Employee Object
     * @return Employee
     */
    public static Employee getEmployeeObject() {

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
        int empno = scan1.nextInt();

        System.out.println("Enter new emp name   : ");
        String ename = scan1.next();

        System.out.println("Enter new emp job    : ");
        String job = scan1.next(); // new york

        System.out.println("Enter new emp manager: ");
        int mgr = scan4.nextInt();

        System.out.println("Enter new emp joining: ");
        String str = scan5.next();
        java.sql.Date hiredate = Date.valueOf(str);

        System.out.println("Enter new emp salary : ");
        int sal = scan6.nextInt();

        System.out.println("Enter new emp comm   : ");
        int comm = scan7.nextInt();

        System.out.println("Enter new dept num   : ");
        int deptno = scan8.nextInt();

        return new Employee(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }
}
