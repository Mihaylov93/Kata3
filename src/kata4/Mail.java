package kata4;

class Mail {

    private String address;

    public Mail(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    
    public String getDomain(){
        return address.split("@")[1];
    }
    
}
