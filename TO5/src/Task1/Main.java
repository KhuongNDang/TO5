package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //1.e Created an arraylist with the name "customerArr"
        ArrayList<String> customersArr = new ArrayList<String>();

        Customer customer1 = new Customer("Khuong", "Dang", "khda");
        Customer customer2 = new Customer("Alex", "Brondbjerg", "albr");
        Customer customer3 = new Customer("Oscar", "Bojesen", "osbo");
        Customer customer4 = new Customer("Ayman", "Chaykh", "aych");

        //1.e Created and instantiated 4 customer objects
        customersArr.add(customer1.toString());
        customersArr.add(customer2.toString());
        customersArr.add(customer3.toString());
        customersArr.add(customer4.toString());

        printCustomers(customersArr);
    }

        //1.f A method that prints out all the customers by  running through the "customerArr" with a for each loop
    public static void printCustomers(ArrayList<String> customer){
        for (String customers : customer) {
            System.out.println(customers);
        }
    }
}
