package edu.cscc;

/**
 * PersonName class - name information
 * @author rplatt
 */
public class PersonName {
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    // Constructor
    public PersonName(String title, String firstName, String middleName, String lastName, String suffix) {
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    // Accessors / Mutators
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    // Other methods
    public String toString() {
        String fullName = firstName;
        // Middle name is optional
        if (middleName != null && (! "".equals(middleName))) {
            fullName = fullName + " " + middleName;
        }
        fullName = fullName + " " + lastName;
        // Title is optional
        if (title != null && (! "".equals(title))) {
            fullName = title + " " + fullName;
        }
        // Suffix is optional
        if (suffix != null && (! "".equals(suffix))) {
            fullName = fullName + " " + suffix;
        }
        return fullName;
    }
}
