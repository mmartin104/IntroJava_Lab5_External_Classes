package edu.cscc;

public class Main {

    public static void main(String[] args) {

        // Initialize test data
        Address address = new Address("120 North Tulip Tree Drive",
                "Jackson", "OH", "45640");
        PersonName name = new PersonName("Dr.", "Adelaide", "Penelope",
                "Aardvark", null);
        PhoneNumber homephone = new PhoneNumber(740,555,1005);
        PhoneNumber workphone = new PhoneNumber(740, 555, 2356);
        PhoneNumber cellphone = new PhoneNumber(614, 555, 9723);

        // Create sample customer record
        CustomerRecord customer = new CustomerRecord(name,address,homephone,workphone,cellphone,
            "123456","Visa","4111-1111-1111-1111", "12/25");

        // Print customer record report
        String namerpt = "Name: " + customer.getName().toString();

        String addressrpt = "Address: " + address.getStreetAddress() + "\n" +
                "\t" + address.getCity() + ", " + address.getState() + " " + address.getZip();

        String phonerpt = "Home Phone: " + customer.getHomePhone().toString() + "\n" +
                "Work Phone: " + customer.getWorkPhone().toString() + "\n" +
                "Mobile Phone: " + customer.getCellPhone().toString();

        System.out.println(namerpt+"\n"+addressrpt+"\n"+phonerpt+"\n"+
                "Customer ID: "+customer.getCustomerID() + "\n"+
                "Credit card type: "+customer.getCreditCardType() + "\n"+
                "Credit card number: "+customer.getCreditCardNumber() + "\n"+
                "Credit card date: "+customer.getCreditCardDate());
        }
}
