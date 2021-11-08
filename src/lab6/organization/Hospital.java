package lab6.organization;

import java.util.LinkedList;

public class Hospital {
    protected String id;
    protected Address address;
    protected Phone phone;
    protected LinkedList<Department> departments = new LinkedList<>();
    protected LinkedList<Person> people = new LinkedList<>();
}
