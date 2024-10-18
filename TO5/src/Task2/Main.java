package Task2;


//1.a Created a main class with a main method
public class Main {

    public static void main(String[] args) {

    //2.g A new instance of the Cafe class calling the loadMenuData() -method
    Cafe coffee = new Cafe();

        coffee.loadMenuData();

        //2.h Printing out all the elements in the list cofeeMenu from the Cafe instance just created
        System.out.println(coffee.getCoffeeMenu());
    }
}
