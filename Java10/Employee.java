package Java10;

// Employee.java
public class Employee extends StaffMember implements Payable {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    @Override
    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber;
    }
}