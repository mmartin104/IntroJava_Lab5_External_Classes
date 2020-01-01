package edu.cscc;

/**
 * CustomerRecord class - customer information
 * @author Mark Martin
 */
public class CustomerRecord extends PersonRecord {
    private String customerID;
    private String creditCardType;
    private String creditCardNumber;
    private String creditCardDate;

    // Constructor
    public CustomerRecord(PersonName name, Address address, PhoneNumber homePhone, PhoneNumber workPhone, PhoneNumber cellPhone, String customerID, String creditCardType, String creditCardNumber, String creditCardDate) {
        super(name, address, homePhone, workPhone, cellPhone);
        this.customerID = customerID;
        this.creditCardType = creditCardType;
        this.creditCardNumber = creditCardNumber;
        this.creditCardDate = creditCardDate;
    }

    // Accessors / Mutators
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardDate() {
        return creditCardDate;
    }

    public void setCreditCardDate(String creditCardDate) {
        this.creditCardDate = creditCardDate;
    }

    // toString methods
    public String toString() {
        return "CustomerRecord{" +
                "customerID='" + customerID + '\'' +
                ", creditCardType='" + creditCardType + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", creditCardDate='" + creditCardDate + '\'' +
                '}';
    }
}
