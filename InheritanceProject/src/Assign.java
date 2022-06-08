enum AddressType {
    HOME,
    OFFICE
}





public class Assign {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Address homeAddress = new Address(1, 9, "CBD Belapur", "Navi Mumbai", "Maharastra", 400614, AddressType.HOME);
        Address officeAddress = new Address(4, 7, "Nerul", "Navi Mumbai", "Maharastra", 400674, AddressType.OFFICE);




        Employee emp4 = new Employee('M', 25, "Vishal", homeAddress, officeAddress, 133, "RITS","CSE", 123, "SBI", "Mgr Systems", 50000);
        

        System.out.println(emp4);


        officeAddress.hno= 458;
        
        System.out.println(emp4);

        System.out.println(officeAddress);

    }

}





class Address {

    int hno;
    int sector;
    String vtc;
    String city;
    String state;
    AddressType addressType;

    int pin;

    public Address(int hno, int sector, String vtc, String city, String state, int pin, AddressType addressType) {
        this.hno = hno;
        this.sector = sector;
        this.vtc = vtc;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "Address [addressType=" + addressType + ", city=" + city + ", hno=" + hno + ", pin=" + pin + ", sector="
                + sector + ", state=" + state + ", vtc=" + vtc + "]";
    }

}




class Person {

    char gender;
    int age;
    String name;
    Address homeAddress;
    Address officeAddress;

    public Person(char gender, int age, String name, Address homeAddress, Address officeAddress) {
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.homeAddress = homeAddress;
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", gender=" + gender + ", homeAddress=" + homeAddress + ", name=" + name
                + ", officeAddress=" + officeAddress + "]";
    }

    // public Person(char gender, int age, String name) {
    // this.gender = gender;
    // this.age = age;
    // this.name = name;
    // }

    // @Override
    // public String toString() {
    // return "Person [age=" + age + ", gender=" + gender + ", name=" + name + "]";
    // }

}

class Student extends Person {

    int roll;
    String collegeName;
    String stream;

    public Student(char gender, int age, String name, Address homeAddress, Address officeAddress, int roll,
            String collegeName, String stream) {
        super(gender, age, name, homeAddress, officeAddress);
        this.roll = roll;
        this.collegeName = collegeName;
        this.stream = stream;
    }

    @Override
    public String toString() {
        return super.toString() + " Student [collegeName=" + collegeName + ", roll=" + roll + ", stream=" + stream
                + "]";
    }

}

class Employee extends Student {

    int empno;
    String companyName;
    String designation;
    double salary;

    public Employee(char gender, int age, String name, Address homeAddress, Address officeAddress, int roll,
            String collegeName, String stream, int empno, String companyName, String designation, double salary) {
        super(gender, age, name, homeAddress, officeAddress, roll, collegeName, stream);
        this.empno = empno;
        this.companyName = companyName;
        this.designation = designation;
        this.salary = salary;
    }

  

    @Override
    public String toString() {
        return super.toString() + " Employee [companyName=" + companyName + ", designation=" + designation + ", empno="
                + empno
                + ", salary=" + salary + "]";
    }

}
