package Task1;


    //1.a Customer class with 5 instance variable
public class Customer {

    String firstName;
    String lastName;
    String userName;
    int id;
    static int counter = 0;

    //1.b Customer contructor with 3 parameters
    public Customer(String firstName, String lastName, String userName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        //1.c A counter that goes up by 1 everytime the constructor is called. It also initializes "id"
        counter++;
        this.id = counter;

    }

    //1.d Getters and setters for all the instance variable
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //1.d A toString method that prints out the customers information
    public String toString() {

        return firstName + " " + lastName + " " + userName;
    }
}
