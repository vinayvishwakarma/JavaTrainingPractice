package exceptions;
public class EmployeeNotFoundException  extends RuntimeException{

    public EmployeeNotFoundException() {
        super("Employee not found Exception");
    }

    
    
}
