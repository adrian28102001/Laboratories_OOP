package lab6.organization;

import java.util.LinkedList;

public class Patient extends Person {
    protected String id;
    protected int age;
    protected Date accepted;
    protected History sickness;
    protected String[] prescriptions;
    protected String[] allergies;
    protected String[] specialRes;
    protected LinkedList<OperationsStaff> operationsStaffs = new LinkedList<>();
}
