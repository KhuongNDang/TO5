package Task2;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//2.c Created a Cafe c lass with an instance variable called coffeMenu of type ArrayList<String>
public class Cafe {

    private ArrayList<String> coffeeMenu;


    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    //2.c A getter method that returns the list
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    //2.c A method called loadMenuData
    //2.d Using a scanner object to scan the file. Wrapped aorund a try -catch block.
    //2.e Using a while loop with the hasNextLine() and nextLine() -methods called on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
    public void loadMenuData() {
        try {
            File file = new File("C:\\Users\\khnda\\IdeaProjects\\TO5\\coffee.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}

