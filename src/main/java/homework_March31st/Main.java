package homework_March31st;

import homework_March31st.address_sub_package.Address;

public class Main {
    public static void main(String[] args) {
        // Create customer profile
        // Call out methods to add values to customerName, email, purchasedProducts, address
        // and boolean for isPrimaryAddress

        CustomerName name = new CustomerName("Minnie", "", "Mouse");

        Address address1 = new Address(false,
                1990,
                "Enchanted Forest Ln.",
                "Mizrabel",
                "CA",
                91121);

        Address address2 = new Address(true,
                500,
                "South Vista St.",
                "Burbank",
                "CA",
                91521);

        Product product1 = new Product("Sega Genesis", 65);
        Product product2 = new Product("Castle of Illusion", 14.99);
        Product product3 = new Product("TV", 466.49);

        Customer customer1 = new Customer(name,
                "MMouse28@segacorp.com",
                new Address[]{address1, address2},
                new Product[]{product1, product2, product3});

        String customerInfo1 = customer1.getCustomerInfo();

        System.out.println(customerInfo1);

    }
}
