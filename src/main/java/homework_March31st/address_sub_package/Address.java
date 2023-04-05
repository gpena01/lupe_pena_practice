package homework_March31st.address_sub_package;

public class Address {
    private boolean isPrimaryAddress;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;

    public int getZipCode() {
        return zipCode;
    }

    public boolean isPrimaryAddress() {
        return isPrimaryAddress;
    }

    public Address(boolean isPrimaryAddress,
                   int streetNumber,
                   String streetName,
                   String city,
                   String state,
                   int zipCode) {
        this.isPrimaryAddress = isPrimaryAddress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

}
