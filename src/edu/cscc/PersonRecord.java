package edu.cscc;

/**
 * Created by bplatt on 6/27/2017.
 */
public class PersonRecord {
    private PersonName name;
    private Address address;
    private PhoneNumber homePhone;
    private PhoneNumber workPhone;
    private PhoneNumber cellPhone;


    // Constructor
    public PersonRecord(PersonName name, Address address, PhoneNumber homePhone,
                        PhoneNumber workPhone, PhoneNumber cellPhone) {
        this.name = name;
        this.address = address;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.cellPhone = cellPhone;
    }

    // Accessors / Mutators
    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(PhoneNumber homePhone) {
        this.homePhone = homePhone;
    }

    public PhoneNumber getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(PhoneNumber workPhone) {
        this.workPhone = workPhone;
    }

    public PhoneNumber getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(PhoneNumber cellPhone) {
        this.cellPhone = cellPhone;
    }
}