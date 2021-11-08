
package lab6.organization;

import java.util.LinkedList;

public class Person {
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected FullName name;
    protected Date birthDate;
    protected Gender gender;
    protected Address homeAddress;
    protected Phone phone;
    private LinkedList<Hospital> hospitals = new LinkedList<>();

}

