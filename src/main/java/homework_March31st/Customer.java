package homework_March31st;

import homework_March31st.address_sub_package.Address;

public class Customer {
    // Create a Customer class to include customerName, address,
    // email and Product[] purchasedProducts
    // Add a getCustomerInfo method to display detailed customer information
    // along with products purchased from customer
    private CustomerName customerName;
    private String email;
    private Product[] purchasedProducts;
    private String customerInfo;
    private Address[] addresses;
    private int numOfAddresses = 0;

    public Customer(CustomerName customerName, String email, Address[] addresses, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.addresses = addresses;
        this.purchasedProducts = purchasedProducts;
    }

    public void addAddress(Address address) {
        int i = 0;
        for (; i < addresses.length; i++) {
            if (addresses[i] == null) {
                break;
            }
        }
        addresses[i] = address;
        addresses[numOfAddresses++] = address;
    }

    public String getCustomerInfo() {
        String customerInfo = "";
        customerInfo = "Customer Info\n" + "---------------\n" +
                "Name: " + customerName.getFullName() + "\n" +
                "Email: " + email + "\n" + "" +
                "\nAddress(es):"
                + "\n";

        for (int i = 0; i < addresses.length; i++) {
            if (addresses[i] == null) {
                break;
            }
            customerInfo += addresses[i].getStreetNumber() + " "
                    + addresses[i].getStreetName() + " "
                    + addresses[i].getCity() + ", "
                    + addresses[i].getState() + " "
                    + addresses[i].getZipCode() + "\n";
        }
        customerInfo += "\nItems Purchased: \n" + "---------------\n";
        for (Product product : purchasedProducts) {
            customerInfo += product.getProductName() + ": $" +
                    product.getPrice() + "\n";
        }
        return customerInfo;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public void addAddress() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public void setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
    }
}
