package kata4;

public class Person {
    
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final String address;
    private final String city;
    private final String state;
    private final Mail mail;
    private final String web;

    public Person(String firstName, String lastName, String companyName, String address, String city, String state, Mail mail, String web) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.mail = mail;
        this.web = web;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Mail getMail() {
        return mail;
    }

    public String getWeb() {
        return web;
    }
    
    
    
}
