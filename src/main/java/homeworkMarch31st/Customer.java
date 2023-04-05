package homeworkMarch31st;

import homeworkMarch31st.Addresssub_package.Address;

public class Customer {
    // Create a Customer class to include customerName, address,
    // email and Product[] purchasedProducts
    // Add a getCustomerInfo method to display detailed customer information
    // along with products purchased from customer
    private String customerName;
    private String email;
    private Product[] purchasedProducts;
    private String customerInfo;
    private Address[] address;
    public void addAddress(Address[] address) {
//        Address[0] = address;
    }

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    public Customer(String customerName, String email, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public void addAddress() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getCustomerInfo() {
        String customerInfo = "";
        System.out.println("Customer Info");
        System.out.println("-------------");
        customerInfo = "Name: " + customerName + "\n" +
                "Email: " + email + "\n\n" + "Items Purchased:\n" + "---------------"
        + "\n";

        for (Product product : purchasedProducts) {
            customerInfo += product.getProductName() + ": $" +
                    product.getPrice() + "\n";
        }
        return customerInfo;
    }
}
