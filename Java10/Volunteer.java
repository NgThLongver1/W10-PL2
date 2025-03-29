package Java10;

// Volunteer.java
public class Volunteer extends StaffMember implements Payable {

    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    @Override
    public double pay() {
        return 0.0; // Volunteers don't get paid
    }
}
