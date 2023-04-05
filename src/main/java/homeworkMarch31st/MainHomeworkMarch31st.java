package homeworkMarch31st;

import homeworkMarch31st.Addresssub_package.Address;

public class MainHomeworkMarch31st {
    public static void main(String[] args) {
        // Create customer profile
        // Call out methods to add values to customerName, email, purchasedProducts, address
        // and boolean for isPrimaryAddress
        Address address1 = new Address(1990, "Enchanted Forest Ln.",
                "Mizrabel", "CA", 91121);
        Address address2 = new Address(500, "South Vista St.",
                "Burbank", "CA", 91521);

        Product product1 = new Product("Sega Genesis", 65);
        Product product2 = new Product("Castle of Illusion", 14.99);
        Product product3 = new Product("TV", 466.49);
        Customer customer1 = new Customer("Minnie Mouse",
                "MMouse28@segacorp.com", new Product[] {product1, product2, product3});

        String customerInfo1 = customer1.getCustomerInfo();

        Address[] addresses = {address1, address2};
        customer1.addAddress(addresses);
        address1.setPrimaryAddress(false);
        address2.setPrimaryAddress(true);

        System.out.println(customerInfo1);

    }
}
