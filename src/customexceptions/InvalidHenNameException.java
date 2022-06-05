package customexceptions;

public class InvalidHenNameException extends Exception  {

    public InvalidHenNameException() {

        System.out.println("Invalid Name. min lenght should be 5 characters ");
    }

}
