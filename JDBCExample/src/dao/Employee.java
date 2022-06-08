package dao;

import java.sql.Date;

public class Employee {
    

    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private int sal;
    private int comm;
    private int deptno;

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Employee [comm=" + comm + ", deptno=" + deptno + ", empno=" + empno + ", ename=" + ename + ", hiredate="
                + hiredate + ", job=" + job + ", mgr=" + mgr + ", sal=" + sal + "]";
    }

    public Employee(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

  

    
    /** 
     * @return int
     */
    public int getEmpno() {
        return empno;
    }

    
    /** 
     * @param empno
     */
    public void setEmpno(int empno) {
        this.empno = empno;
    }

    
    /** 
     * @return String
     */
    public String getEname() {
        return ename;
    }

    
    /** 
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    
    /** 
     * @return String
     */
    public String getJob() {
        return job;
    }

    
    /** 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    
    /** 
     * @return int
     */
    public int getMgr() {
        return mgr;
    }

    
    /** 
     * @param mgr
     */
    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    
    /** 
     * @return Date
     */
    public Date getHiredate() {
        return hiredate;
    }

    
    /** 
     * @param hiredate
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    
    /** 
     * @return int
     */
    public int getSal() {
        return sal;
    }

    
    /** 
     * @param sal
     */
    public void setSal(int sal) {
        this.sal = sal;
    }

    
    /** 
     * @return int
     */
    public int getComm() {
        return comm;
    }

    
    /** 
     * @param comm
     */
    public void setComm(int comm) {
        this.comm = comm;
    }

    
    /** 
     * @return int
     */
    public int getDeptno() {
        return deptno;
    }

    
    /** 
     * @param deptno
     */
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

}
